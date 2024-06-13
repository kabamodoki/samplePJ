FROM quay.io/keycloak/keycloak:latest
COPY keycloak_conf/*.json /config/
CMD ["start-dev", "--http-port=8080", "--import-realm=/config/my_realm.json"]
