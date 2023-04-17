package org.example;

import java.util.*;
import java.lang.Comparable;
import java.util.TreeSet;
import java.util.Set;
import org.example.Parent;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.lang.String;
import java.util.HashMap;


public class Child extends Parent{

    public Child(String name, String pesel, int age, String address) {
        super(name, pesel, age, address);
    }
    Child firstChild = new Child("Maks", "21233000111", 1, "Gdańsk");
    Child secondChild = new Child("Zosia", "22293000222", 0, "Gdańsk");
    Child thirdChild = new Child("Ramona", "21231500333", 1, "Gdynia");
    Child fourthChild = new Child("Debora", "20233088777", 2, "Gdynia");
    Child fifthChild = new Child("Ania", "22290974747", 0, "Rotmanka");

    public Child(String name, String pesel, int age, String address, Child firstChild, Child secondChild, Child thirdChild, Child fourthChild, Child fifthChild) {
        super(name, pesel, age, address);
        this.firstChild = firstChild;
        this.secondChild = secondChild;
        this.thirdChild = thirdChild;
        this.fourthChild = fourthChild;
        this.fifthChild = fifthChild;
    }

    public Child getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(Child firstChild) {
        this.firstChild = firstChild;
    }

    public Child getSecondChild() {
        return secondChild;
    }

    public void setSecondChild(Child secondChild) {
        this.secondChild = secondChild;
    }

    public Child getThirdChild() {
        return thirdChild;
    }

    public void setThirdChild(Child thirdChild) {
        this.thirdChild = thirdChild;
    }

    public Child getFourthChild() {
        return fourthChild;
    }

    public void setFourthChild(Child fourthChild) {
        this.fourthChild = fourthChild;
    }

    public Child getFifthChild() {
        return fifthChild;
    }

    public void setFifthChild(Child fifthChild) {
        this.fifthChild = fifthChild;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Child child = (Child) o;
        return Objects.equals(firstChild, child.firstChild) && Objects.equals(secondChild, child.secondChild) && Objects.equals(thirdChild, child.thirdChild) && Objects.equals(fourthChild, child.fourthChild) && Objects.equals(fifthChild, child.fifthChild);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstChild, secondChild, thirdChild, fourthChild, fifthChild);
    }


    Set<Child> childs = new TreeSet<Child>();
    {
    childs.add(firstChild);
    childs.add(secondChild);
    childs.add(thirdChild);
    childs.add(fourthChild);
    childs.add(fifthChild);
    }

    Map<Integer, Child> map = new HashMap<>();

    {
        map.put(1, firstChild);
        map.put(2, secondChild);
        map.put(3, thirdChild);
        map.put(4, fourthChild);
        map.put(5, fifthChild);
    }

//    SortedSet<String> childs = new TreeSet<>();
//    childs.add("Maks");
//    childs.add("Zosia");
//    childs.add("Ramona");
//    childs.add("Debora");
//    childs.add("Ania");
}