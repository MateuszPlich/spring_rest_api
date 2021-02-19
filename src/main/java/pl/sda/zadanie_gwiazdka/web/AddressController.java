package pl.sda.zadanie_gwiazdka.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.zadanie_gwiazdka.model.Address;
import pl.sda.zadanie_gwiazdka.model.User;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("${address.path}")
public class AddressController {
    List<User> listOfUsers = new ArrayList<>();
    List<Address> listOfAddresses = new ArrayList<>();


    @GetMapping
    public ResponseEntity<List<Address>> getAllAddresses() {
        return ResponseEntity.ok(listOfAddresses);
    }


    @GetMapping("${address.path.get}")
    public ResponseEntity<Address> getAddress(@PathVariable int id) {
        return ResponseEntity.ok(listOfAddresses.get(id));
    }


    @PostMapping("${address.path.post}")
    public void createAddress(
            @RequestParam(value = "city") String city,
            @RequestParam(value = "zipCode") String zipCode,
            @RequestParam(value = "streetName") String streetName,
            @RequestParam(value = "streetNumber") Long streetNumber) {
        Address address = new Address(city, zipCode, streetName, streetNumber);
        address.setId((long) listOfAddresses.size() + 1);
        listOfAddresses.add(address);
    }

    //TODO: dodać metody addUserToAddress(), addAddressToUser(), dodać POSTY na user i address,
    // dodać GET wyciąganie adresów z użytkownika, wyciąganie użytowników z adresu


}
