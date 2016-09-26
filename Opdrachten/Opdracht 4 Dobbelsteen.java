/*
    * Het doel van dit programma is om een BSA Advies te berekenen d.m.v. je cijfers die je behaald.
    * @author VOLLEDIGE NAAM
 */
package dobbelsteen;

import java.util.Scanner;

public class Dobbelsteen {

    public static void main(String[] args) {
        String charoog;
        char finalcharoog;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welk karakter moet ik gebruiken voor het oog: ");
        charoog = scanner.next();

        finalcharoog = charoog.charAt(0);
        int nummer = 0;
        while (nummer != 6) {
            int randomnumber = (int) (Math.random() * 6 + 1);
            switch (randomnumber) {
                case 1:
                    randomnumber = 1;
                    System.out.println("");
                    System.out.println("");
                    System.out.println("\t" + finalcharoog);
                    System.out.println("");
                    System.out.println("");
                    break;
                case 2:
                    randomnumber = 2;
                    System.out.println("");
                    System.out.println(finalcharoog);
                    System.out.println("");
                    System.out.println("\t" + finalcharoog);
                    System.out.println("");
                    break;
                case 3:
                    randomnumber = 3;
                    System.out.println("");
                    System.out.println(finalcharoog);
                    System.out.println("\t" + finalcharoog);
                    System.out.println("\t\t" + finalcharoog);
                    System.out.println("");
                    break;
                case 4:
                    randomnumber = 4;
                    System.out.println("");
                    System.out.println(finalcharoog + "\t" + finalcharoog);
                    System.out.println("");
                    System.out.println(finalcharoog + "\t" + finalcharoog);
                    System.out.println("");
                    break;
                case 5:
                    randomnumber = 5;
                    System.out.println("");
                    System.out.println(finalcharoog + "\t\t" + finalcharoog);
                    System.out.println("\t" + finalcharoog + "\t");
                    System.out.println(finalcharoog + "\t\t" + finalcharoog);
                    System.out.println("");
                    break;
                case 6:
                    randomnumber = 6;
                    System.out.println("");
                    System.out.println(finalcharoog + "\t" + finalcharoog);
                    System.out.println(finalcharoog + "\t" + finalcharoog);
                    System.out.println(finalcharoog + "\t" + finalcharoog);
                    System.out.println("");
                    nummer = 6;
                    break;
            }
        }

    }

}
