/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyearcalculator;

/**
 *
 * @author User
 */
public class LeapYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LeapYear.isLeapYear(-1600);
        LeapYear.isLeapYear(1600);
        LeapYear.isLeapYear(2017);
        LeapYear.isLeapYear(2000);
    }
    
}
