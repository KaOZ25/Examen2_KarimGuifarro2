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
public class Interior extends vehiculo{
    String mat_usado,tipo_volante;
    int botones;

    public Interior() {
    }

    public Interior(String mat_usado, String tipo_volante, int botones, int VIN, String color, String bateria, String carroceria, String interior, String infoentretenimiento, String asientos) {
        super(VIN, color, bateria, carroceria, interior, infoentretenimiento, asientos);
        this.mat_usado = mat_usado;
        this.tipo_volante = tipo_volante;
        this.botones = botones;
    }

    public String getMat_usado() {
        return mat_usado;
    }

    public void setMat_usado(String mat_usado) {
        this.mat_usado = mat_usado;
    }

    public String getTipo_volante() {
        return tipo_volante;
    }

    public void setTipo_volante(String tipo_volante) {
        this.tipo_volante = tipo_volante;
    }

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }
    
}
