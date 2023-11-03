/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kampus;

/**
 *
 * @author KISTIII
 */
public class Sks extends Dosen {

    public String sks;
 
/*-- constructor --*/
public Sks(String sks, String nama_dosen) {
super(nama_dosen);
this.sks = sks;
}
 
@Override
public void panggilDosen() {
System.out.println("Nama dosen: " + super.nama_dosen);
System.out.println("Jumlah SKS: " + sks);
}
}
    
    

