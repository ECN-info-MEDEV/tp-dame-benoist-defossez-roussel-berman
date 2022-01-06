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
public class Pion {
    private boolean white;
    private boolean dame;
    
    public Pion(boolean couleur) {
        this.white = couleur;
        this.dame = false;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isDame() {
        return dame;
    }

    public void setDame(boolean dame) {
        this.dame = dame;
    }
    
}
