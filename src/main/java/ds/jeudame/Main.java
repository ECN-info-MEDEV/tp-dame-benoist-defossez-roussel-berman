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
public class Main {
    
    public static void main(String[] args){
        Echiquier echiquier = new Echiquier();
        
        Scanner scanner; 
        System.out.println("\nJOUEUR 1\n");
        Joueur joueur1 = new Joueur(true);
        scanner = new Scanner(System.in);
        System.out.println("[ENTRÉE]" + " Tapez votre pseudo :");
        String nomJoueur = scanner.next();
        joueur1.setNom(nomJoueur);
        System.out.println("\nJOUEUR 2\n");
        Joueur joueur2 = new Joueur(false);
        System.out.println("[ENTRÉE]" + " Tapez votre pseudo :");
        nomJoueur = scanner.next();
        joueur1.setNom(nomJoueur);
        
        boolean victoire=false;
        int n=0;
        boolean manger = false;
        
        while(!victoire){
            echiquier.affichePlateau();
            if(n%2==0){
                manger=joueur1.tourDeJeu(echiquier);
                n=1;
                if (manger==true){
                    manger=false;
                    joueur2.setNbrPion(joueur2.getNbrPion()-1);
                }
            }
            else{
                echiquier.affichePlateau();
                manger=joueur2.tourDeJeu(echiquier);
                n=0;
                if (manger==true){
                    manger=false;
                    joueur1.setNbrPion(joueur1.getNbrPion()-1);
                }

                //n=n%2+1;
                if(joueur1.getNbrPion()==0){
                    System.out.println(joueur2.getNom()+" a gagné!!");
                    victoire = true;
                }
                if(joueur2.getNbrPion()==0){
                    System.out.println(joueur1.getNom()+" a gagné!!");
                    victoire = true;
                }
            }
        }
    }
}
