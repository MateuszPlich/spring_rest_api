package pl.sda.zadanie_gwiazdka.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Address {

    private Long id;
    private String city;
    private String zipCode;
    private String streetName;
    private Long streetNumber;
    private List<User> usersList;

    public Address(String city, String zipCode, String streetName, Long streetNumber) {

        this.city = city;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public void addUser(User user){
        usersList.add(user);
    }


}
