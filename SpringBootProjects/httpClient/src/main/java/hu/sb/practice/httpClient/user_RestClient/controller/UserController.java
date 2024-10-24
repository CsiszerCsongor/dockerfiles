package hu.sb.practice.httpClient.user_RestClient.controller;

import hu.sb.practice.httpClient.user_RestClient.service.UserService;
import hu.sb.practice.httpClient.model.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserService service;

    public UserController(final UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserModel> getAllUsers() {
        return service.userList();
    }

    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable Long id) {
        return service.getById(id);
    }

}
