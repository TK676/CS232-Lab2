package lab2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("lab2_input.txt"));
        int [] count = new int [9];
        
        for (int i = 0; i < 9; i++)count[i]=0;
        int num;
        scanner.nextInt();
        while (scanner.hasNextInt()) {            
            num = scanner.nextInt();
            count[num/25]++;
        }
        
        for (int i = 0; i < 9; i++) {
            if (i==8) {
                System.out.printf("[200 - 200]: %d\n", count[i]);
            }
            else System.out.printf("[%d - %d]: %d\n", i*25 , i*25 + 24, count[i]);
        }
        scanner.close();
    }
    
}
