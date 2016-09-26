/*
    * Het doel van dit programma is om een BSA Advies te berekenen d.m.v. je cijfers die je behaald.
    * @author ツ
 */
package bsamonitor;

import java.util.Scanner;

public class Bsamonitor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fys, prog, db, ps, prs, is, ne;
        int fys2, prog2, db2, ps2, prs2, is2, ne2;
        String posneg;
        final String name_fys = "Fasten Your Seatbelts";
        final String name_prog = "Programming";
        final String name_db = "Databases";
        final String name_ps = "Personal Skills";
        final String name_prs = "Project Skills";
        final String name_is = "Infrastructure";
        final String name_ne = "Network Engineering 1";
        final int studiepunten_fys = 12;
        final int studiepunten_prog = 3;
        final int studiepunten_db = 3;
        final int studiepunten_ps = 2;
        final int studiepunten_prs = 3;
        final int studiepunten_is = 3;
        final int studiepunten_ne = 2;

        System.out.print("Wat is je cijfer voor " + name_fys + "?: ");
        fys = scanner.nextDouble();
        System.out.print("Wat is je cijfer voor " + name_prog + "?: ");
        prog = scanner.nextDouble();
        System.out.print("Wat is je cijfer voor " + name_db + "?: ");
        db = scanner.nextDouble();
        System.out.print("Wat is je cijfer voor " + name_ps + "?: ");
        ps = scanner.nextDouble();
        System.out.print("Wat is je cijfer voor " + name_prs + "?: ");
        prs = scanner.nextDouble();
        System.out.print("Wat is je cijfer voor " + name_is + "?: ");
        is = scanner.nextDouble();
        System.out.print("Wat is je cijfer voor " + name_ne + "?: ");
        ne = scanner.nextDouble();
        
        System.out.println("");

        fys2 = (fys >= 5.5) ? studiepunten_fys : 0;
        prog2 = (prog >= 5.5) ? studiepunten_prog : 0;
        db2 = (db >= 5.5) ? studiepunten_db : 0;
        ps2 = (ps >= 5.5) ? studiepunten_ps : 0;
        prs2 = (prs >= 5.5) ? studiepunten_prs : 0;
        is2 = (is >= 5.5) ? studiepunten_is : 0;
        ne2 = (ne >= 5.5) ? studiepunten_ne : 0;
        if (fys2 + prog2 + db2 + ps2 + prs2 + is2 + ne2 < 23.33) {
            posneg = "negatief";
        } else {
            posneg = "positief";
        }

        System.out.println("Vak/project: " + name_fys + "\t Cijfer: " + fys + "\t Behaalde punten: " + fys2);
        System.out.println("Vak/project: " + name_prog + "\t\t Cijfer: " + prog + "\t Behaalde punten: " + prog2);
        System.out.println("Vak/project: " + name_db + "\t\t\t Cijfer: " + db + "\t Behaalde punten: " + db2);
        System.out.println("Vak/project: " + name_ps + "\t\t Cijfer: " + ps + "\t Behaalde punten: " + ps2);
        System.out.println("Vak/project: " + name_prs + "\t\t Cijfer: " + prs + "\t Behaalde punten: " + prs2);
        System.out.println("Vak/project: " + name_is + "\t\t Cijfer: " + is + "\t Behaalde punten: " + is2);
        System.out.println("Vak/project: " + name_ne + "\t Cijfer: " + ne + "\t Behaalde punten: " + ne2);
        System.out.println("");
        System.out.println("Totaal behaalde studiepunten: " + (fys2 + prog2 + db2 + ps2 + prs2 + is2 + ne2) + "/28");
        System.out.println("PAS OP: je ligt op schema voor een " + posneg + " BSA! ");

    }

}
