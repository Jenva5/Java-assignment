/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Janvier
 */
public class reversearray {
 public static void main(String[]args){
        int[] array = {3, 4, 6, 1, 9, 7, 5, 8};
        int a= array.length;

        // Reverse the array
        for (int i =0;i<a/2; i++) {
            int reverse = array[i];
            array[i] = array[a-1-i];
            array[a-1-i] =reverse;
        }

        // Print the reversed array
        for (int i=0;i<a;i++) {
            System.out.print(array[i] + " ");
        }}}
