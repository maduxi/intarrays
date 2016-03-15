/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.intarrays.t1;

import java.util.Arrays;

/**
 * Return median of an integer array. (N/2)-1 if odd number of elements.
 * @author madhava
 */
public class Lib1 {

    public int solution(int[] A) {
        int solution;
        Arrays.sort(A);
        int N = A.length;
        if (N % 2 == 0) {
            solution = A[N / 2];
        } else {
            solution = A[N-1 / 2];
        }
        return solution;
    }

}
