import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test10Queue {
    public static void main(String[] args) {
        Person4 person41 = new Person4(1);
        Person4 person52 = new Person4(2);
        Person4 person63 = new Person4(3);
        Person4 person74 = new Person4(4);
        Person4 person85 = new Person4(5);

        Queue<Person4> person4Queue = new LinkedList<>();
        person4Queue.add(person41);
        person4Queue.add(person85);
        person4Queue.add(person63);
        person4Queue.add(person74);
        person4Queue.add(person52);

        for (Person4 person : person4Queue) {
            System.out.println(person);
        }

        System.out.println();

        Queue<Person4> person4QueueArray = new ArrayBlockingQueue<Person4>(3);
//        person4QueueArray.add(person74);
//        person4QueueArray.add(person85);
//        person4QueueArray.add(person52);
//        person4QueueArray.add(person41);

        System.out.println(person4QueueArray.offer(person74));
        System.out.println(person4QueueArray.offer(person85));
        System.out.println(person4QueueArray.offer(person52));
        System.out.println(person4QueueArray.offer(person41));

//        for (Person4 person2 : person4QueueArray) {
//            System.out.println(person2);
//        }
//        System.out.println();
//        System.out.println(person4QueueArray.remove());
//        System.out.println();
//        System.out.println(person4QueueArray.peek());
//        System.out.println(person4QueueArray);

        }
    }

class Person4 {
    private int id;

    public Person4(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                '}';
    }
}
