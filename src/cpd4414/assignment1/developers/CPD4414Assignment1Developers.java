/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.developers;

/**
 *
 * @author c0657966
 */
public class CPD4414Assignment1Developers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static String stringPower(String str, int a) {
        if (a < 1) {
            return null;
        } else if (a == 1) {
            return str;
        } else {
            return "";
        }
    }
}
