/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;
public class mobil {
    static MasterMobil Avanza = new MasterMobil ();

public static void main(String[] args) {
     System.out.println("Ini adalah mobil Avanza");
     System.out.println("Warna Avanza : " + Avanza.warnaMobil);
     System.out.println("Merk Avanza : " + Avanza.merkMobil);
     System.out.println("Tahun Penerbitan : " + Avanza.tahunMobil);
     
     Avanza.berjalan();
     Avanza.berhenti();
    }
    
}