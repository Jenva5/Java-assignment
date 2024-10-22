/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Janvier
 */
public class largestelement {
    public static void main(String[] args) {
        int[] array = {34, 23, 12, 45, 67, 89, 234, 26, 10, 30, 43};
        int largest = array[0];

        // Find the largest element
        for (int i=0;i<array.length;i++) {
            if ( array[i]> largest) {
                largest =array[i];
            }
        }
        System.out.println("The largest element is: " + largest);
    }
} 

