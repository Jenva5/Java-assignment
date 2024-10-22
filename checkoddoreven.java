/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;

/**
 *
 * @author Janvier
 */

import java.util.Scanner;
public class checkoddoreven {

    public static void main(String[] args) {
          
        Scanner check=new Scanner(System.in);
     System.out.println("Enter a number to be checked");
     int number=check.nextInt();
     if (number%2==0){
     System.out.println(number +":is an even number.");
    }
     else{
     System.out.println(number +":is an odd number.");     
     } 
}}

     
  
