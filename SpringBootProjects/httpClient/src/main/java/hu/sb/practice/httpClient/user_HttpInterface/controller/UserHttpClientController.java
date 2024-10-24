package hu.sb.practice.httpClient.user_HttpInterface.controller;

import hu.sb.practice.httpClient.model.UserModel;
import hu.sb.practice.httpClient.user_HttpInterface.service.UserHttpClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2/users")
public class UserHttpClientController {

    private final UserHttpClient userHttpClient;

    public UserHttpClientController(final UserHttpClient userHttpClient) {
        this.userHttpClient = userHttpClient;
    }

    @GetMapping
    public List<UserModel> getAllUsers() {
        return userHttpClient.findAll();
    }

    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable Long id) {
        return userHttpClient.findById(id);
    }

}
