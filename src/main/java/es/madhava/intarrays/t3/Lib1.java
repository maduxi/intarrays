/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.intarrays.t3;

import java.util.HashSet;
import java.util.Set;



/**
 * Return the longest set we can return by visiting the array following its values.
 * @author madhava
 */
public class Lib1 {

    public int solution(int[] A) {
        int maxSize=0;
        for(int i=0;i<A.length;i++){
            maxSize = Math.max(maxSize, getSetSize(A,i));
        }
        return maxSize;
    }

    private int getSetSize(int[] A, int i) {
        Set<Integer> indexes = new HashSet<Integer>();
        //We want to stop before visiting the same element twice
        while(!indexes.contains(i)){
            indexes.add(i);
            i = A[i];
        }
        //How many indexes we have visited? This works fine because input elements are all distinct.
        return indexes.size();
    }
}
