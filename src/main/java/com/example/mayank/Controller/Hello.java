package com.example.mayank.Controller;

import com.example.mayank.Model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Hello {



    public void m1() {
        // remove duplicates
        int[] arr = {1,3,5,6,7,8,10,3,5,10};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i =0; i <arr.length ; i++){
            set.add(arr[i]);
        }
        System.out.print(set);

        // find anagrams
        String s1 ="mayank";
        String s2 = "mayakn";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() == s2.length()){
            char[] c1 = s1.toCharArray();
            Arrays.sort(c1);
            char[] c2 = s2.toCharArray();
            Arrays.sort(c2);
            boolean isSame = Arrays.equals(c1, c2);

            if(isSame){
                System.out.println(s1 + " and " + s2 +" is anagrams");
            }else{
                System.out.println(s1 + " and " + s2 +" is not anagrams");
            }
        }else{
            System.out.println(s1 + " and " + s2 +" is not anagrams");
        }

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(15);
        ls.add(20);
        ls.add(5);
        ls.add(30);
        ls.add(0);
        System.out.println(ls);

        // Sorting ascending order
        Comparator<Integer> co =  (o1, o2)->(o1<o2)?-1:(o1>o2)?1:0;
        Collections.sort(ls,co);
        System.out.println(ls);

        // Sorting descending order
        Comparator<Integer> ca =  (o1,o2)->(o1>o2)?-1:(o1<o2)?1:0;
        Collections.sort(ls,ca);
        System.out.println(ls);
        ls.stream().forEach(System.out::println);
        ls.add(67);
        System.out.println(ls);
        List<Integer> l = ls.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
        System.out.println(l); // print only even numbers

        // Sorting on Objects
        ArrayList<com.example.mayank.Model.Employee> employees = new ArrayList<com.example.mayank.Model.Employee>();
//        employees.add(new com.example.mayank.Model.Employee("Mayank",25060));
//        employees.add(new com.example.mayank.Model.Employee("Pranay",25056));
//        employees.add(new com.example.mayank.Model.Employee("Shivam Chauhan",25064));
//        employees.add(new com.example.mayank.Model.Employee("Raj",25058));
//        employees.add(new com.example.mayank.Model.Employee("Nirmal",25068));
        System.out.println(employees);
//        Comparator<Employee> emp =   (e1, e2) -> e1.empId<e2.empId?-1:e1.empId>e2.empId?1:0 ;
//        Collections.sort(employees , emp);
        //or we can write  Collections.sort(employees ,  (e1,e2) -> e1.empId<e2.empId?-1:e1.empId>e2.empId?1:0);
        System.out.println(employees);

        //sort on alphabetical order of emp name
        Collections.sort(employees , (e1,e2) -> e1.name.compareTo(e2.name)); //Asc Order for Alphabet
        System.out.println(employees);



    }
}
