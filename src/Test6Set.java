import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test6Set {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        testSet(hashSet);
        System.out.println();
        testSet(linkedHashSet);
        System.out.println();
        testSet(treeSet);
        System.out.println();
        System.out.println(hashSet.contains("кот"));
        System.out.println(treeSet.isEmpty());
        System.out.println(hashSet);

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
//        union - объединение множеств
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);
//        intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
//            difference -  разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
    }

    public static void testSet(Set<String> set) {
        set.add("кот");
        set.add("собака");
        set.add("слон");
        set.add("обезьяна");
        set.add("гиппопотам");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
