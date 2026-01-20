package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users;
    public UserRepository() {
        users = new ArrayList<User>();
        users.add(new User(1,"Marco"));
        users.add(new User(2,"Simone"));
        users.add(new User(3,"Andrea"));
    }
    public Optional<User> findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
