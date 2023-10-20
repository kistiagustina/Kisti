/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author KISTIII
 */
public class Player{
    String name;
    int speed;
    int healthpoint;
    
    void run(){
        System.out.println(name+"is running...");
        System.out.println("Speed"+speed);
    }
    boolean IsDead(){
        if(healthpoint<=0)
            return true;
        return false;
        
    }
    public static void main(String[]args){
        
    }
}
