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
        this.setNombre(nombre);
        this.setUniverso(universo);
    }
    
    @Override
    void atacar(Personaje atacado) {
        atacado.setVida((int) (atacado.getVida() - this.getAtaque()*rand.nextDouble(1.1,1.2)));
    }
}
