/*
 * Het doel van dit programma is om een Verkoopprijs Met en zonder BTW te berekenen D.M.V. de winstpercentage en inkoopprijs
 * @author 	ツ
 */
package verkoopprijsopdracht;
import java.util.Scanner; 

public class Verkoopprijsopdracht {

    public static void main(String[] args) {
        
        Scanner ifn = new Scanner(System.in);
        System.out.println("Wat is uw inkoopprijs?");
        double inkoopprijs = ifn.nextDouble(); 
        System.out.println("Wat is uw winstmarge (in %)?");
        int winstmarge = ifn.nextInt();
        //VVV Berekend de Verkoopprijzen Ex BTW en met 6/21% BTW
        double EX_BTW = ((inkoopprijs*(winstmarge+100))/100);
        final double BTW_LAAG = (EX_BTW*1.06);
        final double BTW_HOOG = (EX_BTW*1.21);
        
        System.out.println("Inkoopprijs: " + inkoopprijs);
        System.out.println("Winstmarge (in %): " + winstmarge);
        System.out.println();
        System.out.println("Verkoopprijs exclusief BTW : " + EX_BTW);
        System.out.println("Verkoopprijs inclusief 6% BTW: " + BTW_LAAG);
        System.out.println("Verkoopprijs inclusief 21% BTW: " + BTW_HOOG);
        
    }
    
}
