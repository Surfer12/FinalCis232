/* Draw a flowchart for the code below. Take a picture of the flowchart and upload it.  */
public class FunctionFlowchart {
    public static void myFunction() {
        System.out.print("Enter your name: "); //
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
