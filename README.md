# spring-boot-security-rest-api-jwt-mongo
Complete spring boot application demo with rest api, jwt token and mongodb


# We have learnt following annotation, methods, integrations etc.
-   CommandlineRunner
-   Keep project structure according to the rules otherwise bean not found error will be comes up.
-   MongoDB integrations
-   @AllArgsConstructor -> Do not required to implement constructor
-   @EnableJPA/MongoReporsitories -> This annotation will use when your repositories will not find and gives an bean error
-   New user -> insert, update details -> save, Delete user -> delete with mongodb
-   @Transactional -> will use for update data but it won't work with MongoDB.
