/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_5;

/**
 *
 * @author KISTIII
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai P = new Pegawai ();
        P.menampilkan();
        
        manager m = new manager ();
        m.nama = "Kisti";
        m.id_pegawai = 1;
        m.gaji = "10 juta";
        m.menampilkan();
        m.tugas();
        
        Koki K = new Koki();
        K.nama = "Vasco";
        K.id_pegawai = 2;
        K.gaji = "8 juta";
        K.menampilkan();
        K.Tugas();
        
        pelayan pl = new pelayan();
        pl.nama = "Gimyung";
        pl.id_pegawai = 3;
        pl.gaji = "6 juta";
        pl.menampilkan();
        pl.tugas();
       
    }
    
}
