package JavaBasic;

import java.math.BigInteger;

public class ViDuBigInteger {
    public static void main(String[] args) {
        BigInteger s = new BigInteger("923465273465728346578234657236573456789");
        BigInteger t = new BigInteger("597238457293804572389405723849057234957");
        BigInteger tong = s.add(t);
        BigInteger hieu = s.subtract(t);
        BigInteger tich = s.multiply(t);
        BigInteger thuong = s.divide(t);
        BigInteger du = s.mod(t);
        BigInteger res = s.modPow(new BigInteger("1000"), t); // res = (s^1000) % t
    }
}
