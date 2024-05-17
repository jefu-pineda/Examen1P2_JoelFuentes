/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_joelfuentes;

/**
 *
 * @author jefue
 */
public abstract class Personaje {
    private String nombre;
    private double ataque = 0;
    private int vida = 0;
    private String universo;
    
    
    abstract void atacar(Personaje atacado);

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }

    public String getUniverso() {
        return universo;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", ataque: " + ataque + ", vida: " + vida + ", universo: " + universo;
    }
    
    
}
