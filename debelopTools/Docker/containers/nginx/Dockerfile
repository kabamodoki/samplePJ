FROM nginx:latest

# 初期セットアップで反映するファイルをコピー
COPY debelopTools/Docker/containers/nginx/nginx.conf /etc/nginx/conf.d/app.conf

# 標準のnginx.confを使用しながら、追加の設定を含むapp.confを読み込む
# /etc/nginx/conf.d/ に配置された設定は自動的に読み込まれるため、特に指定する必要はありません。

# EXPOSE 80

# CMD命令は1つだけを使用
# CMD ["nginx", "-g", "daemon off;"]
