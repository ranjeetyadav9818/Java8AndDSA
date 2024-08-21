package ProblemSolvings.Pattern_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateWordFromString {

    public static void main(String[] args) {

        String str = "abc ghf ghf abc";
//        System.out.println("duplicate word of string "+ DuplicateUsingStream(str));
        System.out.println("rev integer " + reverseInteger(123));
    }

    public static List<String> duplicate(String str1) {
        String strArr[] = str1.split(" ");
        List<String> ldup = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].toLowerCase().equals(strArr[j].toLowerCase())) {
                    ldup.add(strArr[i]);
                }

            }
        }
        return ldup;
    }

    public static List<String> DuplicateUsingStream(String str) {
        return Arrays.stream(str.split(" ")).distinct().collect(Collectors.toList());

    }

    public static int reverseInteger(int i) {
        //123
        int num = i;
        int rem = 0;
        int sum = 0;

        while (num != 0) {

            rem = num % 10;

            sum = sum * 10 + rem;
            num = num / 10;
        }

        return sum;
    }

}

