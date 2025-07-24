package BookMyShowLLD;

import BookMyShowLLD.Enums.City;

public class User {
    private String name;
    private Long phone;
    private City city;

    public User(String name, Long phone, City city) {
        this.name = name;
        this.phone = phone;
        this.city = city;
    }
}
