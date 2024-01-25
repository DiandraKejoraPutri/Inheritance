/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inherintance;

public class Segitiga extends BangunDatar{
    double alas;
    double tinggi;
    
    double luas(){
        double luas = 1/2 * (alas * tinggi);
        System.out.println("Luas segitiga :"+luas);
        return luas;
    }
}
