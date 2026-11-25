import java.util.*;

sealed A permits A,B{

}

final class B extends A{

}

non-sealed class C extends A{

}

class D {

}



public class sealedClass {

    public static void main(String[] args) {
        // sealed class permits some choosen class to be inherited by them only. No other class can inherit them.
        // child class of sealed class must be final/sealed/non-sealed
        // if any other class try to inherit sealed class we got compile time error
        // if A permits B,C then B can permit D further. its totally correct.
        //non-sealed means that class is permitting every class to extend itself.
        // permit should be the last thing after extends and implements
        // same sealed class concept works in interface also
    }
}
