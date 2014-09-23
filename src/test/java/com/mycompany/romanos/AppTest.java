package com.mycompany.romanos;

import com.mycompany.service.RomanNumberService;
import static junit.framework.Assert.assertEquals;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
    private String unit[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private String decena[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private String centena[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private String NULL = "Campo vacio";
    private String INVALID = "Numero invalido";
    private RomanNumberService service;
    
    public AppTest( String testName ){
        super( testName );
        service = RomanNumberService.getInstance();
    }

    public static Test suite(){
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testNotNull(){
        String response;
        String input = null;
        response = service.parseRoman(input);
        assertEquals(response, NULL);
    }
    
    public void testNumberChar(){
        String response;
        String input = "a";
        response = service.parseRoman(input);
        assertEquals(response, INVALID);
    }
    
    public void testNumberNegative(){
        String response;
        String input = "-10";
        response = service.parseRoman(input);
        assertEquals(response, INVALID);
    }
    
    public void testLowerLimit (){
        String response;
        String input = "0";
        response = service.parseRoman(input);
        assertEquals(response, INVALID);
    }
    
    public void testUpperLimit(){
        String response;
        String input = "1000";
        response = service.parseRoman(input);
        assertEquals(response, INVALID);
    }
    
    public void testUnits(){
        String response;
        int i = 1;
        while (i <= 9) {
            String input = String.valueOf(i);
            response = service.parseRoman(input);
            assertEquals(response, unit[i]);
            i++;
        }
    }
    
    public void testTens(){
        String response = null;
        int i = 10;
        while (i <= 90) {
            String input = String.valueOf(i);
            response = service.parseRoman(input);
            assertEquals(response, decena[i/10]);
            i=i+10;
        }
    }
    
    public void testHundreds(){
        String response;
        int i = 100;
        while (i <= 900) {
            String input = String.valueOf(i);
            response = service.parseRoman(input);
            assertEquals(response, centena[i/100]);
            i=i+100;
        }
    }
    
    public void testUnitsAndTens(){
        String response;
        String input = "11";
        response = service.parseRoman(input);
        assertEquals(response, "XI");
        
        input = "19";
        response = service.parseRoman(input);
        assertEquals(response, "XIX");
    }
    
    public void testTensAndHundreds(){
        String response;
        int i = 100;
        String input = "110";
        response = service.parseRoman(input);
        assertEquals(response, "CX");
        
        input = "190";
        response = service.parseRoman(input);
        assertEquals(response, "CXC");
    }
    
    public void testUnitsAndHundreds(){
        String response;
        String input = "101";
        response = service.parseRoman(input);
        assertEquals(response, "CI");
        
        input = "109";
        response = service.parseRoman(input);
        assertEquals(response, "CIX");
    }
    
    public void testUnitsTensHundreds(){
        String response;
        String input = "111";
        response = service.parseRoman(input);
        assertEquals(response, "CXI");
        
        input = "199";
        response = service.parseRoman(input);
        assertEquals(response, "CXCIX");
    }
}
