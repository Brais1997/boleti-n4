/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2.pkg3;

import java.util.Scanner;

/**
 *
 * @author balvarezescudero
 */
public class Bol23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float euros,cambio;
      Scanner obx =new Scanner(System.in);
      System.out.print("Euros=");
      euros=obx.nextFloat();
      System.out.print("Cambio=");
      cambio=obx.nextFloat();
      System.out.print("Dólares="+euros*cambio+"$");
    }
    
}
