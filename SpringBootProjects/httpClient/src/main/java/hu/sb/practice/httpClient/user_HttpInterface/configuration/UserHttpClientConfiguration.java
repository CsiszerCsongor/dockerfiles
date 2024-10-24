package hu.sb.practice.httpClient.user_HttpInterface.configuration;

import hu.sb.practice.httpClient.user_HttpInterface.service.UserHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import static hu.sb.practice.httpClient.common.Defaults.DEFAULT_USER_URL;

@Configuration
public class UserHttpClientConfiguration {

    @Bean
    public UserHttpClient userHttpClient(){
        RestClient restClient = RestClient.builder().baseUrl(DEFAULT_USER_URL).build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
        return factory.createClient(UserHttpClient.class);
    }

}
