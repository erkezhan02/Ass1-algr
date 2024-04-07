/* 4 task
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);
        //5*fact(5-1)*4*fact(4-1)*3*fact(3-1)*2*fact(2-1)*1
        //5*4*3*2*1
    }
}
*/



/* 1 task
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();//length array
            int[] arr = new int[n];//create array

            for (int i = 0; i < n; i++) {  //elements of array
                arr[i] = scanner.nextInt();
            }
            int min = findMinimum(arr);//find min
            System.out.println("Minimum:" + min);
        }

        public static int findMinimum(int[] arr) {  //function for min in array
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];//if element less than min,update minimum
                }
            }
            return min;
        }
    }

*/


/* 2 task
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];//array length n
        for (int i = 0; i < n; i++) { //input elements
            array[i] = scanner.nextInt();
        }
        double average = average(array);//call method average
        System.out.println("Average: " + average);
    }

    public static double average(int[] array) {  //method for average of sum
        double sum = 0;//хранить сумму элементов массива
        for (int i = 0; i < array.length; i++) {
            sum += array[i];//add element of array in sum
        }
        return sum / array.length;//return average
    }
}
*/



/* 3 task
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n;
        boolean isPrime=true;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        input.close();
        if(n<1)
            System.out.println("It must be greatest than 1");
        else if(n==1)
            System.out.println("Not prime,not composite");
        else {

            for(int i=2;i<=(n/2);i++){
                if((n%i)==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.println("Prime");
            else
                System.out.println("Composite");

        }
    }
}
 */


/* 5 task

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==1 || n==0) return n;
        return fib(n-1) + fib(n-2); //

    }
}

 */


/* 10 task

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int g = findGCD(a,b);
        System.out.println(g);
    }
    public static int findGCD(int a,int b){
        if(a % b == 0)
            return b;
        else
            return findGCD(b,a%b);
    }
}

 */

/* 6 task

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int res = pow(a, n);
        System.out.println(res);
    }
    public static int pow(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }
}

 */


/* 7 task
import java.util.Scanner;
public class Main {
    static void printPermutations(String str, String prefix) {
        int n = str.length();
        if (n == 0) {  // if string is empty, print the permutation
            System.out.print(prefix + " ");
            return;
        }
        for (int i = 0; i < n; i++) {  // iterate through each character of the string
            char ch = str.charAt(i);   // get the ith character
            String remaining = str.substring(0, i) + str.substring(i + 1);  // Create a new string without the ith character
            printPermutations(remaining, prefix + ch); // recursive call the function with the remaining string and the current character added to the prefix
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        printPermutations(s, "");
    }
}

 */


/* 8 task
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(areAllDigits(s));
    }
    public static boolean areAllDigits(String s) {
        if (s.isEmpty()) { //if the string is empty, return true
            return true;
        }
        if (Character.isDigit(s.charAt(0))) {  // check if the first character is a digit
            return areAllDigits(s.substring(1));
        } else {
            return false;// if the first character is not a digit, return false
        }
    }
}
*/


/* 9 task
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int result = binomial(n, k);
    System.out.println( result);
}
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) {
        return 1;        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);    }
}
 */