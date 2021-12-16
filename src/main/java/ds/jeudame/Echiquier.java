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
    private Pion [][] plateau;

    
    
    public boolean deplacementAutotrise(int x1, int y1, int x2, int y2, boolean couleur) {
        //verifie que les coordonnées sont comprises entre 0 et 9
        if ( x1<0 | x1>9 | x2<0 | x2>9 | y1<0 | y1>9 | y2<0 | y2>9  ) {
            return false;
        }
        
        //vérifie si un pion est sur la case de départ et que  la case d'arrivé est vide
        if (this.plateau[x1][y1] == null | this.plateau[x2][y2] != null) {
            return false;
        }
        
        //verifie la bonne couleur du pion à déplacer
        if ( this.plateau[x1][y1].getCouleur() ^ couleur ){
            return false;
        }
        
        //cas des noirs
        if (!couleur) {
            //cas déplacement simple
            if (y2 == y1+1) {
                return (1 == abs(x1-x2));   
            }
            //cas déplacement avec prise de pion
            if (y2 == y1+2) {
                return (2==abs(x1-x2) & this.plateau[(x1+x2)/2][(y1+y2)/2].getCouleur());
            }
        }
        
        //cas des blancs
        if (couleur) {
            //cas déplacement simple
            if (y1 == y2+1) {
                return (1 == abs(x1-x2));   
            }
            //cas déplacement avec prise de pion
            if (y1 == y2+2) {
                return (2==abs(x1-x2) & !this.plateau[(x1+x2)/2][(y1+y2)/2].getCouleur());
            }
        }        
        return false;
        
    }
    
}
