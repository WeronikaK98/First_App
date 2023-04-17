package org.example;

import java.util.*;

public class Parent {
    String name;
    String pesel;
    int age;
    String address;
    public Parent(String name, String pesel, int age, String address) {
        this.name = name;
        this.pesel = pesel;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Parent parent = new Parent("Weronika", "98030800999", 25, "Gdańsk");
    Parent parent2 = new Parent("Julia", "96112100258", 27, "Gdynia");
    Parent parent3 = new Parent ("Mikołaj", "97121277888", 26, "Rotmanka");

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent1 = (Parent) o;
        return age == parent1.age && Objects.equals(name, parent1.name) && Objects.equals(pesel, parent1.pesel) && Objects.equals(address, parent1.address) && Objects.equals(parent, parent1.parent) && Objects.equals(parent2, parent1.parent2) && Objects.equals(parent3, parent1.parent3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pesel, age, address, parent, parent2, parent3);
    }

    Set<Parent> parents = new TreeSet<Parent>();
    {
        parents.add(parent);
        parents.add(parent2);
        parents.add(parent3);
    }

    Map<Integer, Parent> map = new HashMap<>();

    {
        map.put(1, parent);
        map.put(2, parent2);
        map.put(3, parent3);
    }

//    SortedSet<Parent> parents = new TreeSet<Parent>();
//    parents.add(parent);
//    parents.add(parent2);
//    parents.add(parent3);
}

