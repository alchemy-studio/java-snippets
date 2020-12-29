package io.weli.reflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="mailto:l.weinan@gmail.com">Weinan Li</a>
 */
public class ArrayBuilder {
    public static void faultyMethod(List<String>... l) {
        Object[] objectArray = l; // Valid
        objectArray[0] = Arrays.asList(42);
        String s = l[0].get(0); // java.io.weli.lang.ClassCastException: java.io.weli.lang.Integer cannot be cast to java.io.weli.lang.String
    }

    public static void main(String[] args) {
        faultyMethod(new ArrayList<String>());
    }
}
