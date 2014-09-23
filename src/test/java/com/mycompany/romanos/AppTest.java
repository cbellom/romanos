package com.mycompany.romanos;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
    private String HUNDRED = "C";
    private String NINETY = "XC";
    private String FIFTY = "L";
    private String FORTY = "XL";
    private String TEN = "X";
    private String NINE = "IX";
    private String FIVE = "V";
    private String FOUR = "IV";
    private String ONE = "I";
    private String NULL = "Campo vacio";
    private String INVALID = "Numero invalido";
    
    public AppTest( String testName ){
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testNotNull(){
        String response = null;
        String input = null;
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, NULL);
    }
    
    public void testNumberChar(){
        String response = null;
        String input = "a";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, INVALID);
    }
    
    public void testNumberNegative(){
        String response = null;
        String input = "-10";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, INVALID);
    }
    
    public void testOne(){
        String response = null;
        String input = "1";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, ONE);
    }
    
    public void testFour(){
        String response = null;
        String input = "4";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, FOUR);
    }
    
    public void testFive(){
        String response = null;
        String input = "5";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, FIVE);
    }
    
    public void testNine(){
        String response = null;
        String input = "5";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, NINE);
    }
    
    public void testTen(){
        String response = null;
        String input = "10";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, TEN);
    }
    
    public void testForty(){
        String response = null;
        String input = "40";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, FORTY);
    }
    
    public void testFifty(){
        String response = null;
        String input = "50";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, FIFTY);
    }
    
    public void testNinety(){
        String response = null;
        String input = "90";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, NINETY);
    }
    
    public void testHundres(){
        String response = null;
        String input = "100";
//        response = RomanService.parseRoman(entrada);
        assertEquals(response, HUNDRED);
    }
}
