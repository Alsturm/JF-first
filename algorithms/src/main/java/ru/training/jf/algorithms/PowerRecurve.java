package ru.training.jf.algorithms;

import java.math.BigInteger;

public class PowerRecurve {
    private static BigInteger result;
    //Get rid of recurve fork using variable temp
    private static BigInteger temp;

    public static BigInteger pow(BigInteger basis, int power) {
        if (power == 0)
            return new BigInteger(("1"));
        temp = pow(basis, power >> 1);
        result = temp.multiply(temp);
        if ((power & 1) == 1)
            result = result.multiply(basis);
        return result;
    }
}
