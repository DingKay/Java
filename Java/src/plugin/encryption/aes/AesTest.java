package plugin.encryption.aes;

import com.dk.utils.DK;

import javax.crypto.Cipher;
import java.security.Key;

/**
 * @author DingKai
 * @Classname AesTest
 * @Description to encrypt or decrypt String with java 'Cipher'
 * @create 2019/4/22
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

        DK.print("encryptString = " + encryptString + "\n[byte==>" + s + "]");

        DK.printEqualSign();

        byte[] decryptionString = aesUtils.encrypt(key, s, Cipher.DECRYPT_MODE, encryptString);
        System.out.println(new String(decryptionString));
    }
}