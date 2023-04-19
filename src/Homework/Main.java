package Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static  void main(String[] args){
        Person person = new Person("Ben",20,"Bonn");
        Person person1 = new Person("Mark",15,"Köln");
        Person person2 = new Person("Sussane",25,"München");
        Person person3 = new Person("Lena",30,"Ingolstadt");
        Person person4 = new Person("Tim",18,"Berlin");
        Person person5 = new Person("Viktor",12,"Kassel");
        List<Person> names = List.of(person,person1,person2,person3,person4,person5);
        names.stream()
                .filter(p->p.getAge()>17)
                .forEach(p-> System.out.println(p.getName()));
        /* Ben
          Sussane
          Lena
          Tim */

       /* public static List<Address>getAddresses(List<Person> input){
            getAddresses.stream()
                    .filter(Person->person.getAge()>17)
                    .forEach(Person->System.out.println(person.getName())); */


        }
        }




       /*Задача1
        Есть класс Address с полями
        String street
        int houseNumber

        и класс Person с полями
        String name
        int age
        Address address

        Используя стримы, написать метод, принимающий список персонов и возвращающий список адресов тех,
         кто старше 17 лет.
        List\<Address>getAddresses(List\<Person> input)

         */