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
public class PionTest {

    public PionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isWhite method, of class Pion.
     */
    @Test
    public void testIsWhite() {
        Pion instance = new Pion(true);
        assertEquals(instance.isWhite(), true);

    }

    /**
     * Test of setWhite method, of class Pion.
     */
    @Test
    public void testsetWhite() {
        Pion instance = new Pion(true);
        instance.setWhite(false);
        assertEquals(instance.isWhite(), false);

    }

}