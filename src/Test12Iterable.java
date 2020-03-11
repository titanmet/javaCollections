import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test12Iterable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
//        int idx = 0;
        while (iterator.hasNext()) {
//            if(idx == 1)
//            iterator.remove();
            System.out.println(iterator.next());
//            idx++;
        }

        System.out.println(list);

        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
