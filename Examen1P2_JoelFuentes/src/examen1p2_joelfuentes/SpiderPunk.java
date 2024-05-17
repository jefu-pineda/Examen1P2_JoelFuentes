/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_joelfuentes;

/**
 *
 * @author jefue
 */
public class SpiderPunk extends Personaje{
    SpiderPunk(String nombre, String universo) {
        this.setNombre(nombre);
        this.setUniverso(universo);
    }
    
    @Override
    void atacar(Personaje atacado) {
        if (atacado instanceof SpidermanBlindado)
        {
            atacado.setVida((int) (atacado.getVida() - this.getAtaque()*1.15));
        } else {
            atacado.setVida((int) (atacado.getVida() - this.getAtaque()));
        }
    }
}
