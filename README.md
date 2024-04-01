# プロジェクト構成
```
samplePJ
├─debelopTools
│  └─Docker
│      ├─postgres
│      │    └─init
│      │        └─other
│      └─front
│           └─conf
└─src
    └─main
        ├─java
        │  └─sample
        │      ├─common
        │      │  ├─dao
        │      │  │  ├─entity
        │      │  │  └─mapper
        │      │  ├─logic
        │      │  └─service
        │      │      └─impl
        │      └─thymeleaf
        │          └─web
        └─resources
            ├─META-INF
            ├─sample
            │  └─common
            │      └─dao
            │          └─mapper
            ├─static
            │  ├─css
            │  ├─icomoon
            │  │  └─fonts
            │  ├─images
            │  │  └─chocolat
            │  └─js
            └─templates
            
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

```
docker build -t <タグ名> .
```

```
docker run -d --name <コンテナ名を指定> -p 8080:8080 <タグ名>
```

```
docker exec -it [コンテナ名orID] /bin/bash
exit
```

```
docker start [コンテナ名orID]
docker stop [コンテナ名orID]
docker restart [コンテナ名orID]
```

```
docker images
```

```
docker ps
docker ps -a
```

```
docker logs [コンテナ名orID]
```

```
docker network ls
```

```
コンテナ内のファイルをホストにコピー:
docker cp [コンテナ名orID]:<コンテナ内パス> <ホストのパス>
```

```
ホストのファイルをコンテナにコピー:
docker cp <ホストのパス> [コンテナ名orID]:<コンテナ内パス>
```
