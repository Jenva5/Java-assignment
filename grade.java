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
public class grade {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       System.out.println("enter  your Grade");
    char grade=obj.next().charAt(0);
    switch(grade){
        case'A':
        System.out.println("Exllent");
        break;
      case'B':
        System.out.println("Very Good");
        break;
        case'C':
        System.out.println("Good");
        break;
        case'D':
        System.out.println("Pass");
        break;
        case'F':
        System.out.println("Failed");
        break;
        default:
        System.out.println("Invalid grade");
        break;
        
    }
        
    
}}
