/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package yafiadyatma.cobaproject;
import java.util.Scanner;


/**
 *
 * @author pc3
 */
public class Cobaproject {

    public static void main(String[] args) {
        
        Scanner data = new Scanner(System.in);
        
        System.out.println("/======================/");
        System.out.println("/       Cash Kuy       /");
        System.out.println("/======================/");
        System.out.println("Pilih Metode Pembayaran.");
        System.out.println("1. Tunai");
        System.out.println("2. Kredit");
        System.out.println("/======================/");
        System.out.println("Pilihan :               ");
        int total, metode;
         
        metode = data.nextInt();
        total = data.nextInt();

        
        if (metode == 1 ) {
            System.out.println("Masukkan Jumlah Uang : ");
            int jml = data.nextInt();
            int kembali = jml - total;
            System.out.println("Kembalian : "+ kembali);
        }else if (metode == 2) {
            System.out.println("Masukkan Jumlah Uang : ");
            int jmlcicil = data.nextInt();
            double bunga = 0.1 * total;
            double total_hutang = total + bunga;
            double cicilan = total_hutang / jmlcicil;
            System.out.println("Total Hutang : "+ total_hutang);
            System.out.println("Cicilan Perbulan : " + cicilan);
        }else{
            System.out.println("Metode Pembayaran Tidak Valid!");
        }
        
        
    }
}
