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
public class leapyear {
      public static void main(String[] args) {
        Scanner leap=new Scanner(System.in);
        System.out.println("Enter a Year");
        int year=leap.nextInt();
        
        if((year%4==0)&&(year%100!=0)||year%400==0){
             System.out.println(year+":is a Leap Year.");}
        
        else{  System.out.println(year+":is a not Leap Year.");}
        
          
      }}
