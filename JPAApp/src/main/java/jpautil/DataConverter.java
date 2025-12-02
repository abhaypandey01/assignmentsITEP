package jpautil;

import jakarta.persistence.AttributeConverter;

public class DataConverter implements AttributeConverter<String, String> {

    @Override
    public String convertToDatabaseColumn(String attribute) {
        try{

        }catch(Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        return "";
    }
}
