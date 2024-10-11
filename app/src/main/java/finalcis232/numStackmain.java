import java.util.*;
/* Analyze the
    following code
    and identify
    any potential issues: */

public class numStackmain {
    public static void main(String[] args) {

        Stack<Integer> numStack = new Stack<>();
        numStack.push(10);
        int topValue = numStack.pop();
        try {
            numStack.pop();
        } catch (Exception e) {
            System.out.println("Error Thrown");
        }
        System.out.println("This is " + topValue);
    }
}
