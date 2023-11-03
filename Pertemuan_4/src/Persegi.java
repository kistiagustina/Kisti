/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author KISTIII
 */
public class Persegi extends Bangun_Datar {

    int sisi;
    
     @ Override
    float luas(){
         float sisi = 6;
        float luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    @Override
    float keliling(){
         int sisi = 6;
        float keliling = 4*sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
}
    
}

  
    
    

