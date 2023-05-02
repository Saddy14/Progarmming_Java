import java.util.Scanner;

public class Combine2Arr {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int size;
        int size2;
        
        System.out.print("Array1 Size --> ");
        size = scanner.nextInt();
        
        double[] arr1 = new double[size];
        System.out.print("Array2 Size --> ");
        size2 = scanner.nextInt();
        
        double[] arr2 = new double[size2];
        
        System.out.println();
        enterNum(arr1);

        System.out.println();
        enterNum(arr2);
        
        System.out.println();

        double[] arr3 = combineArr(arr1, arr2, size, size2);
        System.out.println();

        System.out.print("arr1: ");
        printArr(arr1);
        System.out.println();

        System.out.print("arr2: ");
        printArr(arr2);
        System.out.println();

        System.out.print("arr3: ");
        printArr(arr3);
        
        scanner.close();
    }


    private static void enterNum(double[] arr) {

        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
           
            double temp;

            System.out.print("Enter Number #"+(i+1)+" ->");
            temp = scan.nextDouble();
            arr[i] = temp;

            
        }
        // scan.close();
        
    }
    private static double[] combineArr(double[] arr1, double[] arr2, int size1, int size2) {

        int totalSize = size1 + size2;
        double[] combineArray = new double[totalSize];

        for(int i = 0; i < size1; i++ ) {

            combineArray[i] = arr1[i];
        } 
        int temp = 0;
        for(int i = size1; i < totalSize; i++) {
            
            combineArray[i] = arr2[temp];
            temp++;
        } 

        return combineArray;

        
    }
    private static void printArr(double[] arr) {
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i]+",");
        }
     }
}


// private static void enterArray(double[] arr) {
//     try (Scanner scan = new Scanner(System.in)) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print("Enter Number #" + (i + 1) + " ->");
//             arr[i] = scan.nextDouble();
//         }
//     }
// }
