package secure.api.plugin

class UrlMappings {

    static mappings = {
        // Unauthenticated routes
        post "/register(.$format)?" (controller: "registration", action: "registerNewUser")

        // Authenticated routes
        group "/api", {

            group "/user", {
                get "(.$format)?"(controller: "user", action: "index")
                post "(.$format)?"(controller: "user", action: "save")

                group "/$id", {
                    get "(.$format)?"(controller: "user", action: "show")
                    put "(.$format)?"(controller: "user", action: "update")
                    delete "(.$format)?"(controller: "user", action: "delete")
                }
            }

            group "/role", {
                get "(.$format)?"(controller: "role", action: "index")
                post "(.$format)?"(controller: "role", action: "save")

                group "/$id", {
                    get "(.$format)?"(controller: "role", action: "show")
                    put "(.$format)?"(controller: "role", action: "update")
                    delete "(.$format)?"(controller: "role", action: "delete")
                }
            }

            group "/userRole", {
                get "(.$format)?"(controller: "userRole", action: "index")
                post "(.$format)?"(controller: "userRole", action: "save")

                group "/$id", {
                    get "(.$format)?"(controller: "userRole", action: "show")
                    put "(.$format)?"(controller: "userRole", action: "update")
                    delete "(.$format)?"(controller: "userRole", action: "delete")
                }
            }
        }
    }
}
