/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

/**
 *
 * @author Hp
 */
public class TugasPraktikum2 {
    public static void main(String[] args){
        String identitas ="Salsabila Fawnia Ramadhani khoirunisa / X RPL 5 / 40";
        System.out.println("identitas : "+ identitas);
        
        //membuat variabel
        int x,y,z;
        
        //melakukan perulangan sebanyak x dan y kali
        for(x = 0; x <= 5; x++){
            for(y = 0; y <= 3; y ++){
                for(z = 0; z <= 3; z ++){
                    System.out.format("Perulangan [x=%d, y=%d, z=%d] %n", x, y, z);
                }
            }
        }
        
    }
    
}
