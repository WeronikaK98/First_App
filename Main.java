package org.example;

import java.util.*;

import org.example.People.Child;
//import package.Child.class;
//import java.lang.runtime.SwitchBootstraps;
import java.util.SortedSet;
import java.util.TreeSet;
import org.example.People.Child;
import org.example.People.Parent;
import org.example.Lessons.Lesson;
import org.example.Lessons.SportActivity;
import org.example.Lessons.ArtisticLessons;
import java.util.logging.*;
import java.io.IOException;
import java.lang.Exception;

public class Main {
    public static void main(String[] args)
    {
//        SortedSet<Child> childs = new TreeSet<Child>();
//        childs.add(firstChild);
//        childs.add(secondChild);
//        childs.add(thirdChild);
//        childs.add(fourthChild);
//        childs.add(fifthChild);

//        int option = 2;
//        int option2 = 1;
        String login = "Weronika";
        String password = "1477";
        Logger logger = Logger.getLogger("org.example");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Profil rodzica");
        System.out.println("Zaloguj się");
        System.out.println("Login: " );

        Scanner console1 = new Scanner(System.in);
        String line1 = console1.nextLine();

        if (!line1.equals("Weronika"))
        {
            System.out.println("Nie znaleziono użytkownika");
            System.out.println("Upewnij się, że login jest poprawny");
            logger.log(Level.INFO, "Nieudana próba logowania");
            System.out.println("Login: " );
            line1 = console1.nextLine();
        } else {logger.log(Level.INFO, "Logowanie użytkownika");}

        System.out.println("Hasło: ");
//        Scanner console = new Scanner(System.in);
        String line = scanner.nextLine();

        if (!line.equals("1477")) {
            System.out.println("Nieprawidłowe hasło");
            System.out.println("Spróbuj ponownie");
            logger.log(Level.INFO, "Nieudana próba logowania");
            System.out.println("Hasło: ");
            line = scanner.nextLine();
        } else {
            System.out.println("Dzień dobry");
            logger.log(Level.INFO, "Logowanie użytkownika");
        }

        System.out.println("1. Dane opiekuna");
        System.out.println("2. Moje dzieci");
        System.out.println("3. Oferta");

//        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());

        switch (option)
        {
            case 1:
                System.out.println("Dane opiekuna");
                break;

            case 2:
                System.out.println("Moje dzieci");
                System.out.println("1. Maks");
                System.out.println("2. Zosia");
                System.out.println("3. Utwórz nowy profil");

//                Scanner scanner2 = new Scanner(System.in);
                int option2 = Integer.parseInt(scanner.nextLine());
                switch (option2) {
                    case 1:
                        System.out.println("Maks");
                        try {
                            Child firstChild = null;
                            System.out.println(firstChild.getName());
                            System.out.println(firstChild.getPesel());
                            System.out.println(firstChild.getAge());
                            System.out.println(firstChild.getAddress());
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            logger.log(Level.WARNING, "firstChild is null");
                            throw e;
                        }
                        break;
                    case 2:
                        System.out.println("Zosia");
                        try {
                            Child secondChild = null;
                            System.out.println(secondChild.getName());
                            System.out.println(secondChild.getPesel());
                            System.out.println(secondChild.getAge());
                            System.out.println(secondChild.getAddress());
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            logger.log(Level.WARNING, "secondChild is null");
                            throw e;
                        }
                        break;
                    case 3:
                        System.out.println("Utwórz nowy profil");
                        try {
                            Child nextChild = null;
                            System.out.println("Imię: ");
                            System.out.println("Pesel: ");
                            System.out.println("Wiek: ");
                            System.out.println("Adres: ");
                            logger.log(Level.INFO, "Utworzono nowy profil");
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            logger.log(Level.WARNING, "nextChild is null");
                            throw e;
                        }
                        break;
                }

            case 3:
                System.out.println("Oferta");
                //wyświetlić obiekty z SportActivity i ArtisticLessons

        }
    }
}

class CustomException extends Exception {
    public CustomException (String message) {
        super(message);
    }
}