/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

/**
 *
 * @author danodine
 */
public class Fibonacci {
  
    public Fibonacci() {    }
    public int[] hallarSerieFibonacci (int n)     {
        int [] vector = new int[n];
        vector[1] = 1;
        vector[2] = 1;
        int t1 = 1;
        int t2 = 1;
        for (int i=3; i<n; i++) {
            vector[i] = vector[i-1]+vector[i-2];
        }
        return vector;
    }
}

