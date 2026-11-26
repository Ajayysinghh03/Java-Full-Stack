import java.util.*;
// canonical constructor is the default constructor inside record class, it has all the passed parameter which we defined in the class defination
// here those parameters are id and name
record Alien(int id, String name){}

public class recordClass {

    public static void main(String[] args) {
        // record class is used to only store records
        // record class internally override toString, compareTo method for comparing records
        // also internal default constructor automaticall set the passed values top each param
        // nearly 50 lines of code in just one line
        // we can create multiple constructors but each constructor should call that default canonical constructor using this keyword
        // All the variables here are actually private and final
        // record class cant extend any other class but can implement any number of interfaces
        // static varible can be declared inside {} part but instance var can only be declared only inside()
        
        Alien a1 = new Alien(1,"Ajay");
        Alien a2 = new Alien(2, "Om");
        Alien a3 = new Alien(1, "Ajay");

        System.out.println(a1);
        System.out.println(a1==a2);
        System.out.println(a1==a3);
        System.out.println(a1.equals(a3));

    }
}
