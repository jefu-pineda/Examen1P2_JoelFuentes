/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_joelfuentes;

import java.util.*;

/**
 *
 * @author jefue
 */
public class examen1p2_joelfuentes {

    public static Scanner leer = new Scanner(System.in);
    public static Random rand = new Random();
    public static ArrayList<Personaje> Spidermen = new ArrayList();
    public static ArrayList<Personaje> Enemigos = new ArrayList();

    //Creacion de spidermans predeterminados
    //aliados
    static Personaje spiderman1 = new SpidermanClassic("Peter", "616");
    static Personaje spiderman2 = new SpidermanSuper("Tom", "18888");
    static Personaje spiderman3 = new SpiderPunk("Daniel", "0001");
    //enemigos
    static Personaje spiderman4 = new SpidermanBlindado("Emilio", "192");
    static Personaje spiderman5 = new SpidermanAlter("Juan", "666");
    static Personaje spiderman6 = new SpidermanAlien("Joel", "15043");

    public static void main(String[] args) {
        Spidermen.add(spiderman1);
        Spidermen.add(spiderman2);
        Spidermen.add(spiderman3);

        Enemigos.add(spiderman4);
        Enemigos.add(spiderman5);
        Enemigos.add(spiderman6);
        int opcion;
        boolean bandera = true;
        do
        {
            System.out.println("1) Agregar Spiderman");
            System.out.println("2) Agregar Enemigo");
            System.out.println("3) Listar Spidermen");
            System.out.println("4) Listar Enemigos");
            System.out.println("5) Listar Todos");
            System.out.println("6) Modificar Spiderman");
            System.out.println("7) Modificar Enemigo");
            System.out.println("8) Eliminar Spiderman");
            System.out.println("9) Eliminar Enemigo");
            System.out.println("10) Jugar");
            opcion = leer.nextInt();
            switch (opcion)
            {
                case 1 -> {
                    agregarSpiderman();
                } 
                case 2 -> {
                    agregarEnemigo();
                }
                case 3 -> {
                    listarSpidermen();
                }
                case 4 -> {
                    
                }
            }
        } while (bandera);
    }

    public static void agregarSpiderman() {
        Personaje spiderman;
        OUTER:
        while (true)
        {
            System.out.println("---Agregar Spiderman---");
            System.out.println("1) Spiderman Classic");
            System.out.println("2) Spiderman Superior");
            System.out.println("3) SpiderPunk");
            System.out.println("4) Spiderman Blindado");
            System.out.println("5) Spiderman Alterado");
            System.out.println("6) Spiderman Alienigena");
            System.out.print("Ingrese que tipo de Spiderman quiere crear: ");
            int op = leer.nextInt();
            leer.nextLine();
            switch (op)
            {
                case 1 ->
                {
                    System.out.println("---Spiderman Classic---");
                    System.out.println("Ingrese el nombre de su nuevo Spiderman: ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese el universo de su nuevo Spiderman: ");
                    String universo = leer.nextLine();
                    System.out.println("Ingrese el danno de ataque de su nuevo Spiderman: ");
                    double danno = leer.nextDouble();
                    leer.nextLine();

                    spiderman = new SpidermanClassic(nombre, universo);
                    spiderman.setAtaque(danno);
                    break OUTER;
                }
                case 2 ->
                {
                    System.out.println("---Spiderman Superior---");
                    System.out.println("Ingrese el nombre de su nuevo Spiderman: ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese el universo de su nuevo Spiderman: ");
                    String universo = leer.nextLine();
                    System.out.println("Ingrese el danno de ataque de su nuevo Spiderman: ");
                    double danno = leer.nextDouble();
                    leer.nextLine();

                    spiderman = new SpidermanSuper(nombre, universo);
                    spiderman.setAtaque(danno);
                    break OUTER;
                }
                case 3 ->
                {
                    System.out.println("---SpiderPunk---");
                    System.out.println("Ingrese el nombre de su nuevo Spiderman: ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese el universo de su nuevo Spiderman: ");
                    String universo = leer.nextLine();
                    System.out.println("Ingrese el danno de ataque de su nuevo Spiderman: ");
                    double danno = leer.nextDouble();
                    leer.nextLine();

                    spiderman = new SpiderPunk(nombre, universo);
                    spiderman.setAtaque(danno);
                    break OUTER;
                }

                default ->
                {
                    System.out.println("Opcion no valida :/");
                    System.out.println("Intente otra vez");
                }
            }
        }
        Spidermen.add(spiderman);
        System.out.println("Volviendo al menu principal");

    }

    public static void agregarEnemigo() {
        Personaje spiderman;
        OUTER:
        while (true)
        {
            System.out.println("---Agregar Enemigo---");
            System.out.println("1) Spiderman Blindado");
            System.out.println("2) Spiderman Alterado");
            System.out.println("3) Spiderman Alienigena");
            System.out.print("Ingrese que tipo de Spiderman quiere crear: ");
            int op = leer.nextInt();
            leer.nextLine();
            switch (op)
            {
                case 1 ->
                {
                    System.out.println("---Spiderman Blindado---");
                    System.out.println("Ingrese el nombre de su nuevo Spiderman: ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese el universo de su nuevo Spiderman: ");
                    String universo = leer.nextLine();
                    System.out.println("Ingrese el danno de ataque de su nuevo Spiderman: ");
                    double danno = leer.nextDouble();
                    leer.nextLine();

                    spiderman = new SpidermanBlindado(nombre, universo);
                    spiderman.setAtaque(danno);
                    break OUTER;
                }
                case 2 ->
                {
                    System.out.println("---Spiderman Alterado---");
                    System.out.println("Ingrese el nombre de su nuevo Spiderman: ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese el universo de su nuevo Spiderman: ");
                    String universo = leer.nextLine();
                    System.out.println("Ingrese el danno de ataque de su nuevo Spiderman: ");
                    double danno = leer.nextDouble();
                    leer.nextLine();

                    spiderman = new SpidermanAlter(nombre, universo);
                    spiderman.setAtaque(danno);
                    break OUTER;
                }
                case 3 ->
                {
                    System.out.println("---Spiderman Alienigena---");
                    System.out.println("Ingrese el nombre de su nuevo Spiderman: ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese el universo de su nuevo Spiderman: ");
                    String universo = leer.nextLine();
                    System.out.println("Ingrese el danno de ataque de su nuevo Spiderman: ");
                    double danno = leer.nextDouble();
                    leer.nextLine();

                    spiderman = new SpidermanAlien(nombre, universo);
                    spiderman.setAtaque(danno);
                    break OUTER;
                }
                default ->
                {
                    System.out.println("Opcion no valida :/");
                    System.out.println("Intente otra vez");
                }
            }
        }
        Enemigos.add(spiderman);
        System.out.println("Volviendo al menu principal");
    }

    public static void listarSpidermen() {
        for (int i = 0; i < Spidermen.size(); i++)
        {
            System.out.println(i + ". " + Spidermen.get(i));
        }
    }

    public static void listarEnemigos() {
        for (int i = 0; i < Enemigos.size(); i++)
        {
            System.out.println(i + ". " + Enemigos.get(i));
        }
    }

    public static void listarTodos() {
        listarSpidermen();
        listarEnemigos();
    }

    public static void modificarSpiderman() {
        boolean bandera = true;
        OUTER:
        while (bandera)
        {
            listarSpidermen();
            System.out.print("Ingrese el indice del spiderman a modificar: ");
            int indice = leer.nextInt();
            if (indice < 0 || indice >= Spidermen.size())
            {
                System.out.println("Indice no valido");
                System.out.println("Intente otra vez");
                continue;
            }
            leer.nextLine();

            Personaje modificar = Spidermen.get(indice);
            System.out.println("Que desea modificar de " + modificar.getNombre());
            System.out.println("1) Nombre");
            System.out.println("2) Universo");
            System.out.println("3) Ataque");
            System.out.print("Ingrese su opcion: ");
            int op = leer.nextInt();
            leer.nextLine();
            switch (op)
            {
                case 1 ->
                {
                    System.out.println("Ingrese el nuevo nombre de " + modificar.getNombre() + ": ");
                    String nombre = leer.nextLine();
                    System.out.println("Antiguo nombre: " + modificar.getNombre());
                    modificar.setNombre(nombre);
                    System.out.println("Nuevo nombre: " + modificar.getNombre());
                    break OUTER;
                }
                case 2 ->
                {
                    System.out.println("Ingrese el nuevo universo de " + modificar.getNombre() + ": ");
                    String universo = leer.nextLine();
                    System.out.println("Antiguo universo: " + modificar.getUniverso());
                    modificar.setUniverso(universo);
                    System.out.println("Nuevo universo: " + modificar.getUniverso());
                    break OUTER;
                }
                case 3 ->
                {
                    System.out.println("Ingrese el nuevo danno de " + modificar.getNombre() + ": ");
                    double danno = leer.nextDouble();
                    leer.nextLine();
                    System.out.println("Antiguo danno: " + modificar.getNombre());
                    modificar.setAtaque(danno);
                    System.out.println("Nuevo danno: " + modificar.getNombre());
                    break OUTER;
                }
                default ->
                {
                    System.out.println("Input no valido :/");
                    System.out.println("Ingrese otra vez");
                }
            }
        }
    }

    public static void modificarEnemigo() {
        boolean bandera = true;
        OUTER:
        while (bandera)
        {
            listarEnemigos();
            System.out.print("Ingrese el indice del enemigo a modificar: ");
            int indice = leer.nextInt();
            if (indice < 0 || indice >= Spidermen.size())
            {
                System.out.println("Indice no valido");
                System.out.println("Intente otra vez");
                continue;
            }
            leer.nextLine();

            Personaje modificar = Enemigos.get(indice);
            System.out.println("Que desea modificar de " + modificar.getNombre());
            System.out.println("1) Nombre");
            System.out.println("2) Universo");
            System.out.println("3) Ataque");
            System.out.print("Ingrese su opcion: ");
            int op = leer.nextInt();
            leer.nextLine();
            switch (op)
            {
                case 1 ->
                {
                    System.out.println("Ingrese el nuevo nombre de " + modificar.getNombre() + ": ");
                    String nombre = leer.nextLine();
                    System.out.println("Antiguo nombre: " + modificar.getNombre());
                    modificar.setNombre(nombre);
                    System.out.println("Nuevo nombre: " + modificar.getNombre());
                    break OUTER;
                }
                case 2 ->
                {
                    System.out.println("Ingrese el nuevo universo de " + modificar.getNombre() + ": ");
                    String universo = leer.nextLine();
                    System.out.println("Antiguo universo: " + modificar.getUniverso());
                    modificar.setUniverso(universo);
                    System.out.println("Nuevo universo: " + modificar.getUniverso());
                    break OUTER;
                }
                case 3 ->
                {
                    System.out.println("Ingrese el nuevo danno de " + modificar.getNombre() + ": ");
                    double danno = leer.nextDouble();
                    leer.nextLine();
                    System.out.println("Antiguo danno: " + modificar.getNombre());
                    modificar.setAtaque(danno);
                    System.out.println("Nuevo danno: " + modificar.getNombre());
                    break OUTER;
                }
                default ->
                {
                    System.out.println("Input no valido :/");
                    System.out.println("Ingrese otra vez");
                }
            }
        }

    }

    public static void eliminarSpiderman() {
        listarSpidermen();
        System.out.print("Ingrese el indice del spiderman a eliminar: ");
        int indice = leer.nextInt();
        while (indice < 0 || indice > Spidermen.size())
        {
            System.out.println("Opcion no es valida");
            System.out.println("Intente otra vez");
            listarSpidermen();
            System.out.print("Ingrese el indice del spiderman a eliminar: ");
            indice = leer.nextInt();
        }
        leer.nextLine();
        
        Spidermen.remove(indice);
    }
    
    public static void eliminarEnemigo() {
        listarEnemigos();
        System.out.print("Ingrese el indice del enemigo a eliminar: ");
        int indice = leer.nextInt();
        while (indice < 0 || indice > Enemigos.size())
        {
            System.out.println("Opcion no es valida");
            System.out.println("Intente otra vez");
            listarSpidermen();
            System.out.print("Ingrese el indice del spiderman a eliminar: ");
            indice = leer.nextInt();
        }
        leer.nextLine();
        
        Enemigos.remove(indice);
    }
    
    public static void jugar() {
        if (Spidermen.size() != Enemigos.size()) {
            System.out.println("Deben haber mismo numero de spidermen como de enemigos");
        } else {
            Collections.shuffle(Spidermen);
            Collections.shuffle(Enemigos);
        }
    }
    
    public static void asignarVida() {
        for(Personaje spiderman: Spidermen) {
            spiderman.setVida(rand.nextInt(200, 600));
        }
        for(Personaje enemigo: Enemigos) {
            enemigo.setVida(rand.nextInt(200, 600));
        }
    }
}//fin clase

