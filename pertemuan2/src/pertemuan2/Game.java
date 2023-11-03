/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author KISTIII
 */
public class Game {
    public static void main(String[]args){
        Player petani=new Player();
        
        petani.name="Petani Tasya";
        petani.speed=78;
        petani.healthpoint=0;
        
        if(petani.IsDead()){
            
            System.out.println("Game Over");
        }
  }
}
