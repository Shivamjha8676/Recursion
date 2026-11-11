//Method


// public class recursion {
// public static void main (String args[]) {
//        rishika();
// }
// public static void rishika () {
//     System.out.println ("archit");
//     ishan ();
// }
// public static void ishan () {
//     System.out.println("lakshay");
//     varad();
// }
// public static void varad() {
//     System.out.println ("malini");
//     rishika();
// }
// }


//Ex:-

// public class recursion {
//     public static void main (String args[]) {
//         shivam (0);
//     }
//     public static void shivam (int n) {
//         if (n==10) return;
//         System.out.println ("Shatyam");
//         shivam (n-1);
//     }
// }


//print 5 to 1


// import java.util.*;
// public class recursion {
//     public static void main (String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt ();
//         print (n);
//     }
//     public static void print (int n) {
//         if (n==0) return;
//         System.out.println(n);
//         print (n-1);
//     }
// }



//print 5 to 1


// import java.util.*;
// public class recursion {
//     public static void main (String args[]) {
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         print(1,n);
//     }
//     public static void print (int x, int n) {
//         if (x>n) return;
//         System.out.println (x);
//         print(x+1, n);
//     }
// }


//Local vaariable


// import java.util.*;
// public class recursion {
//     public static void main (String[] args) {
//         int x=10;
//         change(x);
//         System.out.println(x);
//     }
//     public static void change(int x) {
//       x=20;
//     }
// }


//Global Varible


// public class recursion {
//     public static void main (String args[]) {
//         // fun();
//         int x=9; //chage
//          x=4; //local variable dec and initial
//           System.out.println (x);

//           x=6;
//         System.out.println (x);
//          fun();
//     }
//     public static void fun () {
//        int x=20;
//         x=6;
//         System.out.println (x);
//     }
    
// }



// public class recursion {
//     static int x=10;
//     public static void main (String args[]) {
//         x=9;
//         System.out.println (x);
//         int x=4;
//         System.out.println(x);
//         x=6;
//     }
//     public static void fun () {
//         x=20;
//     }
// }


//print 1 to n


// import java.util.*;
// public class recursion {
//     static int n;
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         n = sc.nextInt();
//         print(n);
//     }
//     public static void print (int n) {
//         if (n==0) return;
//         print (n-1);
//         System.out.print(n+" ");
//     }

// }


//print n to 1


// import java.util.*;
// public class recursion {
//     static int n;
//     public static void main (String args[]) {
//         Scanner sc= new Scanner (System.in);
//         n = sc.nextInt();
//         print (n);
//     }
//      public static void print (int n) {
//         if (n==0) return;
//          System.out.println (n+" ");
//         print(n-1);
//         if (n!=1)System.out.println (n+" ");
       
//      }
// }


//Facorial of no...


// class recursion {
//     // Function to calculate factorial of a number.
//    static int factorial(int n) {
//         // code here
        
//         if (n==0 || n==1) return 1;
//         // int ans = n*factorial(n-1);
        
//         // return ans;
//         return n*factorial(n-1);
//     }
// }

 

 //Ques:-  A raised to the power b


// import java.util.*;
// public class recursion {
//     public static void main (String args[]) {
//         Scanner sc= new Scanner (System.in);
//         System.out.println ("Enter base:");
//         int a = sc.nextInt();
//         System.out.println ("Enter Exponent:");
//         int b=sc.nextInt();
//         System.out.print(a+"raised to the power:"+b+"is:"+pow(a,b));

//     }
//     public static int pow (int a, int b) {
//         if (b==0) return 1;
//         return a*pow(a,b-1);
//     }
// }



 //Ques:- Reverse a string using recursion


// public class recursion {
//       public static int reverse (int n, int r) {
//         if (n==0) return r;
//         return reverse (n/10, r*10+n%10);
//       }
//       public static void main (String args[]) {
//         // int n=10;
//         int n=34535;  
//         System.out.println (reverse (n, 0));
//       }
//     }


//Ques:- Find the reverse of a number


 //Ques:- Sum of Natural Numbers


//  public class recursion {
//     public static int findSum(int n) {
//         if (n==1) return 1;
//         return n + findSum(n-1);
//     }
//     public static void main (String args[]){
//         int n=5;
//         System.out.println (findSum(n));
//     }
//     }
 

//Ques:- Power of a number


// class recursion {
    
//     public int reverseExponentiation(int n) {
//         // code here
        
//         if (n==10) return 10;
//         return pow(n,n);
//     }
//     public int pow (int a, int b) {
//         if (b==0) return 1;
//         int call = pow(a,b/2);
//         if(b%2==0) return call * call;
//         else return call *call*a;
//     }
// }


//GCD of 2 Numbers


// class Solution {
//     public static int gcd(int a, int b) {
//         // code here
        
//         for (int i=Math.min(a,b); i>=1; i--) {
//             if(a%i==0 && b%i==0) {
//                 return i;
//             }
//         }
//         return 1;
//     }
// }


//Quea:- nth Fibonacci Number


// public class recursion {
//     public int nthFibonacci(int n) {
//         if(n<=1) return n;
//         return nthFibonacci(n-1)+nthFibonacci(n-2);

//     }
// }


//Ques:- Ways to Reach the nth stair

//Binary search using recursion

// public class recursion {

//     public int helper(int[] nums, int target, int lo, int hi) {
//         if (lo > hi)
//             return -1;

//         int mid = lo + (hi - lo) / 2;

//         if (nums[mid] == target)
//             return mid;
//         else if (nums[mid] > target)
//             return helper(nums, target, lo, mid - 1);
//         else
//             return helper(nums, target, mid + 1, hi);
//     }

//     public int search(int[] nums, int target) {
//         return helper(nums, target, 0, nums.length - 1);
//     }

//     public static void main(String[] args) {

//         recursion obj = new recursion();

//         int[] nums = {1, 3, 5, 7, 9, 11};
//         int target = 7;

//         int ans = obj.search(nums, target);

//         System.out.println(ans);
//     }
// } 


//Ques:- Power set


// public class recursion {
//     public static void main (String args[]) {
//         String s = "abc";
//         subsets("",s,0);
//     }
//     private static void subsets(String ans, String s, int idx) {
//         if (idx==s.length()) {
//             System.out.print(ans+" ");
//             return;
//         }
//         char ch= s.charAt(idx);
//         subsets(ans+ch,s,idx+1); //pick
//         subsets(ans,s,idx+1); //skip
//     }
// }


 //Unique paths ()


//  public int paths (int cr, int cc, int lr, int lc) {
//     if(cr==lr && cc==lc) return 1;
//     if (cr>lr  || cc>lc) return 0;    //important
//     int right = paths(cr,cc+1, lr, lc);
//     int down = paths(cr+1,cc, lrl lc);
//     return right + down;
//  }
//  public int uniquwPaths (int m, int n) {
//     return paths(0, 0, m-1, n-1);
//  }
 


// public class recursion {

//     public static void main(String[] args) {

//         int[] arr = {5, 3, 7, 12, 76, 9, 34, 5};

//         recPrint(arr, 0);
//     }

//     public static void recPrint(int[] arr, int idx) {

//         if (idx == arr.length)
//             return;

//         recPrint(arr, idx + 1);

//         System.out.print(arr[idx] + " ");
//     }
// }


//Ques:- Binary Search


// import java.util.*;
// public class recursion {
// // Recursive Binary Search
//     public static int helper(int[] nums, int target, int lo, int hi) {
// // Base condition
//         if (lo > hi)
//             return -1;
//         // Middle index
//         int mid = lo + (hi - lo) / 2;
//         // Target mil gaya
//         if (nums[mid] == target)
//             return mid;
//         // Target left side mein hai
//         else if (nums[mid] > target)
//             return helper(nums, target, lo, mid - 1);
//         // Target right side mein hai
//         else
//             return helper(nums, target, mid + 1, hi);
//     }
// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // Array input
//         System.out.print("Enter array size: ");
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         System.out.println("Enter sorted array elements:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }
//         // Target input
//         System.out.print("Enter target: ");
//         int target = sc.nextInt();
//         // Binary Search call
//         int result = helper(nums, target, 0, n - 1);
//         // Result
//         if (result == -1)
//             System.out.println("Target not found");
//         else
//             System.out.println("Target found at index: " + result);

//         sc.close();
//     }
// }



//Ques:- Search element in Array using recursion


// public class RecursionOnArrays {

//     public static void main(String[] args) {

//         int[] arr = {5, 3, 7, 12, 76, 9, 34, 5};

//         int target = 76;

//         System.out.println(exists(arr, target, 0));
//     }

//     public static boolean exists(int[] arr, int target, int idx) {

//         if (idx == arr.length)
//             return false;

//         if (arr[idx] == target)
//             return true;

//         return exists(arr, target, idx + 1);
//     }
// }



//Ques:- Ye Unique Paths ka recursion wala code hai. Isme hum ek grid ke top-left se bottom-right tak pahunchne ke total possible paths count karte hain.


// import java.util.Scanner;

// public class recursion {

//     public static int paths(int cr, int cc, int lr, int lc) {

//         // Destination par pahunch gaye
//         if (cr == lr && cc == lc)
//             return 1;

//         // Grid ke bahar chale gaye
//         if (cr > lr || cc > lc)
//             return 0;

//         // Right move
//         int right = paths(cr, cc + 1, lr, lc);

//         // Down move
//         int down = paths(cr + 1, cc, lr, lc);

//         // Total paths
//         return right + down;
//     }

//     public static int uniquePaths(int m, int n) {

//         return paths(0, 0, m - 1, n - 1);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int m = sc.nextInt();

//         System.out.print("Enter number of columns: ");
//         int n = sc.nextInt();

//         int result = uniquePaths(m, n);

//         System.out.println("Total unique paths = " + result);

//         sc.close();
//     }
// }



//Pre In Post


// import java.util.*;
// public class recursion {
//     public static void main (String args[]) {
//         pip(3);
//     }
//     public static void pip(int n) {
//         if (n==0) return;
//         System.out.print(n+" ");  //pre
//         // System.out.print("Shivam ");
//         pip(n-1);
//         System.out.print(n+" ");  //in
//         // System.out.print("Shivam ");
//         pip(n-1);
//         System.out.print(n+" ");  //post
//     }
// }


//Ques:- Tower of Hanoi

// import java.util.*;
// public class recursion {
//     public static void main (String args[]) {
//         hanoi (3, 'A', 'B', 'C');
//     }
//     private static void hanoi (int n, char a, char b, char c) {
//         if (n==0) return;
//         hanoi (n-1,a,b,c);  // n-1 disks from A to B via C
//         System.out.println(a+"->"+c);  // Largest from A to C
//         hanoi (n-1, b,a,c); // n-1 disks from B to C via A
//     }
// }


//Ques:- Look and say pattern


// import java.util.Scanner;
// public class recursion {
//     public static String countAndSay(int n) {
//         // Base case
//         if (n == 1)
//             return "1";
//         // Previous term nikalo
//         String s = countAndSay(n - 1);
//         String ans = "";
//         int i = 0;
//         int j = 0;
//         // String ko scan karenge
//         while (j < s.length()) {
//             if (s.charAt(i) == s.charAt(j)) {
//                 j++;
//             } 
//             else {
//                 int freq = j - i;
//                 ans += freq;
//                 ans += s.charAt(i);
//                 i = j;
//             }
//         }
//         // Last group ko add karna
//         int freq = j - i;
//         ans += freq;
//         ans += s.charAt(i);
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         String result = countAndSay(n);
//         System.out.println("Count and Say = " + result);
//         sc.close();
//     }
// }


