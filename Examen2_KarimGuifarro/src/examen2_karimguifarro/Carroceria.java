/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class Carroceria extends vehiculo{
    String tipo;
    int cap_maletero;

    public Carroceria() {
    }

    public Carroceria(String tipo, int cap_maletero, int VIN, String color, String bateria, String carroceria, String interior, String infoentretenimiento, String asientos) {
        super(VIN, color, bateria, carroceria, interior, infoentretenimiento, asientos);
        this.tipo = tipo;
        this.cap_maletero = cap_maletero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCap_maletero() {
        return cap_maletero;
    }

    public void setCap_maletero(int cap_maletero) {
        this.cap_maletero = cap_maletero;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }
}
