/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Richard Rebull
 */
public class DispensadorDeBebidas {
    private int botes; // Número actual de botes

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

