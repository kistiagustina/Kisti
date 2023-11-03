/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;
public class mobil {
    static mobil1 Avanza = new mobil1 ();

public static void main(String[] args) {
     System.out.println("Ini adalah mobil Avanza");
     System.out.println("Warna Avanza : " + Avanza.warna);
     System.out.println("Merk Avanza : " + Avanza.merk);
     
     Avanza.maju();
     Avanza.mundur();
    }
    
}