public class VariablesExample {
    @SuppressWarnings("WeakerAccess")
    boolean statusOn;

    @SuppressWarnings("unused")
    double javaVar = 2.34;

    public static void main(String[] args) {
        //noinspection unused
        int itemsSold = 0b1101;

        //noinspection unused
        double salary = 1.234e3;

        //noinspection unused
        float itemCost = 11.0f;

        //noinspection unused
        int i = 0xFd45, k$;

        //noinspection unused
        double _interestRate;
    }

    @SuppressWarnings("unused")
    public void javaMethod() {
        long simpleVar = 1_000_000_000_000L;
        byte byteVar2 = 123;
        System.out.println(statusOn);
    }
}
