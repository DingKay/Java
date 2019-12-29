package plugin.encryption.aes;

import com.dk.util.Out;

import javax.crypto.Cipher;
import java.security.Key;

/**
 * to encrypt or decrypt String with java 'Cipher'
 * @author DingKai
 * @version 1.0
 */
public class AesTest {
    public static void main(String[] args) {
        AesUtils aesUtils = AesUtils.instance;
        Key key = aesUtils.keyGenerator();
        System.out.println("key = " + key);
        byte[] encryptString = aesUtils.encrypt(key, "这是一条 crypto String : 123", Cipher.ENCRYPT_MODE);
        String s = "";

        for (byte b : encryptString) {
            s += b;
        }

        Out.print("encryptString = " + encryptString + "\n[byte==>" + s + "]");

        Out.printEqualSign(30);

        byte[] decryptionString = aesUtils.encrypt(key, s, Cipher.DECRYPT_MODE, encryptString);
        System.out.println(new String(decryptionString));
    }
}
