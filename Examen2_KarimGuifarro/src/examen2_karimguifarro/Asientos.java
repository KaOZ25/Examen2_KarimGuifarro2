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
public class Asientos extends vehiculo{
    String material,tipo;
    boolean masaje;

    public Asientos() {
    }

    public Asientos(String material, String tipo, boolean masaje, int VIN, String color, String bateria, String carroceria, String interior, String infoentretenimiento, String asientos) {
        super(VIN, color, bateria, carroceria, interior, infoentretenimiento, asientos);
        this.material = material;
        this.tipo = tipo;
        this.masaje = masaje;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isMasaje() {
        return masaje;
    }

    public void setMasaje(boolean masaje) {
        this.masaje = masaje;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }
    
}
