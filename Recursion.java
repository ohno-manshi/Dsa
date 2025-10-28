public class Recursion{

    // print n numbers in decreasing order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printDec(n-1);
    }

    // print n numbers in increasing order
    public static void printInc(int n){
        if(n==1){
            System.out.print(n);
            return;
        }

        printInc(n-1);
        System.out.print(" "+n);
    }


    // facrtorial of n numbers
    public static int printFact(int n){
        if(n==0){
            return 1;
        }

        int fn = n* printFact(n-1);
        return fn;
    }

    // sum of n natural numbers
    public static int naturalNumSum(int n){
        if(n==1){
            return 1;
        }

        int sum = n + naturalNumSum(n-1);
        return sum;
    }

    // fibonacci series
    public static int fibonacciNum(int n){
        if(n==0 || n==1){
            return n;
        }

        int fibn = fibonacciNum(n-1)+ fibonacciNum(n-2);
        return fibn;
    }

    // check if given array is sorted or not
    public static boolean  isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]> arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printInc(n);
        System.out.println();
        System.out.println(printFact(5));
        System.out.println(naturalNumSum(5));
        System.out.println(fibonacciNum(2));
        int[] arr = {1,2,4,5};
        System.out.println(isSorted(arr, 0));
    }
}


