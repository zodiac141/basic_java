package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ramesh", Gender.MALE),
                new Person("Suresh", Gender.MALE),
                new Person("Rajesh", Gender.MALE),
                new Person("Mahesh", Gender.MALE),
                new Person("Ramesh", Gender.FEMALE),
                new Person("Suresh", Gender.FEMALE),
                new Person("Rajesh", Gender.FEMALE),
                new Person("Mahesh", Gender.FEMALE)
        );
        //imperative approach

        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }
        //declarative approach
        List<Person> females2=
                 people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
         females2.forEach(System.out::println);
        
    }

        static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
