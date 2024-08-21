package JAVA_8_Features.StreamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // create a empty  stream
        Stream<Objects> emptystream = Stream.empty();

        // create an stream of an Array
        String str[]={"ranjeet","ankit","shivendra"};
        Stream<String> stram1= Stream.of(str);
        //or
        Stream<String> stram2= Arrays.stream(str);
        stram2.forEach(e-> System.out.println(e));

    }
}
