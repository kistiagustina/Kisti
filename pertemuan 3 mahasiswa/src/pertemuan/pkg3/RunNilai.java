/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg3;

/**
 *
 * @author KISTIII
 */
public class RunNilai {
    
public static void main(String[] args) {
    MasterNilaiMahasiswa Nilai = new MasterNilaiMahasiswa();
    System.out.println("\t\tProgam Menghihitung Nilai Mahasiswa");
    
    Nilai.HitungNilai(75, "Dewi",1016);
    System.out.println(Nilai.HiTungNilai(95, "Kisti", 1030));
    MasterNilaiMahasiswa.HitungNiLAi(85, "Nuria", 1001);
    System.out.println(MasterNilaiMahasiswa.HiTUNGNilai(80, "Ara", 1002));
       
    }
    
}

    