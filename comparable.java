import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student other){
        return this.age - other.age;
    }


}


public class comparable {
    //for natural order sorting

    public static void main(String[] args) {

    }
}
