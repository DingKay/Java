package plugin.encryption.aes;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

/**
 * @author DingKai
 * @Classname AESUtils
 * @Description TODO
 * @create 2019/3/15
 */
public class AESUtils {
    private AESUtils instance = new AESUtils();

    private AESUtils(){}

    public AESUtils getInstance(){
        return instance;
    }

    public String encrypt(String text){
        try {
            Cipher cipher =  Cipher.getInstance("AES");
//            cipher.init(Cipher.ENCRYPT_MODE, );
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
//    public static SecretKey getKey()
}
