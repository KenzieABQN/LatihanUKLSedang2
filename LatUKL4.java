/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latukl4;

/**
 *
 * @author Kenji
 */
import java.util.Scanner;
public class LatUKL4 {

static double VolTabung(double r, int t)
{
    double volume = 3.14 * r * t;
    
    return volume;
    
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jari-Jari Tabung: ");
        double r = input.nextFloat();
        System.out.print("Tinggi Tabung: ");
        int t = input.nextInt();
        System.out.print("Volume Tabung = " + VolTabung(r, t));
    }
}
