import java.util.Scanner;

public class lab14 {

    /******************************************************************************
     * Perform BLACK-BOX TESTING ON THE FOLLOWING 4 METHODS                       *
     ******************************************************************************/
    
     public static void print1D(int[] A) {
        System.out.print("{");
        for (int j=0; j< A.length; j++) {
            if (j != A.length-1)
                System.out.print(A[j] + ",");
            else
                System.out.print(A[j]);
        }
        System.out.println("}");
    }

    public static int maxElement(int[][] A) {
        int max = A[0][0];
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                if (A[i][j] > max) max = A[i][j];   
            }
        }
        return max;
    }
    
    public static String reverse(String s) {
        if (s.length() <= 1) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
    
    public static boolean isPalindromeN(int n) {
        if (n < 10) return true;
        int last = n % 10;
        
        // count the number of digits in n
        int aux = n;
        int digits = 0;
        while (aux != 0) {
            digits++;
            aux /= 10;
        }
        
        int divisor = 1;
        for (int i=1; i<digits; i++) divisor *= 10;
        
        int first = n / divisor;
        if (first != last) return false;
        return isPalindromeN((n % divisor)/10);
    }

    /******************************************************************************
     * Perform WHITE-BOX TESTING ON THE FOLLOWING 4 METHODS                       *
     ******************************************************************************/
    

    /**** takes a 1D array of integers and returns nothing
     **** it adds 1 to each element of the array
     ****/
    public static void addsOne(int[] A) {
        for (int i=0; i<A.length; i++)
            A[i]++;
    }
    
    /**** takes a 2D array of integers and returns nothing
     **** It leaves the first row untouched
     **** Then the second row becomes: the first row added to the second row
     **** The 3rd row becomes: the 2nd row added to the 3rd row
     **** etc.
     ****/
    public static void rowCombinations(int[][] A) {
        for (int i=1; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                A[i][j] += A[i-1][j];
            }
        }
    }

    /**** createsNumberPalindrome takes an integer as input
     **** and returns an integer that is a palindrome
     ****  the result should be built from the input
     ****  if the input is a palindrome, then return it
     ****  otherwise, keep adding to it its reverse until
     ****  you obtain a number that is a palindrome
     ****/
    public static int createsNumberPalindrome(int num) {
        if (isPalindromeN(num)) return num;
        
        // build the reverse of num
        int reverse = 0;
        int aux = num;
        while (aux != 0) {
            reverse *= 10;
            reverse += aux % 10;
            aux /= 10;
        }
        System.out.println("the reverse of " + num + " is: " + reverse);
        
        return createsNumberPalindrome(num+reverse);
    }
    
    /****************************************************************************
     * Main method in which you will test each of the above methods 
     ****************************************************************************/
    public static void main(String[] args) {
        // Here, you will add code to conduct your two testing strategies as prompted
		//int [] A = {6.0, 6.2, 3.2};
        //int [] B = {-2, 4, 1};
		//int [] C = {i, h8, u, 2};
		//int [] D = {};
		
		//int[][]E = {};
		//int[][]F = {{why, nu, tears}, {1, 2, 3}};
		//int[][]G = {{2.2, 3.3, 5.5}, {3.3, 2.2, 5.5}};
		//int [][]H = {{0}, {1}};
		
		//String I = "cat";
		//String J = "";
		//String K = "882";
		//String L = "(~^o^)~";
		
		int m = 10;
		int n = -203;
		int o = 0;
		int p = 92;
		
		
        /******* BLACK-BOX TESTING **********************************************/
		//testing print1D
		//print1D(A);
		//print1D(B);
		//print1D(C);
		//print1D(D);
		
		//testing maxElement
		//System.out.println(maxElement(E));
		//System.out.println(maxElement(F));
		//System.out.println(maxElement(G));
		//System.out.println(maxElement(H));
		
		//testing reverse
		//System.out.println(reverse(I));
        //System.out.println(reverse(J));
		//System.out.println(reverse(K));
		//System.out.println(reverse(L));
		
		//testing isPalindromeN
		//System.out.println(isPalindromeN(m));
		//System.out.println(isPalindromeN(n));
		//System.out.println(isPalindromeN(o));
		//System.out.println(isPalindromeN(p));
		
        /******* WHITE-BOX TESTING **********************************************/
       	//int [] Q = {};
		//int [] R = {-1, 1, 3};
		//int [] S = {0, 0, 0};
		//int [] T = {3, -3, -2};
		
	   //int [] Q = new int [2];
	   //addsOne(Q);
	   //for (int i=0; i<Q.length; i++){
	   //	System.out.print(Q[i] + " ");
	   //}
	  
	  //int [] R = new int [2];
	  //R[0] = -1;
	  //R[1] = 1;
	  //R[2] = 3;
	   //addsOne(R);
	   //for (int i=0; i<R.length; i++){
	   	//System.out.print(R[i] + " ");
	   //}
	  //int [] S = new int [2];
	  //S[0] = 0;
	  //S[1] = 0;
	  //S[2] = 0;
	  //addsOne(S);
	  //for (int i=0; i<S.length; i++){
	  	//System.out.print(S[i] + " ");
	  //}
	  
	  //int [] T = new int [2];
	  //T[0] = 3;
	  //T[1] = -3;
	  //T[2] = -2;
	  //addsOne(T);
	  //for (int i=0; i<T.length; i++){
	  	//System.out.print(T[i] + " ");
	  //}
		
		/*int [][] U = new int [1][1];
	  	U[0][0] = 3;
	  	U[0][1] = -3;
	  	U[1][0] = -2;
		U[1][1] = -2;
	  	rowCombinations(U);
	  	for (int i=0; i<U.length; i++){
	  		for(int j=0; j<U.length; j++){
				System.out.print(U[j] + " ");
			}	
		}
		
		int [][] V = new int [1][1];
	  	V[0][0] = 0;
	  	V[0][1] = 0;
	  	V[1][0] = 2;
		V[1][1] = 3;
	  	rowCombinations(V);
	  	for (int i=0; i<V.length; i++){
	  		for(int j=0; j<V.length; j++){
				System.out.print(V[j] + " ");
			}
		}
		
		int [][] W = new int [1][1];
	  	W[0][0] = 3;
	  	W[0][1] = 3;
	  	W[1][0] = 2;
		W[1][1] = 2;
	  	rowCombinations(W);
	  	for (int i=0; i<W.length-1; i++){
	  		for(int j=0; j<W.length; j++){
			System.out.print(W[j] + " ");
		}
		}
		
		int [][] X = new int [1][1];
	  	X[0][0] = 3;
	  	X[0][1] = -3;
	  	X[1][0] = -2;
		X[1][1] = -2;
	  	rowCombinations(X);
	  	for (int i=0; i<X.length; i++){
		for(int j=0; j<X.length; j++){
	  		System.out.print(X[j] + " ");
		}
		}
		*/
		//createsNumberPalindrome(m);
		//createsNumberPalindrome(n);
		//createsNumberPalindrome(o);
		//createsNumberPalindrome(p);
    }

}