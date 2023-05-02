public class Q2 {
    // BEGIN ANSWER Q2 <-- Copy From This Line
    // Submission code: kingKong function
    public static String kingKong(int num) {
        
        String numS = String.valueOf(num);
        if ( numS.contains("2") && numS.contains("3") ) {
            String kingKong = "King Kong";
            return kingKong;
        }
        else if (numS.contains("2")) {
            numS = numS.replaceAll("2", "King");
            return numS;
        }
        else if (numS.contains("3")) {
            numS = numS.replaceAll("3", "Kong");
            return numS;
        }
        else {
            return numS;
        }
    }
    // END ANSWER Q2 <-- Copy Until This Line
    public static void main(String[] a) {
        System.out.println("Example: " + kingKong(23));
        // These "asserts" are used for self-checking
        assert kingKong(23).equals("King Kong"): "Failed 23";
        assert kingKong(2).equals("King"): "Failed 2";
        assert kingKong(3).equals("Kong"): "Failed 3";
        assert kingKong(12).equals("1King"): "Failed 12";
        assert kingKong(30).equals("Kong0"): "Failed 30";
        System.out.println("The question is done!");
        System.out.println("Submission code: kingKong function.");
        }
}
    /* Node: To enable assertion in Java:
    Compile by javac Q2.java
    Execute by java -ea Q2
    Refer to Lecture01 if you do know how to compile and execute by command lines
    */