package hu.sb.practice.httpClient.user_RestClient.service;

import hu.sb.practice.httpClient.model.UserModel;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

import static hu.sb.practice.httpClient.common.Defaults.*;

@Service
public class UserService {

    private final RestClient restClient;

    public UserService(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl(DEFAULT_USER_URL)
                .build();
    }

    public List<UserModel> userList() {
        return restClient
                .get()
                .uri(GET_ALL_USER_ENDPOINT)
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }

    public UserModel getById(Long id){
        return restClient
                .get()
                .uri(GET_USER_ENDPOINT, id)
                .retrieve()
                .body(UserModel.class);
    }

}
