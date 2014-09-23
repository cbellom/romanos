/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.RomanNumber;

/**
 *
 * @author Camilo
 */
public class RomanNumberService {

    private static RomanNumberService service = null;
    private RomanNumber romanNumber = new RomanNumber();
    private String NULL = "Campo vacio";
    private String INVALID = "Numero invalido";
    
    private RomanNumberService() {
    }

    private synchronized static void createInstance() {
        if (service == null) {
            service = new RomanNumberService();
        }
    }

    public static RomanNumberService getInstance() {
        if (service == null) {
            createInstance();
        }
        return service;
    }

    public String parseRoman(String numberInput) {
        int number;
        if(numberInput==null || numberInput.equals("")){
            return NULL;
        }
        try {
            number = Integer.parseInt(numberInput);            
        } catch (NumberFormatException e) {
            return INVALID;
        }
        if(number < 1 || number >999){
            return INVALID;
        }
        String response;
        int u = number % 10;
        int d = (number / 10) % 10;
        int c = number / 100;
        if (number >= 100) {
            response = romanNumber.getCentena()[c]+romanNumber.getDecena()[d]+romanNumber.getUnit()[u];
        } else {
            if (number >= 10) {
                response = romanNumber.getDecena()[d] + romanNumber.getUnit()[u];
            } else {
                response = romanNumber.getUnit()[number];
            }
        }
        return response;
    }
}
