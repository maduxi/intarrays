/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.intarrays.t2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Return the most frequent element in an Intger array
 * @author madhava
 */
public class Lib1 {

    
    public int solution(int[] A) {
        IntStream stream = Arrays.stream(A);
        Map<Integer, Long> numbers = stream.boxed().collect(groupingBy(Function.identity(), counting()));

        
        Set<Entry<Integer,Long>> entries = numbers.entrySet();
        Entry<Integer,Long> popular = Collections.max(entries,(Entry<Integer,Long> a, Entry<Integer,Long> b) -> {
            return a.getValue().compareTo(b.getValue());
        });
        return popular.getKey();
    }

}
