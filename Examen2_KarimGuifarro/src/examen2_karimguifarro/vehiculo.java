
package examen2_karimguifarro;


public class vehiculo {
    int VIN;
    String color;
    Bateria bateria;
    Carroceria carroceria;
    Interior interior;
    Infoentretenimiento  infoentretenimiento;
    Asientos asientos;

    public vehiculo() {
    }

    public vehiculo(int VIN, String color, Bateria bateria, Carroceria carroceria, Interior interior, Infoentretenimiento infoentretenimiento, Asientos asientos) {
        this.VIN = VIN;
        this.color = color;
        this.bateria = bateria;
        this.carroceria = carroceria;
        this.interior = interior;
        this.infoentretenimiento = infoentretenimiento;
        this.asientos = asientos;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public Infoentretenimiento getInfoentretenimiento() {
        return infoentretenimiento;
    }

    public void setInfoentretenimiento(Infoentretenimiento infoentretenimiento) {
        this.infoentretenimiento = infoentretenimiento;
    }

    public Asientos getAsientos() {
        return asientos;
    }

    public void setAsientos(Asientos asientos) {
        this.asientos = asientos;
    }
    
}
