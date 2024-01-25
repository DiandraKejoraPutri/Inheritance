/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inherintance;

public class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;
    
    double luas(){
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang : "+luas);
        return luas;
    }
        double keliling(){
            double keliling = 2 * panjang * lebar ;
            System.out.println("Menghitung persegi panjang : "+keliling);
            return keliling;
        }
               
}
