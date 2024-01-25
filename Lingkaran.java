/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inherintance;

public class Lingkaran extends BangunDatar{
    double r;
    
    double luas(){
    double luas =(double)(Math.PI * r* r);
     System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
    double keliling(){
        double keliling = (double)(2* Math.PI * r);
        System.out.println("Keliling Lingkaran: "+keliling);
        return keliling;
    }
}
