package plugin.encryption.aes;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

/**
 * @author DingKai
 * @Classname AESUtils
 * @Description TODO
 * @create 2019/3/15
 */
public class AesUtils {
    /**
     * 单例
     */
    public static AesUtils instance = new AesUtils();

    /**
     * 单例实现
     */
    private AesUtils(){}

    /**
     * 加/解密方法
     * @author DingKai
     * @date 2019/4/22
     * @param key
     * @param cryptoText
     * @param cryptoMode
     * @return byte[]
     * @exception IllegalBlockSizeException
     * @exception BadPaddingException
     * @exception InvalidKeyException
     * @exception NoSuchAlgorithmException
     * @exception NoSuchPaddingException
     */
    public byte[] encrypt(Key key, String cryptoText, int cryptoMode, byte[]... decryption){
        byte[] bytes = null;
        try {
            // generate Cipher Object
            Cipher cipher = Cipher.getInstance("AES");
            // initialize ... DECRYPT_MODE => encryption or decryption
            cipher.init(cryptoMode, key);
            // generate final crypto String or decryption String
            if (Cipher.ENCRYPT_MODE == cryptoMode) {
                bytes = cipher.doFinal(cryptoText.getBytes());
            } else {
                bytes = cipher.doFinal(decryption[0]);
            }


        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    /**
     * 生成加密密钥
     */
    public Key keyGenerator(){
        Key key = null;
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            key = keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return key;
    }
}
