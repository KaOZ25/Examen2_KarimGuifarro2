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
public class Infoentretenimiento extends vehiculo{
    int cant_pantalla,ancho_pantalla;
    boolean visor;

    public Infoentretenimiento() {
    }

    public Infoentretenimiento(int cant_pantalla, int ancho_pantalla, boolean visor, int VIN, String color, String bateria, String carroceria, String interior, String infoentretenimiento, String asientos) {
        super(VIN, color, bateria, carroceria, interior, infoentretenimiento, asientos);
        this.cant_pantalla = cant_pantalla;
        this.ancho_pantalla = ancho_pantalla;
        this.visor = visor;
    }

    public int getCant_pantalla() {
        return cant_pantalla;
    }

    public void setCant_pantalla(int cant_pantalla) {
        this.cant_pantalla = cant_pantalla;
    }

    public int getAncho_pantalla() {
        return ancho_pantalla;
    }

    public void setAncho_pantalla(int ancho_pantalla) {
        this.ancho_pantalla = ancho_pantalla;
    }

    public boolean isVisor() {
        return visor;
    }

    public void setVisor(boolean visor) {
        this.visor = visor;
    }

    public String getInfoentretenimiento() {
        return infoentretenimiento;
    }

    public void setInfoentretenimiento(String infoentretenimiento) {
        this.infoentretenimiento = infoentretenimiento;
    }
    
}
