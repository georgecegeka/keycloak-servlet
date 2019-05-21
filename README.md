# Servlet based app - using embedded tomcat

# Purpose
  Integrate Keycloak with a Servlet based app using a confidential client

# Run Keycloak:
  1. docker run -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=password -p 8380:8080 jboss/keycloak:4.8.3.Final
  2. Open http://localhost:8380 and use admin/password as credentials

# Servlet app:
  1. mvn clean install
  2. mvn tomcat7:run
  2. http://localhost:9090/servletKeycloak/crocodiles, http://localhost:9090/servletKeycloak/spiders, http://localhost:9090/servletKeycloak/aliens
  
# Usefull links:
  1. Keycloak documentation - https://www.keycloak.org/docs/4.8/
  2. Java servlet adapter - https://www.keycloak.org/docs/4.8/securing_apps/index.html#_servlet_filter_adapter
  3. Generic Java adapter documentation, including keycloak.json info - https://www.keycloak.org/docs/4.8/securing_apps/index.html#java-adapters
