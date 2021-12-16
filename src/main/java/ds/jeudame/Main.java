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
public class Main {
    public static void main(String[] args){
        Echiquier echiquier = new Echiquier();
        Joueur joueur1= new Joueur();
        Joueur joueur2= new Joueur();
        boolean victoire=false;
        int n=0;
        while(!victoire){
            if(n%2==0){
                joueur1.tourDeJeu(echiquier);
                n=1;
            }
            else{
                joueur2.tourDeJeu(echiquier);
                n=0;
            }
            victoire=echiquier.victoire();
            //n=n%2+1;
        }
    }
}
