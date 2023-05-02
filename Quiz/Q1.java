public class Q1 {
    // BEGIN ANSWER Q1 <-- Copy From This Line
    // Submission code: multiply function
    public static int multiply(int a, int b) {
        return a*b;
    }
        // END ANSWER Q1 <-- Copy Until This Line
        public static void main(String[] a) {
            System.out.println("Example: " + multiply(1, 2));
            assert multiply(3, 2) == 6: "Failed 3 x 2";
            assert multiply(0, 1) == 0: "Failed 0 x 1";
            System.out.println("The question is done!");
            System.out.println("Submission code: multiply function");
        }
}
    /* Node: To enable assertion in Java:
    Compile by javac Q1.java
    Execute by java -ea Q1
    Refer to Lecture01 if you do know how to compile and execute by command lines
    */