/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinabebidas_3_2025;

/**
 * Clase Maquina de bebidas
 * 
 * Gestiona la utilización de la máquina de bebidas
 * @author esther
 * @version 1.0, 2025-04-09
 */
public class MaquinaDeBebidas {
    
    private ContadorDeMonedas contador; //Contador de monedas de la maquina
    private DispensadorDeBotes cola, //Cinco dispensadores de botes
    limon,
    naranja,
    tonica,
    agua;
    private float precio;
    
    /**
     * Constructor con 3 parametros
     * @param m cantidad inicial de monedas para el cambio
     * @param b cantidad inicial de botes en los dispensadores
     * @param pvp precio de las bebidas
     */
    public MaquinaDeBebidas (float m, int b, float pvp) {

        this.precio = pvp;
        this.contador = new ContadorDeMonedas(m);
        this.cola = new DispensadorDeBotes(b);
        this.limon = new DispensadorDeBotes(b);
        this.naranja = new DispensadorDeBotes(b);
        this.tonica = new DispensadorDeBotes(b);
        this.agua = new DispensadorDeBotes(b);
    }

    /**
     * Responde a una acción del usuario. Discrimina el tipo de accion y utiliza las operaciones privadas
     * @param o orden del usuario
     */
    public void darOrden (char o) {

        if (Character.isDigit(o)) {
            ordenMonedas(o);
        } else if (Character.isLetter(o)) {
            ordenSeleccion(o);
        }
    }

    /**
     * Visualiza la informacion de interes sobre la maquina : botes en cada dispensador, precio de las bebidas, saldo del cliente
     */
    public void visualizarMaquina () {

        System.out.println("Botes en el dispensador de cola: " + cola.botesDisponibles());
        System.out.println("Botes en el dispensador de limón: " + limon.botesDisponibles());
        System.out.println("Botes en el dispensador de naranja: " + naranja.botesDisponibles());
        System.out.println("Botes en el dispensador de tónica: " + tonica.botesDisponibles());
        System.out.println("Botes en el dispensador de agua: " + agua.botesDisponibles());

        System.out.println("Precio de las bebidas: " + precio);
        System.out.println("Saldo del cliente: " + contador.saldo());
        
    }

    /**
     * Realiza las acciones relacionadas con la introducción de monedas
     * @param o orden del usuario
     */
    private void ordenMonedas (char o) {

        switch (o) {
            case 'A':
                contador.insertarMoneda(0.05F);
                break;

            case 'B':
                contador.insertarMoneda(0.10F);
                break;

            case 'C':
                contador.insertarMoneda(0.20F);
                break;

            case 'D':
                contador.insertarMoneda(0.50F);
                break;

            case 'E':
                contador.insertarMoneda(1F);
                break;

            case 'R':
                contador.darCambioDe(precio);
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }

    /**
     * Realiza las acciones relacionadas con la selección de una bebida
     * @param o orden del usuario
     */
    private void ordenSeleccion (char o) {

        switch (o) {
            case '1':
                if (cola.pulsarBoton()) {
                    System.out.println("Has seleccionado un bote de cola");
                } else {
                    System.out.println("No hay botes de cola disponibles");
                }
                break;
                
            case '2':
                if (limon.pulsarBoton()) {
                    System.out.println("Has seleccionado un bote de limón");
                } else {
                    System.out.println("No hay botes de limón disponibles");
                }
                break;
                
            case '3':
                if (naranja.pulsarBoton()) {
                    System.out.println("Has seleccionado un bote de naranja");
                } else {
                    System.out.println("No hay botes de naranja disponibles");
                }
                break;
                
            case '4':
                if (tonica.pulsarBoton()) {
                    System.out.println("Has seleccionado un bote de tónica");
                } else {
                    System.out.println("No hay botes de tónica disponibles");
                }
                break;
                
            case '5':
                if (agua.pulsarBoton()) {
                    System.out.println("Has seleccionado un bote de agua");
                } else {
                    System.out.println("No hay botes de agua disponibles");
                }
                break;
        
            default:
                break;
        }
    }
    
}
