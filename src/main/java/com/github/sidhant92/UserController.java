package com.github.sidhant92;

import org.springframework.validation.annotation.Validated;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller ("/v1/users")
@Validated
public class UserController {
    @Inject
    private UserService userService;

    @Post ("/")
    public User createUser(@Body User user) {
        return userService.create(user);
    }
}
