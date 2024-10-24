package hu.sb.practice.httpClient.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressModel {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private GeoModel geo;
}
