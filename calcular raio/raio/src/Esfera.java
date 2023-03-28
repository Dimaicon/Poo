import java.lang.Math;

public class Esfera {
    private double raio;
    private double volume;

    public Esfera(double raio) {
        this.raio = raio;
        this.volume = calcularVolume();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
        this.volume = calcularVolume();
    }

    public double getVolume() {
        return volume;
    }

    private double calcularVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(raio, 3);
    }
}

