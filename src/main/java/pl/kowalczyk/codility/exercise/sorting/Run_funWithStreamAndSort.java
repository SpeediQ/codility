package pl.kowalczyk.codility.exercise.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class Run_funWithStreamAndSort {

    public static void main(String[] args) {
        List<Person> people = generateListOfPeople();
        System.out.println(people);

        people.sort(Comparator.comparing(Person::getName));
        System.out.println(people);


        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getName().compareTo(o2.getName());
                if (result == 0) {
                    result = o1.getLastname().compareTo(o2.getLastname());
                    if (result == 0) {
                        result = o1.getAge() - o2.getAge();
                    }
                }
                return result;
            }
        });
        System.out.println("v1: " + people);
        System.out.println("Reset the list");
        people = generateListOfPeople();
        System.out.println(people);

        people.sort((o1, o2) -> {
            int result = o1.getName().compareTo(o2.getName());
            if (result == 0) {
                result = o1.getLastname().compareTo(o2.getLastname());
                if (result == 0) {
                    result = o1.getAge() - o2.getAge();
                }
            }
            return result;

        });

        System.out.println("v2: " + people);

        System.out.println("Reset the list");
        people = generateListOfPeople();
        System.out.println(people);

        people.stream()
                .filter(name -> name.getName().length() == 8)
                .forEach(System.out::println);

        List<Person> nextList = generateListOfPeople();
        nextList.stream()
                .filter(a -> a.getAge() >= 18)
                .map(s -> {
                    if (s.getName().endsWith("a")) {
                        return "Dziewczyna: " + s.getName();
                    }
                    return "Chłopak: " + s.getName();
                })
                .forEach(System.out::println);
        System.out.println("---------List with coma----------");
        List<Person> people_withComa = generateListOfPeople();
        Set<Person> a1 = generateListOfPeople().stream()
                .filter(a -> a.getName().endsWith("a"))
                .collect(Collectors.toSet());

        System.out.println("---------Array----------");
        int[] peopleArray = generateNumbers();
        System.out.println(Arrays.stream(peopleArray)
                .filter(s -> s >= 100)
                .count());


    }


    private static List<Person> generateListOfPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Marcin", "Kowalczyk", 29));
        people.add(new Person("Marcin", "Wojtyła", 30));
        people.add(new Person("Wojtek", "Pilch", 21));
        people.add(new Person("Konrad", "Pilch", 19));
        people.add(new Person("Alicja", "Łukaszenko", 28));
        people.add(new Person("Lucjan", "Ponitowski", 29));
        people.add(new Person("Weronika", "Ameba", 26));
        people.add(new Person("Weronika", "Ameba", 26));
        people.add(new Person("Weronika", "Botsa", 43));
        people.add(new Person("Weronika", "Botsa", 41));
        people.add(new Person("Weronika", "Podkowa", 31));
        people.add(new Person("Łukasz", "Piłotwarczyk", 48));
        people.add(new Person("Łukasz", "Piłotwarczyk", 48));

        return people;
    }

    private static int[] generateNumbers() {
        return new int[]{1, 5, 3, 6, 4, 8, 9, 10, 2156, 12, 320, 156, 12};
    }


}
