package org.example;

public class math03 {
    
    public static void main(String[] args) {
        
        for(int i = 2; i < 9; i *= 2) {

			for(int j = 1; j <= i; j++) {
				System.out.print(j + "X" + j + "=" + i * j + " ");
			}

			System.out.println();

		}

    }
    
}
