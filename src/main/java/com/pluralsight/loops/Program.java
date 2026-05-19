package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Sarah", "Johnson", 32));
        people.add(new Person("Michael", "Brown", 18));
        people.add(new Person("Emily", "Davis", 41));
        people.add(new Person("David", "Wilson", 29));
        people.add(new Person("Jessica", "Miller", 35));
        people.add(new Person("Daniel", "Taylor", 22));
        people.add(new Person("Ashley", "Anderson", 27));
        people.add(new Person("Chris", "Thomas", 50));
        people.add(new Person("Amanda", "Moore", 19));

        boolean isDone = false;
        while (!isDone) {
            System.out.println("\nSearch by:");
            System.out.println("1. First Name");
            System.out.println("2. Last Name");
            System.out.println("3. Exit");
            String choice = scanner.nextLine().trim();


            switch (choice) {
                case "1" -> {
                    System.out.print("Enter first name: ");
                    String name = scanner.nextLine().trim();
                    displayMatches(searchByFirst(people, name));
                }
                case "2" -> {
                    System.out.print("Enter last name: ");
                    String name = scanner.nextLine().trim();
                    displayMatches(searchByLast(people, name));
                }
                case "3" -> isDone = true;
                default -> System.out.println("Invalid input");
            }
        }
    }

    private static void displayMatches(List<Person> matches) {
        if (matches.isEmpty()) {
            System.out.println("No matches found");
        } else {
            for (Person person : matches) {
                System.out.println(person);
            }

        }
    }

    private static List<Person> searchByFirst(List<Person> people, String firstName) {
        List<Person> matches = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                matches.add(person);
            }
        }
        return matches;
    }

    private static List<Person> searchByLast(List<Person> people, String lastName) {
        List<Person> matches = new ArrayList<>();
        for (Person person : people) {
            if (person.getLastName().equalsIgnoreCase(lastName)) {
                matches.add(person);
            }
        }
        return matches;
    }

}
