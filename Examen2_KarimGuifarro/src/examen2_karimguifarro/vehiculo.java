
package examen2_karimguifarro;


public class vehiculo {
    int VIN;
    String color, bateria,carroceria,interior, infoentretenimiento,asientos;

    public vehiculo() {
    }

    public vehiculo(int VIN, String color, String bateria, String carroceria, String interior, String infoentretenimiento, String asientos) {
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

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getInfoentretenimiento() {
        return infoentretenimiento;
    }

    public void setInfoentretenimiento(String infoentretenimiento) {
        this.infoentretenimiento = infoentretenimiento;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "VIN=" + VIN + '}';
    }

    
}
