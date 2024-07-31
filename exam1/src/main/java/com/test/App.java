package com.test;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args )
    {
       Person person = new Person("Jean-Paul", "Rouve");
       
       String json = convertToJson(person);
       System.out.println("Résultat JSON : " + json);
       
       String capitalizedString = capitalizeString("hello world");
       System.out.println("Résultat Chaîne de caractères en Majuscules : " + capitalizedString);
    }
    
    public static String convertToJson(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String capitalizeString(String str) {
        return StringUtils.capitalize(str);
    }
}
