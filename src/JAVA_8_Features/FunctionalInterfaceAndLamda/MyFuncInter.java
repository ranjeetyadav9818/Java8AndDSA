package JAVA_8_Features.FunctionalInterfaceAndLamda;

@FunctionalInterface
public interface MyFuncInter {
    // a functional interface contains only one abstract function but allows any numbers of default and static methods
    public abstract void sum(int a, int b);
//    public abstract int sum1(int a, int b);
    default int sub(int a,int b){
        return b-a;
    }
    static int mul(int a, int b){
        return a*b;

    }
}
