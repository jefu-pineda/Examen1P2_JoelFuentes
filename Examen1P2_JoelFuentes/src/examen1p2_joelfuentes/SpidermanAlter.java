/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_joelfuentes;

/**
 *
 * @author jefue
 */
public class SpidermanAlter extends Personaje {
    
    SpidermanAlter(String nombre, String universo) {
        this.nombre = nombre;
        this.universo = universo;
    }
    
    @Override
    double atacar() {
        return 1.1 * this.ataque;
    }
}
