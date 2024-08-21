package JAVA_8_Features.FunctionalInterfaceAndLamda;

public class Main {
    public static void main(String[] args) {
        MyFuncInter i = (a, b)-> System.out.println(a+b); // give implementation of functional interface

        i.sum(2,3); // calling functional interface
        System.out.println(i.sub(2,3)); // calling default method
        System.out.println(MyFuncInter.mul(2,3)); // calling static method
    }

}
