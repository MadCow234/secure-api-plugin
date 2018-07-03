package secure.api.plugin.auth

import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY

class RegistrationController {

    RegistrationService registrationService

	static responseFormats = ['json', 'xml']
    static allowedMethods = [
            registerNewUser: "POST"
    ]

    def registerNewUser(User user) {
        if (!user.validate()) {
            respond user.errors, status: UNPROCESSABLE_ENTITY
            return
        }

        user = registrationService.registerNewUser(user.username, user.password)

        if (user.hasErrors()) {
            respond user.errors, status: UNPROCESSABLE_ENTITY

        } else {
            respond user, status: CREATED
        }

    }
}
