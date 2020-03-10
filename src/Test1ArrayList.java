import java.util.ArrayList;
import java.util.List;

public class Test1ArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);
        List<Integer> list1 = new ArrayList<>(5);



        if (list == list1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (list.equals(list1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
