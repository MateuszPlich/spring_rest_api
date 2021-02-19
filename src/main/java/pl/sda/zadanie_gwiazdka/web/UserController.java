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
@RequestMapping("${user.path}")
public class UserController {
    List<User> listOfUsers = new ArrayList<>();
    List<Address> listOfAllAddresses = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(listOfUsers);
    }

    @GetMapping("${user.path.get}")
    public ResponseEntity<User> getUser(@PathVariable int id) {
        return ResponseEntity.ok(listOfUsers.get(id));
        //todo ustawić wyjątek
    }


    @PostMapping("${user.path.post}")
    public void createUser(@RequestParam(value= "name") String name,@RequestParam(value= "surname") String surname){
        User user=new User(name,surname);
        user.setId((long) listOfUsers.size());
        listOfUsers.add(user);
    }


    @PostMapping("${user.path.update}")
        public void setAddressToUser(@RequestParam(value = "userId") int userId,@RequestParam(value = "addressId") int addressId){
    listOfUsers.get(userId).getAddressesList().add(listOfAllAddresses.get(addressId));
    }



    //TODO: dodać metody addUserToAddress(), addAddressToUser(), dodać POSTY na user i address,
    // dodać GET wyciąganie adresów z użytkownika, wyciąganie użytowników z adresu


}
