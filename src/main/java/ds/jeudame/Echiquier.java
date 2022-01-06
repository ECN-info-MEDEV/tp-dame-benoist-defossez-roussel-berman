/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.jeudame;

import static java.lang.Math.abs;

/**
 *
 * @author alanroussel
 */
public class Echiquier {

    private Pion[][] plateau;
    
    public Pion[][] getPlateau() {
        return plateau;
    }
    
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

    public Echiquier() {
        int nbrpions = 0;
        this.plateau = new Pion[10][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (((i+j) % 2) == 0) {
                        this.plateau[j][i] = new Pion(false);
                }
            }
        }
        for(int i=9 ; i>5; i-- ){
            for(int j=0 ; j < 10; j++ ){
                if (((i+j) % 2) == 0) {
                    this.plateau[j][i] = new Pion(true);
                }
            }
        }
    }
    
    public boolean deplacementAutorise(int x1, int y1, int x2, int y2, boolean couleur) {
        //verifie que les coordonnées sont comprises entre 0 et 9
        if ( x1<0 || x1>9 || x2<0 || x2>9 || y1<0 || y1>9 || y2<0 || y2>9  ) {
            System.out.println("hors du plateau");
            return false;
        }
        
        //vérifie si un pion est sur la case de départ et que  la case d'arrivé est vide
        if (this.plateau[x1][y1] == null || this.plateau[x2][y2] != null) {
            System.out.println("pas de pion");
            return false;
        }
        
        //verifie la bonne couleur du pion à déplacer
        if ( this.plateau[x1][y1].isWhite() ^ couleur ){
            System.out.println("mauvaise couleur");
            return false;
        }
        
        //cas des noirs
        if (!couleur) {
            //cas déplacement simple
            if (y2 == y1+1) {
                System.out.println("deplacement simple");
                return (1 == abs(x1-x2));   
            }
            //cas déplacement avec prise de pion
            if (y2 == y1+2) {
                System.out.println("prise");
                return (2==abs(x1-x2) && this.plateau[(x1+x2)/2][(y1+y2)/2].isWhite());
            }
        }
        
        //cas des blancs
        if (couleur) {
            //cas déplacement simple
            if (y1 == y2+1) {
                System.out.println("deplacement simple");
                return (1 == abs(x1-x2));   
            }
            //cas déplacement avec prise de pion
            if (y1 == y2+2) {
                System.out.println("prise");
                return (2==abs(x1-x2) && !this.plateau[(x1+x2)/2][(y1+y2)/2].isWhite());
            }
        }     
        System.out.println("autre");
        return false;
        
    }

    public boolean deplacerPion(int xCurrent, int yCurrent, int xNew, int yNew){
        boolean pionEaten = false;
        if(Math.abs(xNew - xCurrent)==1){
            this.getPlateau()[xNew][yNew] = this.getPlateau()[xCurrent][yCurrent];
            this.getPlateau()[xCurrent][yCurrent] = null;
        }else{
            this.getPlateau()[xNew][yNew] = this.getPlateau()[xCurrent][yCurrent];
            this.getPlateau()[xCurrent][yCurrent] = null;
            this.getPlateau()[(xCurrent + xNew / 2)][(yCurrent + yNew / 2)] = null;
            pionEaten = true;   
        }
        return pionEaten;
        }

    public void affichePlateau() {
        StringBuilder bld = new StringBuilder();

        int largeur = 10; // Plateau carré de 10 x 10
        int hauteur = 10;
        for (int i = 0; i < largeur * 3 + 1; i++) {
            bld.append("=");
        }
        String line = bld.toString();
        System.out.println(line);
        
        

        for (int j = 0; j < hauteur; j++) {
            bld = new StringBuilder();
            for (int i = 0; i < largeur; i++) {
                if (i == 0 || i == largeur) {
                    bld.append("|");
                }
                
                if(plateau[i][j] == null){
                    bld.append(" |");
                }else{
                   if (plateau[i][j].isWhite()) {                    
                    //bld.append("◎|");
                    bld.append("b|");
                    } else {
                        //bld.append("◉|");
                        bld.append("n|");
                    } 
                }
                
            }
            line = bld.toString();
            System.out.println(line);
            
            bld = new StringBuilder();
            for (int i = 0; i < largeur * 3 + 1; i++) {
                if (j == hauteur - 1) {
                    line = line + "=";
                    bld.append("=");
                } else {
                    bld.append("-");
                }
            }
            line = bld.toString();
            System.out.println(line);
        }
    }
}
