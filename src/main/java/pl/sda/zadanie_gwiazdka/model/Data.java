package pl.sda.zadanie_gwiazdka.model;

import java.util.ArrayList;
import java.util.List;

public class Data {
   public List<User> listOfUsers = new ArrayList<>(
           List.of(new User(0L,"Jan","Nowak",new ArrayList<>()),
                   new User(1L,"Krzysztof","Pazdan",new ArrayList<>()),
                   new User(2L,"Bożena","Bąk",new ArrayList<>()),
                   new User(3L,"Anna","Litwin",new ArrayList<>()))
   );
   public List<Address> listOfAddresses = new ArrayList<>(
           List.of(
                   new Address(0L,"Warszawa","Towarowa",1,new ArrayList<>()),
                   new Address(1L,"Bytom","Cmentarna",21,new ArrayList<>()),
                   new Address(2L,"Wrocław","Mostowa",6,new ArrayList<>()),
                   new Address(3L,"Poznań","Koziołkowa",2,new ArrayList<>())
                   )
   );



}
