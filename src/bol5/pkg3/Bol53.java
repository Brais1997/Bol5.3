/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol5.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Bol53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        String arealonxitude=JOptionPane.showInputDialog("Radio");
          radio=Double.parseDouble(arealonxitude);
          Circulo cir= new Circulo(radio);
          JOptionPane.showMessageDialog(null,"Area"+ cir.calArea());
          JOptionPane.showMessageDialog(null,"Lonxitude"+ cir.calLonxitude());
    }
    
}
