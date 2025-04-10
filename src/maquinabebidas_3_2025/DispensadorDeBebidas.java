package maquinabebidas_3_2025;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Richard Rebull
 * Fecha:09/04/2025
 * Descripcion: Hacer la clase Dispensador de bebidas
 */
public class DispensadorDeBebidas {
    private int botes; 

    public DispensadorDeBebidas(int i) {
        if (i >= 0)
            botes = i;
        else
            botes = 0;
    }

    public boolean pulsarBoton() {
        if (botes > 0) {
            botes--;
            return true;
        } else {
            return false;
        }
    }

    public int botesDisponibles() {
        return botes;
    }
}

