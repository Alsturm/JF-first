package objects;

public class VarArgs {

    public static void printArgCount(Object... args) { // 1
        System.out.println("Object args: " + args.length);
    }

    public static void printArgCount(Integer... args) { // 2
        System.out.println("Integer[] args: " + args.length);
    }

    public static void printArgCount(int... args) { // 3
        System.out.print("int args: " + args.length);
    }

    public static void main(String[] args) {
        Integer[] i = { 1, 2, 3, 4, 5 };
        printArgCount(7, "No", true, null); // 1
        printArgCount(i, i, i); // 2
        printArgCount(i, 4, 71); //1
//        printArgCount(5, 7);
        printArgCount(i); // будет вызван метод 1 // 2
//        printArgCount((byte) 5, 7); //неопределенность, 1 или 3! // 3
    }
}
