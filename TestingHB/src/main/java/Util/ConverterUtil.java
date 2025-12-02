package Util;

import jakarta.persistence.AttributeConverter;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class ConverterUtil implements AttributeConverter<String, String> {

    private static final String SECRET_KEY = "MySuperSecretKey";
    private static final String ALGORITHM = "AES";

    @Override
    public String convertToDatabaseColumn(String attribute) {
        try{
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec specification = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, specification);
            byte[] encrypted = cipher.doFinal(attribute.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        try{
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec specification = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, specification);
            byte[] decoded = Base64.getDecoder().decode(dbData.getBytes());
            return new String(cipher.doFinal(decoded));
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
