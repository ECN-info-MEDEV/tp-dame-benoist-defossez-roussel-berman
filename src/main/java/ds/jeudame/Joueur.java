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
    private Scanner scanner; 

    public Joueur() {
        System.out.println("[ENTRÉE]" + " Tapez votre pseudo :");
        String nomJoueur = scanner.next();
        this.nom = nomJoueur;
    }
    public void tourDeJeu(Echiquier echiquier){
        System.out.println("[ENTRÉE]"  + " Quel pion souhaites-tu bouger (x) ?  :");
        int xCurrent = scanner.nextInt();
        System.out.println("[ENTRÉE]"  + " Quel pion souhaites-tu bouger (y) ? :");
        int yCurrent = scanner.nextInt();
        
        boolean positionAccepted = false;
        while(!positionAccepted){
            System.out.println("[ENTRÉE]"  + " Où souhaites-tu aller (x) ? :");
            int xNew = scanner.nextInt();
            System.out.println("[ENTRÉE]"  + " Où souhaites-tu aller (y) ?");
            int yNew = scanner.nextInt();
            // positionAccepted = echiquier.deplacementautorise(xCurrent, yCurrent, xNew, yNew);
        }
        // echiquier.deplacerPion(xCurrent, yCurrent, xNew, yNew);
    }
}
