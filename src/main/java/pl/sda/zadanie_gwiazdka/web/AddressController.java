package pl.sda.zadanie_gwiazdka.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.zadanie_gwiazdka.model.Address;
import pl.sda.zadanie_gwiazdka.model.Data;
import pl.sda.zadanie_gwiazdka.model.User;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("${address.path}")
public class AddressController {
Data data=new Data();

    @GetMapping
    public ResponseEntity<List<Address>> getAllAddresses() {
        return ResponseEntity.ok(data.listOfAddresses);
    }


    @GetMapping("${address.path.get}")
    public ResponseEntity<Address> getAddress(@PathVariable int id) {
        return ResponseEntity.ok(data.listOfAddresses.get(id));
    }


    @PostMapping("${address.path.post}")
    public void createAddress(
            @RequestParam(value = "city") String city,
            @RequestParam(value = "streetName") String streetName,
            @RequestParam(value = "streetNumber") Integer streetNumber) {
        Address address = new Address(city, streetName, streetNumber);
        address.setId((long) data.listOfAddresses.size());
        address.setUsersList(new ArrayList<>());
        data.listOfAddresses.add(address);
        log.info("ListOfAddressesSize: "+ data.listOfAddresses.size());
    }

    //TODO: dodać metody addUserToAddress(), addAddressToUser(), dodać POSTY na user i address,
    // dodać GET wyciąganie adresów z użytkownika, wyciąganie użytowników z adresu


}
