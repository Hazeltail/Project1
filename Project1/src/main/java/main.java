/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author interim_misc
 */
import java.util.Scanner;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the size of the square.");
            int num = input.nextInt();
            int init_outer = 1; // the outer loop counter, which controls the number of lines
            while (init_outer <= num) {  // while the outer loop counter is less than num
                
                int init_inner = 1; // the inner loop counter, which controls 
                while (init_inner <= num) { //while the inner loop counter is less than num
                    if (init_outer == 1 || init_outer == num) //if it's the first or last line...
                    {
                        System.out.print("* ");
                    } else {
                        if (init_inner == 1 || init_inner == num) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        System.out.print(" ");
                        
                    }
                    init_inner = init_inner + 1;
                }
              init_outer = init_outer + 1;
              System.out.println();
            }
            int counter = 0; // remains the counter
            int spacecounter = 0;
            int sidelength = 0; // more like the side length of the pyramid
            System.out.println();
            System.out.println("How tall would you like the pyramid to be?");
            sidelength = input.nextInt();
            counter = sidelength;
            int repeatcounter = sidelength;
            int adder = 0;
            int addcounter = 0;
            while (repeatcounter >= 0) {
                while (counter - spacecounter > 0  ) {
                    System.out.print(" ");
                    counter = counter - 1;
                }
                while (addcounter >= 1 ) {
                    System.out.print("*");
                    addcounter = addcounter - 1;
                }
                System.out.println();
                spacecounter = spacecounter + 1;
                counter = sidelength;
                repeatcounter = repeatcounter - 1;
                addcounter = adder + 1;
                adder = adder + 2;
            }
            counter = 0;
            spacecounter = 0; 
            System.out.println("How tall would you like the right triangle to be?");
            sidelength = input.nextInt();
            counter = sidelength;
            spacecounter = sidelength;
            repeatcounter = sidelength;
            adder = 0;
            while (repeatcounter > 0) {
                System.out.println();
                while (counter - adder > 0) {
                    System.out.print("*");
                    counter = counter - 1;
                }
                counter = sidelength;
                adder = adder + 1;
                repeatcounter = repeatcounter - 1;
                
            }
    }
}    

