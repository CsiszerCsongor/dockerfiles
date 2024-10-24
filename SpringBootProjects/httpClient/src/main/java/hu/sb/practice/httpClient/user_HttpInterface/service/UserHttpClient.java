package hu.sb.practice.httpClient.user_HttpInterface.service;

import hu.sb.practice.httpClient.model.UserModel;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClient;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface UserHttpClient {

    @GetExchange("/users")
    List<UserModel> findAll();

    @GetExchange("/users/{id}")
    UserModel findById(@PathVariable Long id);

}
