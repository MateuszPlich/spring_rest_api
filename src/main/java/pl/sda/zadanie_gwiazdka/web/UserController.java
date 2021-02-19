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
@RequestMapping("${user.path}")
public class UserController {
Data data=new Data();

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(data.listOfUsers);
    }

    @GetMapping("${user.path.get}")
    public ResponseEntity<User> getUser(@PathVariable int id) {
        return ResponseEntity.ok(data.listOfUsers.get(id));
    }


    @PostMapping("${user.path.post}")
    public void createUser(@RequestParam(value= "name") String name,@RequestParam(value= "surname") String surname){
        User user=new User(name,surname);
        user.setId((long) data.listOfUsers.size());
        user.setAddressesList(new ArrayList<>());
        data.listOfUsers.add(user);
    }


    @PostMapping("${user.path.update}")
        public void setAddressToUser(@RequestParam int userId,@RequestParam int addressId){
        if (!data.listOfUsers.get(userId).getAddressesList().contains(data.listOfAddresses.get(addressId).getId())){
        data.listOfUsers.get(userId).addAddress(data.listOfAddresses.get(addressId));
        data.listOfAddresses.get(addressId).addUser(data.listOfUsers.get(userId));}
    // metoda nie działa na obiekty stworzone w trakcie działania programu, po odblokowaniu dodawania
        //użytkownika do adresu - wywołanie cykliczne, błąd!
    }



}
