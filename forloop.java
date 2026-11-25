import java.util.ArrayList;
import java.util.List;

public class forloop {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(32);
        int n = list.size();

        // there are thrre types of loops

        //Nromal for loop
        for(int i=0;i<n;i++){
            System.out.println(list.get(i));
        }

        // Enhanced for loop
        for(int ele : list){
            System.out.println(ele);
        }

        //forEach method from list class
        //list.forEach(n -> System.out.println(n));
    }
}
