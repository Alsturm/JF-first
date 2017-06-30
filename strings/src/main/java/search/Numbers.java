package search;

public class Numbers {

    public static void main(String[] args) {

        int[] numbers = {4, 45, 123, 247, 754, 901};

        int indexOfMax = 0;
        int max = getSumOfDigits(numbers[indexOfMax]);
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int sumOfDigits = getSumOfDigits(number);
            if (sumOfDigits > max) {
                indexOfMax = i;
                max = sumOfDigits;
            }
        }
        System.out.printf("The integer with the highest sum of all the digits, is %d", numbers[indexOfMax]);
    }

    private static int getSumOfDigits(int number) {
        String digits = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < digits.length(); i++)
            sum += Integer.parseInt(
                    String.valueOf(
                            digits.charAt(i)));

        return sum;
    }


// 4
// 4+5=9
// 1+2+3=6
// 2+4+7=13
// 7+5+4=16
// 9+0+1=10

// The integer with the highest sum of all the digits, is 754

    /*
    - convert each integer, into a string
    -- in this way, you can get the charAt()
    */
}