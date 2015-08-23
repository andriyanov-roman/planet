package planet;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by oleksii on 20.08.15.
 */
public class Utils {
    public static String hash(String str)
    {
        String sHash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            sHash = (new HexBinaryAdapter()).marshal(md.digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sHash;
    }
}
