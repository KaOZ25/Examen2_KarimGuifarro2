/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_karimguifarro;


public class Bateria extends vehiculo{
  String material;
 int autonomia;

    public Bateria() {
    }

    public Bateria(String material, int autonomia, int VIN, String color, String bateria, String carroceria, String interior, String infoentretenimiento, String asientos) {
        super(VIN, color, bateria, carroceria, interior, infoentretenimiento, asientos);
        this.material = material;
        this.autonomia = autonomia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }
    
}
