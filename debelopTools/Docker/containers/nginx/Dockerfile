# NGINXの公式イメージをベースにする
FROM nginx:latest

# default.confを無効化
RUN mv /etc/nginx/conf.d/default.conf /etc/nginx/conf.d/default.conf.bak

# 初期セットアップで反映するファイルをコピー
#COPY debelopTools/Docker/containers/nginx/nginx.conf /etc/nginx//default.conf

# EXPOSE 80

# CMD命令は1つだけを使用
CMD ["nginx", "-g", "daemon off;"]
