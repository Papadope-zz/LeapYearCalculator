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
public class LeapYear {



    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("true");
                        return true;
                    }
                    System.out.println("false");
                    return false;
                }
                System.out.println("true");
                return true;
            }
        } else {
            System.out.println("false");
            return false;
        }
        System.out.println("false");
        return false;
    }
}
// second Solution

//    public static boolean isLeapYear(int year) {
//        if (year >= 1 && year <= 9999) {
//            if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
//                System.out.println("true");
//                return true;
//            }
//            else if ((year % 4 == 0) && (year % 100 != 0)){
//                System.out.println("true");
//                return true;
//            }
//            else {
//                System.out.println("false");
//                return false;
//            }
//                    
//        } else {
//            System.out.println("false");
//            return false;
//        }
//}
//}