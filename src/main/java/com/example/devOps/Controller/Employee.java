package com.example.devOps.Controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Employee {

    public void test(){
        int i = 1;
        int j = 5;
        for (i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d ", j, i, j * i).println();
        }

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[]{1, 2, 2, 3, 3, 4, 5, 6, 7}));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(new Integer[]{1, 2, 5, 7, 8, 9, 99, 20}));

        // union of a and b

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union : " + union);

        Set<Integer> remove = new HashSet<>(a);
        remove.removeAll(b);
        System.out.println("Remove of B from a : " + remove);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Common on A and B : " + intersection);

//		String s = "ABC";
//		for (int i = 1; i < s.length(); i++) {
//			String s1 = s.substring(0, i);
//			String s2 = s.substring(i);
//			System.out.println(s1 + " " + s2);
//			//output A BC...
//		}
    }


}
