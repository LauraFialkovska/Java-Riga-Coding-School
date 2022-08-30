package lesson_20220821;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5 {
    public String hashWithMD5(String value) throws Exception {
        MessageDigest algorithm = MessageDigest.getInstance("MD5");

        algorithm.update(value.getBytes(), 0, value.length());

        return new BigInteger(1, algorithm.digest()).toString(16);
    }

    public String getMD5(String value) {
        String md5 = null;

        try {
            md5 = hashWithMD5(value);
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        return md5;
    }

}
