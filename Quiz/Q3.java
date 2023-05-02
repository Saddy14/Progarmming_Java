public class Q3 {
    // BEGIN ANSWER Q3 <-- Copy From This Line
    // Submission code: extractWord function
    public static String extractWord(String text, String start, String end) {
        
        int firstLetter = text.indexOf(start) + start.length(); 
        int lastLetter = text.indexOf(end); 
        String finalText = text.substring(firstLetter, lastLetter);
        return finalText;

    }
    // END ANSWER Q3 <-- Copy Until This Line
    public static void main(String[] a) {
        System.out.println("Example: " + extractWord("What is >apple<", ">", "<"));
        // These "asserts" are used for self-checking
        assert extractWord("What is </orange>", "</", ">").equals("orange"): "Failed orange";
        assert extractWord("What is [apple]", "[", "]").equals("apple"): "Failed apple";
        assert extractWord("What is ><", ">", "<").equals(""): "Failed empty";
        assert extractWord("[an apple]", "[", "]").equals("an apple"): "Failed an apple";
        System.out.println("The question is done!");
        System.out.println("Submission code: extractWord function.");
        }
}

    /* Node: To enable assertion in Java:
    Compile by javac Q3.java
    Execute by java -ea Q3
    Refer to Lecture01 if you do know how to compile and execute by command lines
    */