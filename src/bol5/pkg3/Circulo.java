/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol5.pkg3;

/**
 *
 * @author Admin
 */
public class Circulo {
    public double radio;
    private final double Pi=3.14;
    public Circulo (){
    
}
    public Circulo(double radio){
      
        this.radio=radio;
    }
    public void setRadio(double ratio){
        double r = 0;
        this.radio=r;
    }
    public double getRadio(){
        return radio;
    }
    public double calArea(){
        return Pi*Math.pow(radio,2);
    }
    public double calLonxitude(){
        return 2*Pi*radio;
    }
}