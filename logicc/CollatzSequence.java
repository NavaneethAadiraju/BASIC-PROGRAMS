package com.corejava;

public class CollatzSequence {
	static void printCollatz(int num) 
    { 
        
        while (num != 1) 
        { 
            System.out.print(num + " "); 
            if (num%2 != 0) 
                num = 3 * num + 1; 
            else
                num = num / 2; 
        }  
        System.out.print(num); 
    } 
      
	public static void main(String[] args) {
		printCollatz(3); 

	}

}
