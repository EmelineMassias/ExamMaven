package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
  
{
    @Test
    public void testConvertToJson() {
        Person person = new Person("John", "Doe");
        String json = App.convertToJson(person);
        String expectedJson = "{\"firstName\":\"John\",\"lastName\":\"Doe\"}";
        Assert.assertEquals(json, expectedJson);
    }

    @Test
    public void testCapitalizeString() {
        String input = "hello world";
        String capitalized = App.capitalizeString(input);
        String expected = "Hello world";
        Assert.assertEquals(capitalized, expected);
    }
    
    
}
