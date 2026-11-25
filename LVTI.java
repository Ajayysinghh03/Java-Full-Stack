public class LVTI {
    // Local Variable Type Inference
    // Introduces in Java 10

    public static void main(String[] args) {
        var a = 10;   // we can create variables using var but only for local variable for any type. Its neccesary to initialize it.
        // you can use var as keyword and also as variable name. means its not a reserved keyword. but class name cant be var
        String var = "adas";
        System.out.println(var);
        var nums = new int[10];

        //var obj = new classname(); , this is also valid
    }
}
