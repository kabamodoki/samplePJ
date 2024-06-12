#FROM jboss/keycloak:latest
FROM quay.io/keycloak/keycloak:latest 
COPY keycloak_conf/*.json /config/
CMD ["-b", "0.0.0.0", "-Dkeycloak.import=/config/my_realm.json"]