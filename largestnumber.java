/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Janvier
 */
import java.util.Scanner;
public class largestnumber {
  public static void main(String[] args) {
     Scanner check=new Scanner(System.in); 
     System.out.println("Enter the first number");
     int a=check.nextInt();
     System.out.println("Enter the second number");
      int b=check.nextInt();
      System.out.println("Enter the third number");
      int c=check.nextInt();
      
      int largest;
      if (a>b&&a>c){
          largest=a;
      }
      else if(b>a&&b>c){
          largest=b;
      }
      else{largest=c;}
  System.out.println("the largest number is :"+largest);
  }  
}
