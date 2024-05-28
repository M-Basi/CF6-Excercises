package gr.aueb.excercises.ch12;

import gr.aueb.excercises.ch12.model.User;
import gr.aueb.excercises.ch12.model.UserCredentials;

public class Main {
    public static void main(String[] args) {
        User anna = new User(123456, "Anna", "Branckink");
        UserCredentials annaCred = new UserCredentials(123456, "Puppy", "123456789");

        System.out.println("Information of Anna");
        System.out.println("Id: " + anna.getId());
        System.out.println("Firstname: " + anna.getFirstname());
        System.out.println("Lastname: " + anna.getLastname());
        System.out.println();
        System.out.println("Anna's Credentials");
        System.out.println("Id: " + annaCred.getId());
        System.out.println("Username: " + annaCred.getUsername());
        System.out.println("Password: " + annaCred.getPassword());


    }
}
