/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatestcommondivisor;

/**
 *
 * @author Charlie Burris
 */
import java.util.Scanner;
public class GreatestCommonDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner
        
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter integers 1 and 2
        System.out.println("Enter first integer:");
        int n1 = input.nextInt();
        
        
        System.out.println("Enter second integer:");
        int n2 = input.nextInt();
        
        int gcd = 1; 
                
        for (int k = 2; k <= n1  && k <= n2 ; k++){
            
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
            
        }
        // print the greatest common divisor
        System.out.println(gcd);
    }
    
}
