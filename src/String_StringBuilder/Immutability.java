package String_StringBuilder;

public class Immutability {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        //both pointing to same object
        System.out.println(a == b);

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        //both pointing to different object and also outside pool
        System.out.println(name1 == name2);

        String c = "Hello";

        String d = c.concat("World");
        //we concatenate world with hello so it create new object, but nothing refers to that
        // c refers to "hello" and not "Hello world"
        System.out.println("c refers to: " + c);
        System.out.println("d refers to: " + d);
    }

}
