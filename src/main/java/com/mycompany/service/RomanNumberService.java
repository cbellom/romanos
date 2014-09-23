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
    private String null_response = "Campo vacio";
    private String invalid_response = "Numero invalido";
    
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
        if(numberInput==null || "".equals(numberInput)){
            return null_response;
        }
        try {
            number = Integer.parseInt(numberInput);            
        } catch (NumberFormatException e) {
            return invalid_response;
        }
        if(number < 1 || number >999){
            return invalid_response;
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
