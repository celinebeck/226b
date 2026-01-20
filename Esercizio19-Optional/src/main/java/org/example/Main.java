package org.example;

import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        for (int i = 1; i < 11; i++) {
            Optional<User> risultato = userRepository.findById(i);
            if (risultato.isPresent()) {
                System.out.println("Utente trovato "+risultato.get().getName());
            }
            else {
                System.out.println("Utente non trovato");
            }
        }
    }
}