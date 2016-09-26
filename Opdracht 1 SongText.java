/*
 * Het doel van dit programma is om een SongText uit te printen
 * @author Harwinder
 * 
 */
package songtext;

import java.util.Random;

public class Songtext {

    /*
    * Hier zet ik een kleine pauze in de Songtext voor een betere flow :P
     */
    static Random random = new Random();
    public static void pauze() {
        try {
            Thread.sleep(random.nextInt(1000) +1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * @param args the command line arguments Hier beneden zet ik de songtext :D
     */
    public static void main(String[] args) {
        System.out.println("She gets on with life as a robber,");
        Songtext.pauze();
        System.out.println("She's a kind kinda gal.");
        Songtext.pauze();
        System.out.println("She likes racing snails and practising guitar.");
        Songtext.pauze();
        System.out.println("She likes to contemplate football.");
        Songtext.pauze();
        System.out.println("But when she starts to daydream,");
        Songtext.pauze();
        System.out.println("Her mind turns straight to rugby.");
        Songtext.pauze();
        System.out.println("Tralala tralala...	");
        Songtext.pauze();
        System.out.println("Tralala tralala...	.");
        Songtext.pauze();
        System.out.println("Tralala tralala...	.");
        Songtext.pauze();

    }

}
