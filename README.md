# プロジェクト構成
```
samplePJ
├─debelopTools
│  └─Docker
│      ├─containers
│      │    ├─postgres
│      │    │    ├─init
│      │    │    │   └─other
│      │    │    └─Dockerfile
│      │    ├─spring
│      │    │    ├─conf
│      │    │    │   └─server.xml
│      │    │    └─Dockerfile
│      │    ├─node
│      │    │    ├─node_modules
│      │    │    │   └─other
│      │    │    ├─Dockerfile
│      │    │    ├─package.json
│      │    │    └─package-lock.json
│      │    └─nginx
│      │         ├─nginx.conf
│      │         └─Dockerfile
│      └─docker-compose.yaml
├─src
│   └─main
│       ├─java
│       │  └─sample
│       │      ├─common
│       │      │  ├─dao
│       │      │  │  ├─entity
│       │      │  │  └─mapper
│       │      │  ├─logic
│       │      │  └─service
│       │      │      └─impl
│       │      └─thymeleaf
│       │          └─web
│       └─resources
│           ├─META-INF
│           ├─sample
│           │  └─common
│           │      └─dao
│           │          └─mapper
│           ├─static
│           │  ├─css
│           │  ├─icomoon
│           │  │  └─fonts
│           │  ├─images
│           │  │  └─chocolat
│           │  └─js
│           └─templates
└─target           
```

<p align="right">(<a href="#top">トップへ</a>)</p>

# 使用ツール
Mybatis Generator

<p align="right">(<a href="#top">トップへ</a>)</p>

# 環境
<!-- 言語、フレームワーク、ミドルウェア、インフラの一覧とバージョンを記載 -->

```
| 言語・フレームワーク  | バージョン  |
| ------------------ | ---------- |
| Java               | 17         |
| Spring Boot        | 3.0.0      |
| PostgreSQL         |            |
| Tomcat             |            |
| Docker             |            |
```
<p align="right">(<a href="#top">トップへ</a>)</p>

## 開発環境構築
<!-- コンテナの作成方法、パッケージのインストール方法など、開発環境構築に必要な情報を記載 -->

Notionで作成中のため、省略

##コマンド集

現在のディレクトリのDockerfileからイメージをビルド

```
docker build -t <タグ名> .
```

指定したタグのDockerイメージをバックグラウンドで実行し、名前を付け、ホストの8080ポートとコンテナの8080ポートを紐づける

```
docker run -d --name <コンテナ名を指定> -p 8080:8080 <タグ名>
```

指定したコンテナ内でインタラクティブなbashシェルを起動

現在のシェルセッションやログインセッションを終了

```
docker exec -it [コンテナ名orID] /bin/bash
exit
```

コンテナの起動、停止、再起動

```
docker start [コンテナ名orID]
docker stop [コンテナ名orID]
docker restart [コンテナ名orID]
```

ローカルに保存されているDockerイメージの一覧を表示

```
docker images
```

実行中のコンテナの一覧を表示
実行中、停止中を含むすべてのコンテナの一覧を表示

```
docker ps
docker ps -a
```

指定したコンテナのログを表示

```
docker logs [コンテナ名orID]
```

Dockerで作成されたネットワークの一覧を表示

```
docker network ls
```

コンテナ内のファイルをホストにコピー:

```
docker cp [コンテナ名orID]:<コンテナ内パス> <ホストのパス>
```

ホストのファイルをコンテナにコピー:

```
docker cp <ホストのパス> [コンテナ名orID]:<コンテナ内パス>
```
