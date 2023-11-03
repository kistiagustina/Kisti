/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kampus;

/**
 *
 * @author KISTIII
 */
public class Matkul extends Dosen {

    public String nama_matkul;
 

public Matkul(String nama_matkul, String nama_dosen) {
super(nama_dosen);
this.nama_matkul = nama_matkul;
}
 
@Override
public void panggilDosen() {
System.out.println("Nama dosen: " + super.nama_dosen);
System.out.println("Mata kuliah: " + nama_matkul);
    }
    
}
