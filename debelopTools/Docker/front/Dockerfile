# Tomcatの公式イメージをベースに使用。Javaバージョンに注意して選択。
FROM tomcat:jdk17-temurin-jammy

# 不要なアプリケーションを削除
RUN rm -rf /usr/local/tomcat/webapps/*

# WARファイルをTomcatのwebappsディレクトリにコピー
COPY target/samplePJ-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# server.xmlをTomcatのconfディレクトリにコピー
COPY debelopTools/Docker/front/server.xml /usr/local/tomcat/conf

# Tomcatを起動するコマンド。これがコンテナのデフォルトの実行コマンドになる。
CMD ["catalina.sh", "run"]

# コンテナがリッスンするポートを指定
EXPOSE 8080