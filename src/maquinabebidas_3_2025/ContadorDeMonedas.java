package maquinabebidas_3_2025;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author Silvia Perea
 * Descripción: Clase que permite contar monedas
 * Fecha: 09/04/2025
 */
class ContadorDeMonedas {

    private float cantidad; //Dinero introducido por el usuario actual.
    private float disponible; //Dinero almacenado en la maquina,se utiliza para dar cambio.

    /**
     * Inicializa el objeto y fija el cambio inicialmente disponible
     *
     * @param i saldo inicialmente disponible para cambios
     */
    public ContadorDeMonedas(float i) {
        cantidad = i;
    }

    /**
     * Informa sobre el saldo actual del cliente
     *
     * @return float, el saldo del cliente
     */
    public float saldo() {
        return disponible - cantidad;
    }

    /**
     * Insertar la moneda m
     *
     * @param m float, la cantidad de dinero introducida
     */
    public void insertarMoneda(float m) {
        cantidad += m;
    }

    /**
     * Devuelve el cambio, si es posible una vez entregado el cambio, el dinero
     * introducido por el cliente pasa a engrosar el disponible de la maquina
     *
     * @param c el precio del producto
     * @return el cambio, negativo si falta dinero
     */
    public float darCambioDe(float c) {
        float saldo = disponible - cantidad;
        float cambio = c - saldo;
        return cambio;
    }

    /**
     * El cliente recupera el dinero introducido si todavia no se ha realizado
     * la venta
     *
     * @return float, la cantidad devuelta
     */
    public float retornar() {
        float dineroDevuelto = cantidad;  
        cantidad = 0;  
        return dineroDevuelto;  
    }
}

