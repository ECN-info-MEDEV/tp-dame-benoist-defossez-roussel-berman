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
        scanner = new Scanner(System.in);
        System.out.println(entree + " Tapez votre pseudo :");
        String nomJoueur = scanner.next();
        this.nom = nomJoueur;
        this.nbrPion = 20;
        this.isWhite = isWhite;
    }
    public boolean tourDeJeu(Echiquier echiquier){
        boolean pionEaten ;
        int xNew = 0 ;
        int yNew = 0;
        System.out.println(entree  + " Quel pion souhaites-tu bouger (x) ?  :");
        int xCurrent = scanner.nextInt();
        System.out.println(entree  + " Quel pion souhaites-tu bouger (y) ? :");
        int yCurrent = scanner.nextInt();
        
        boolean positionAccepted = false;
        while(!positionAccepted){
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
}
