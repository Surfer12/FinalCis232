package finalcis232;

import java.util.HashSet;
import java.util.*;

public class hashsetex {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("apple");

        System.out.println(mySet.size());
    }
}
