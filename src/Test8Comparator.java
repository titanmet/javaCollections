import java.util.*;

public class Test8Comparator {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("elefant");
        animals.add("dog");
        animals.add("cat");
        animals.add("ha");
        animals.add("frog");
        animals.add("bird");
        animals.add("a");

        Collections.sort(animals);
        System.out.println(animals);
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(0);
        number.add(500);
        number.add(100);

        Collections.sort(number);
        System.out.println(number);
        Collections.sort(number,new BackwardsIntegerComparator());
        System.out.println(number);
        Collections.sort(number, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(number);

        List<Person1> people = new ArrayList<>();
        people.add(new Person1(3,"Stiv"));
        people.add(new Person1(1,"Bob"));
        people.add(new Person1(2,"Sven"));
        Collections.sort(people, new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(people);

    }
}

class Person1 {
    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
//        o1 > o2 => 1;
//        o1 < o2 => -1;
//        o1 == o2 => 0;
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}

