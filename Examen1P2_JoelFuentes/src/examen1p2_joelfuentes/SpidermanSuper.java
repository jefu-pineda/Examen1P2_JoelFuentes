/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_joelfuentes;

import java.util.Random;

/**
 *
 * @author jefue
 */
public class SpidermanSuper extends Personaje {
    public static Random rand = new Random();
    SpidermanSuper(String nombre, String universo) {
        this.nombre = nombre;
        this.universo = universo;
    }
    
    @Override
    double atacar() {
        return this.ataque * rand.nextDouble(1.1,1.2);
    }
}
