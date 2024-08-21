package JAVA_8_Features.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        // Q1. create list and filter even number from that
        List<Integer>l1 = List.of(1,28,35,68,91,95,43,48);// this is an unmoodifiedable list that  can not be change or modified
        System.out.println("List l1 is  "+l1);
        List<Integer> ls= l1.stream().filter(e->e%2==0).collect(Collectors.toList()); // to filter we have to pass an boolean predicate to filter function
        System.out.println("even numbers are "+ls);

        //Q2. Find all the elements which is greater than 50 from list  l1

        List<Integer>ls1= l1.stream().filter(w->w>50).collect(Collectors.toList());
        System.out.println("greater than 50 elements are :- "+ls1);
    }
}
