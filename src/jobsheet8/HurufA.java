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
public class HurufA {
    public static void main(String[] args){
      
        int x, y;
        for(x=1;x<=6;x++){
           for(y=1;y<=6;y++){
               if(x==1||x==3||y==1||y==6){
                   System.out.print("#");
                }
                else
                   System.out.print(" ");
           }
           System.out.println();
           }
    
    
    }
}

