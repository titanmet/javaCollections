import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(11);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.get(19));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

        list.remove(34);
        System.out.println(list);


        list = new LinkedList<>(list);
        list.remove(0);
        list.remove(0);
        System.out.println(list);

    }


}
