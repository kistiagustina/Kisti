/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author KISTIII
 */
public class mobil1 {
String warna = "Merah";
    String merk = "BMW";
    
    void maju() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak maju");
    }
    
    void mundur() {
        System.out.println("Mobil " + merk + " warna " + warna + " bergerak mundur");
    }
    
    
    public static void main(String[] args) {
        
        mobil1 mobilSaya = new mobil1();
        
        
        mobilSaya.maju();
        mobilSaya.mundur();
    }
}
 
