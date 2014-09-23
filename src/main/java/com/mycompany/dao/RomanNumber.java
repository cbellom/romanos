/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

/**
 *
 * @author Camilo
 */
public class RomanNumber {

    String unit[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String decena[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String centena[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

    public String[] getUnit() {
        return unit;
    }

    public void setUnit(String[] unit) {
        this.unit = unit;
    }

    public String[] getDecena() {
        return decena;
    }

    public void setDecena(String[] decena) {
        this.decena = decena;
    }

    public String[] getCentena() {
        return centena;
    }

    public void setCentena(String[] centena) {
        this.centena = centena;
    }
}
