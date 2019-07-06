package basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsBasics {
    public static void main(String[] args) {
        StreamsBasics.streamFilter();
        StreamsBasics.streamFindAny();
        StreamsBasics.streamMap();
    }

    public static void streamFilter(){
        List list = Arrays.asList("kavin","kavin","bhaki");
        List newList = (List) list.stream().filter(l -> l.equals("kavin")).collect(Collectors.toList());
        newList.forEach(System.out::println);
    }

    public static void streamFindAny(){
        List<Person> persons = Arrays.asList(
                new Person("kavin", 2),
                new Person("seetha", 30),
                new Person("bhaki", 33)
        );
        Person person =  persons.stream().filter(l -> "kavin".equals(l.getName())).
                findAny().orElse(null);
        System.out.println(String.valueOf(person.age));
        System.out.println(String.valueOf(person.name));
    }
    public static void streamMap(){
        List<Person> persons = Arrays.asList(
                new Person("kavin", 2),
                new Person("seetha", 30),
                new Person("bhaki", 33)
        );
        String person =  persons.stream().filter(l -> "kavin".equals(l.getName())).
                map(Person::getName).findAny().orElse(null);
        System.out.println(String.valueOf(person));
    }

    public static class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
