package pl.sda.zadanie_gwiazdka.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private String surname;
    private List<Long> addressesList;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addAddress(Address address) {
        addressesList.add(address.getId());
    }
}
