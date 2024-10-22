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
public class diamond {
    public static void main(String[] args) {
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter numbers of rowas");
 int rows=obj.nextInt();
 
 for(int i=1;i<=rows;i++){
  for(int j=i;j<rows;j++){
 System.out.print(" ");     
  }
  for(int j=1;j<=(2*i-1);j++){ //print stars
  System.out.print("*");
    }
        System.out.println(); //move to the next line
        
}
 for(int i=rows-1;i>=1;i--){
  for(int j=rows;j>i;j--){
      System.out.print(" ");
  }
    for(int j=1;j<=(2*i-1);j++){// print stars
  System.out.print("*");
    }
    System.out.println();
}}}