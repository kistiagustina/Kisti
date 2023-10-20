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
    
    Nilai.HitungNilai(99, "Kisti Agustina",1030);
    System.out.println(Nilai.HiTungNilai(75, "Sirva", 1036));
    MasterNilaiMahasiswa.HitungNiLAi(60, "Siska", 1023);
    System.out.println(MasterNilaiMahasiswa.HiTUNGNilai(10, "Frans", 1045));
       
    }
    
}

    