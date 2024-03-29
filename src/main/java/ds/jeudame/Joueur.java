/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.jeudame;

import java.util.Scanner;

/**
 *
 * @author alanroussel
 */
public class Joueur {
    private String nom;
    private int nbrPion;
    private Scanner scanner; 
    private boolean isWhite;
    private static String entree="[ENTRÉE]";

    public int getNbrPion() {
        return nbrPion;
    }

    public void setNbrPion(int nbrPion) {
        this.nbrPion = nbrPion;
    }

    public String getNom() {
        return nom;
    }

    public boolean isIsWhite() {
        return isWhite;
    }

    public Joueur(boolean isWhite) {
        this.nbrPion = 20;
        this.isWhite = isWhite;
    }
    public boolean tourDeJeu(Echiquier echiquier){
        scanner = new Scanner(System.in);
        
        
        boolean pionEaten ;
        int xNew=0;
        int yNew=0;
        int xCurrent=0;
        int yCurrent=0;
        
        
        
        boolean positionAccepted = false;
        while(!positionAccepted){
            System.out.println(entree  + " Quel pion souhaites-tu bouger (x) ?  :");
            xCurrent = scanner.nextInt();
            System.out.println(entree  + " Quel pion souhaites-tu bouger (y) ? :");
            yCurrent = scanner.nextInt();
            System.out.println(entree  + " Où souhaites-tu aller (x) ? :");
            xNew = scanner.nextInt();
            System.out.println(entree  + " Où souhaites-tu aller (y) ?");
            yNew = scanner.nextInt();
            positionAccepted = echiquier.deplacementAutorise(xCurrent, yCurrent, xNew, yNew, isWhite);
            if(!positionAccepted){
                System.out.println("erreur, à refaire");
            }
        }
       
        pionEaten = echiquier.deplacerPion(xCurrent, yCurrent, xNew, yNew);
        
        return pionEaten;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
