/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ds.jeudame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aberman
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNbrPion method, of class Joueur.
     */
    @Test
    public void testGetNbrPion() {
        Joueur instance = new Joueur(true);
        assertEquals(instance.getNbrPion(), 20);
    }

    /**
     * Test of setNbrPion method, of class Joueur.
     */
    @Test
    public void testSetNbrPion() {
        Joueur instance = new Joueur(true);
        instance.setNbrPion(10);
        assertEquals(instance.getNbrPion(), 10);
    }

    /**
     * Test of getNom method, of class Joueur.
     */
    @Test
    public void testGetNom() {
        Joueur instance = new Joueur(true);
        instance.setNom("John");
        assertEquals(instance.getNom(), "John");
    }

    /**
     * Test of isIsWhite method, of class Joueur.
     */
    @Test
    public void testIsIsWhite() {
        Joueur instance = new Joueur(true);
        assertEquals(instance.isIsWhite(), true);
    }
}
