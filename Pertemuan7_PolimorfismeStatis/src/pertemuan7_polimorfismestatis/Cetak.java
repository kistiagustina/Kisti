/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7_polimorfismestatis;

/**
 *
 * @author KISTIII
 */
public class Cetak {

   static double maxNumber(double a, double b){
       if (a<b){
           return a;
       }else{
           return b;
       }
    }
    public static void main(String[]args){
        System.out.println(maxNumber(4.5, 7.7));
        System.out.println(maxNumber(20,30));
    }
}
