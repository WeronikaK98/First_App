package org.example;

import java.util.SortedSet;
import java.util.TreeSet;
//import package.Child.class
//import java.lang.runtime.SwitchBootstraps;
import java.util.SortedSet;
import java.util.TreeSet;
import org.example.Child;
import org.example.Parent;
import org.example.Lesson;
import org.example.SportActivity;
import org.example.ArtisticLessons;

public class Main {
    public static void main(String[] args)
    {
//        SortedSet<Child> childs = new TreeSet<Child>();
//        childs.add(firstChild);
//        childs.add(secondChild);
//        childs.add(thirdChild);
//        childs.add(fourthChild);
//        childs.add(fifthChild);

        int option = 2;
        int option2 = 1;

        System.out.println("Profil rodzica");

        switch (option)
        {
            case 1:
                System.out.println("Dane opiekuna");
                break;

            case 2:
                System.out.println("Moje dzieci");
                switch (option2) {
                    case 1:
                        System.out.println("Maks");
//                        Child firstChild = new Child("Maks", "21233000111", 1, "Gdańsk");
//                        System.out.println(firstChild.name);
//                        System.out.println(firstChild.pesel);
//                        System.out.println(firstChild.age);
//                        System.out.println(firstChild.address);
                        break;
                    case 2:
                        System.out.println("Zosia");
                        //wyświetlić secondChild z Child
                        break;
                    case 3:
                        System.out.println("Utwórz nowy profil");
                        //Child nextChild = new Child();
                        break;
                }

            case 3:
                System.out.println("Oferta");
                //wyświetlić obiekty z SportActivity i ArtisticLessons

        }
    }
}