package util;

import jakarta.persistence.AttributeConverter;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class ConverterUtil implements AttributeConverter<String, String> {

    private static final String ALGORITHM = "AES";
    private static final String SECRET_KEY = "MySecretSuperKey";

    @Override
    public String convertToDatabaseColumn(String attribute) {
        try{
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec certificate = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, certificate);
            byte[] encrypted = cipher.doFinal(attribute.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        try{
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec certificate = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, certificate);
            byte[] dycripted = Base64.getDecoder().decode(dbData);
            String decodedString = new String(cipher.doFinal(dycripted));
            return decodedString;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
