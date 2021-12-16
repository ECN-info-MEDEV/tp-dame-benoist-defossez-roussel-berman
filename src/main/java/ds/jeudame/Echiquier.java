/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.jeudame;

/**
 *
 * @author alanroussel
 */
public class Echiquier {

    private Pion[][] plateau;
    
    // Codes couleur pour l'affichage console
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private void affichePlateau() {
        String line = "";
        int largeur = 10; // Plateau carré de 10 x 10
        int hauteur = 10;
        for (int i = 0; i < largeur * 3 + 1; i++) {
            line = line + "=";
        }
        System.out.println(line);
        line = "";

        for (int j = 0; j < hauteur; j++) {
            for (int i = 0; i < largeur; i++) {
                if (i == 0 || i == largeur) {
                    line = line + "|";
                }

                if (plateau[i][j].isWhite()) {
                    line = line + "" + "◎" + "|";
                } else {
                    line = line + "" + "◉" + "|";
                }
            }
            System.out.println(line);
            line = "";
            for (int i = 0; i < largeur * 3 + 1; i++) {
                if (j == hauteur - 1) {
                    line = line + "=";
                } else {
                    line = line + "-";
                }
            }
            System.out.println(line);
            line = "";
        }
    }
}
