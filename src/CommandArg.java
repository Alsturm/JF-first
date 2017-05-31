public class CommandArg {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++)
            System.out.printf("Аргумент %d = %s%n", i, args[i]);
    }
}
