import java.util.Scanner;

public class NumberSum {
    /*
    Given an array of size n, write a function to find the sum of the largest and smallest element in the array.
    Input specification:
    Input1: integer n, describing the size of the given array.
    Input2: integer array, specifying the elements of the array.
    Output Specification:
    Return an integer as the sum of the smallest and the largest elements in the given array.

    Example 1:
    Input 1: 4
    Input 2: {9,5,0,11}
    Output: 11
    Explanation:
    The largest and smallest elements in the given array are 11 and 0 respectively. Sum of the two elements is 11+0=11

    Example 2:
    Input 1: 7
    Input 2: {-9,15,80,101,4,95,-101}
    Output: 0
    Explanation:
    The largest and smallest elements in the given array are 101 and -101 respectively. Sum of the two elements is 101+(-101)=0
     */
    public static void main(String[] args) {
        System.out.println("Write the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        //writing integer numbers on the array
        for(int i=0; i<n; i++){
            System.out.println("Write the number "+(i+1)+" :");
            a[i]=sc.nextInt();
        }

        int max=a[0];
        int min=a[0];
        
        //finding
        for(int i=1; i<n; i++){
            if(a[i] > max){
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];

            }
        }

        System.out.print("Array: [");
        for(Integer numArray : a){
            System.out.print(numArray+",");
        }
        System.out.print("] ");
        System.out.print("max = " + max);
        System.out.println(" - min = " + min);
        int sum = max+min;
        System.out.print("sum = " + sum);
        
        /*
        Write the size of the array:
        3
        Write the number 1 :
        123
        Write the number 2 :
        -123
        Write the number 3 :
        6
        Array: [123,-123,6,] max = 123 - min = -123
        sum = 0
        */
    }
}
