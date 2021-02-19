package pl.sda.zadanie_gwiazdka.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Address {

    private Long id;
    private String city;
    private String streetName;
    private Integer streetNumber;
    private List<Long> usersList;

    public Address(String city, String streetName, Integer streetNumber) {

        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public void addUser(User user){
        usersList.add(user.getId());
    }


}
