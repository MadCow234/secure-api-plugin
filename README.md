# secure-api-plugin

Grails 3 plugin that adds a secure /api/ route using Spring Security.
Secure route uses a JSON Web Token in concert with database roles for authentication.
Contains an unauthenticated /register/ endpoint for users to add themselves to the database.
Allows the application to use Spring Security's @Secured annotation on Controllers.
