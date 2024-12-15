public class PracticeProblems {
    //practice question 1
    public static int countOccurrences(int[] arr, int n) {
        int count = 0; 
        for (int element : arr) {
            if (element == n) { 
                count++; 
            }
        }
        return count; 
    }
    //practice question 2
    public static int[] reverseArray (int[] arr){
         int[] reversed = new int[] {arr.length};
         // 1,2,3,4,5

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
            }
    return reversed;
        }
    //practice problem 3
    public static int sumGrid (int [][] grid) {
        int sum= 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }
    //practice problem 4

        // Function to calculate the nth Fibonacci number
        public static int fib(int n) {
            if (n == 0) {
                return 0; 
            } else if (n == 1) {
                return 1; 
            }
    
            return fib(n - 1) + fib(n - 2);
        }
    }