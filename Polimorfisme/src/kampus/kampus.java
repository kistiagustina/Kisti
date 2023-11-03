/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kampus;

/**
 *
 * @author KISTIII
 */
public class kampus {

    public static void main(String[] args) {

Dosen dos = null;
 
Matkul matkul = new Matkul("Pemrograman II", "Kim Gimyung");
Sks jml_sks = new Sks("2", "Kim Gimyung");
dos = matkul;
 
System.out.println("");
dos.panggilDosen();
 
System.out.println("");
dos = jml_sks;
dos.panggilDosen();
}
 
}
    
    

