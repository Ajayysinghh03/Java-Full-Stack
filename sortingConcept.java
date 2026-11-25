import java.util.*;

public class sortingConcept {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(343);
        list.add(3454);
        list.add(3);

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //used for custom ordering broo
                return o1 - o2;
            }
            // entire compare overriding in just one line using lambda expression
            // Comparable<Student> com = (i,j) -> i.age > j.age ? 1 : -1;
        };

        Collections.sort(list);
        System.out.println(list);


    }
}
