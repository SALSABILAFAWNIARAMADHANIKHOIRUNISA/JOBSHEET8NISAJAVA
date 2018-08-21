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
public class HurufL {
    public static void main(String[] args){
        String identitas ="Salsabila Fawnia Ramadhani khoirunisa / X RPL 5 / 40";
        System.out.println("identitas : "+ identitas);
       int x,y;
       
       for(x=1;x<=6;x++){
           for(y=1;y<=5;y++){
               if(x==6||x==5||y==1||y==0){
                   System.out.print("@");
               }
               else
                   System.out.print(" ");
           }
           System.out.println();
       }
       
    }
}
           
       
    

