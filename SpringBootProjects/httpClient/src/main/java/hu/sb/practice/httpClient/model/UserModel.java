package hu.sb.practice.httpClient.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private Long id;
    private String name;
    private String email;
    private AddressModel address;
    private String phone;
    private String website;
    private CompanyModel company;
}
