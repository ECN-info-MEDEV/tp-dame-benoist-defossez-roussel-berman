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
    private Pion [][] plateau;
    
    public Echiquier() {
        int nbrpions = 0;
        this.plateau = new Pion[10][10];
        for(int i = 0; i<10; i++){
            for(int j=0; j<10;j++){
                if(i+j % 2 == 0){
                    if(nbrpions < 20){
                        nbrpions ++;
                        this.plateau[i][j] = new Pion(false);
                    } else{
                        this.plateau[i][j] = new Pion(true);
                    }
                }
            }
        }
        
    }
    
}
