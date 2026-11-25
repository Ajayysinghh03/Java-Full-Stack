import java.util.*;
import java.util.stream.Stream;

public class StreamApi {
    //Stream is an interface
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);
        list.add(8967);
        list.add(24);

        Stream<Integer> s1 = list.stream();  // means stream is a method inside Stream that creates object for Stream
        // Also we can use object of stream at Once, thats why its called stream
        // every consecutive method of stream will provide new object so that we can use it again because priviously used to call current method
        //reduce will give single value not object

        int result = list.stream().filter(n-> n%2 == 0).map(n-> n*2).reduce(0, (a,b)-> a+b);
        // 3 object created here
        System.out.println(result);

        list.stream().filter(n-> n%2 == 0).sorted().forEach(n-> System.out.println(n));

        // Also there is parallelStream which we can use in place of stream, it uses multiple threads for faster computations but dont use with sorted() because for sorting need all number to the single threads

       // List<String> uname = names.stream().map(String::toUpperCase).toList(); , process inside map is called method reference which is showing that given method belongs to which class
        // unames.forEach(System.out :: println); Another example of method reference

        // Constructure reference will work similary to method referece and we as new as mwthod to create obj


    }
}
