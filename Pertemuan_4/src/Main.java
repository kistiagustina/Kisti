/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author KISTIII
 */
public class Main {

   public static void main(String[] args) {
       
       Bangun_Datar Bangun_Datar = new Bangun_Datar();
       
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        Segitiga Segitiga = new Segitiga();
        Segitiga.alas = 10;
        Segitiga.tinggi = 20;
        
         Bangun_Datar.luas();
        Bangun_Datar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        Segitiga.luas();
        Segitiga.keliling();
        
    
    }
    
}
