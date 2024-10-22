/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Janvier
 */
public class arraynumbers {
    public static void main(String[] args) {
int[] array={10,12,34,23,56,78};
int sum=0;
for(int i=0;i<array.length;i++){
    sum+=array[i];
}
  double average=sum/array.length;  
     System.out.println("sum of elements="+sum);
      System.out.println("avarage of elements="+average);
    }
}