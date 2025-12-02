package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtil {
    static {
        factory = new Configuration().configure().buildSessionFactory();
    }

    private static final SessionFactory factory;


}
/*
//encryption
Cipher instance
SecretkeySpec create krna hai
Cipher encrypt init krna hai
do final se ecrupt krna hai attribute
return krna hai base64 string

//decryption
 Cipher instance
SecretkeySpec create krna hai
Cipher encrypt init krna hai
base64 byte array lena hai
aur return krdenge
  */

