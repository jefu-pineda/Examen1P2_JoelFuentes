/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_joelfuentes;

/**
 *
 * @author jefue
 */
public class SpidermanAlien extends Personaje{

    SpidermanAlien(String nombre, String universo) {
        this.setNombre(nombre);
        this.setUniverso(universo);
    }
    
    @Override
    double atacar(Personaje atacado) {
        return this.getAtaque() * 1.3;
    }
    
}
