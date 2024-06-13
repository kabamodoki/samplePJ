import express from 'express';
import session from 'express-session';
import Keycloak from 'keycloak-connect';
import { createClient } from 'redis';
import RedisStore from 'connect-redis';

const app = express();

// Redisクライアントの初期化
const redisClient = createClient();
redisClient.connect().catch(console.error);

// Redisストアの初期化
const redisStore = new RedisStore({
  client: redisClient,
  prefix: 'sess:',
  ttl: 86400 // セッションの有効期限を1日に設定
});

// セッションストレージの初期化
app.use(session({
  store: redisStore,
  secret: 'some secret',
  resave: false, // 必須：軽量セッションの維持を強制（タッチ）
  saveUninitialized: false, // 推奨：データが存在する場合にのみセッションを保存
  cookie: { secure: false } // テスト環境では secure を false に設定
}));

const keycloak = new Keycloak({}, redisStore);

app.use(keycloak.middleware());

app.get('/login', keycloak.protect(), (req, res) => {
  const user = req.kauth.grant.access_token.content.preferred_username;
  res.send(`Logged in as ${user}`);
});

app.listen(3000, () => {
  console.log('Server is running on http://localhost:3000');
});
