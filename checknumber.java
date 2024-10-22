/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Janvier
 */import java.util.Scanner;
public class checknumber{
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in); 
    System.out.println("Enter a number to be checked");
    double number=obj.nextDouble();
    if(number>0){
     System.out.println(number+":is positive");   
    }
    else if (number<0)
    { System.out.println(number+":is negative");
    }
    else{ 
        System.out.println(number+":is zero");
}}}
