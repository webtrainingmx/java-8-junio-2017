package base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Base64.html">base64</a>
 */
public class Base64EncodeAndDecode {
    public static void main(String args[]){
        Base64EncodeAndDecode base64EncodeAndDecode = new Base64EncodeAndDecode();
        base64EncodeAndDecode.init();
    }

    public void init(){

        String base64encodedString = encodeBasic("Base22");
        decode(base64encodedString);
        encodeURL("Base22");
        encodeMIME();

    }

    public String encodeBasic(String message){
        String base64encodedString= null;

        try {
            base64encodedString = Base64.getEncoder().encodeToString(message.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);
        return base64encodedString;
    }

    public void decode(String encodedMessage){
        byte[] base64decodedBytes = Base64.getDecoder().decode(encodedMessage);

        try {
            System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public void encodeURL(String message){
        String base64encodedString =null;

        try {
            base64encodedString = Base64.getUrlEncoder().encodeToString(message.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        System.out.println("Base64 Encoded String (URL) :" + base64encodedString);
    }

    public void encodeMIME(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 10; ++i) {
            stringBuilder.append(UUID.randomUUID().toString());
        }

        byte[] mimeBytes = new byte[0];
        try {
            mimeBytes = stringBuilder.toString().getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
        System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);
    }


}
