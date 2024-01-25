/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inherintance;

public class Persegi extends BangunDatar{
    double sisi;
    
    double luas(){
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }   
        double keliling(){
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
}
