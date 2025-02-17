package Punto;

import java.lang.Math;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double[] coordenadasPolares() {
        double r = Math.sqrt(x * x + y * y);
        double t = Math.atan2(y, x); // Corrección en la fórmula del ángulo
        return new double[]{r, t};
    }

    @Override
    public String toString() {
        double[] coordenadas = coordenadasPolares();
        return String.format(
            "Coordenadas cartesianas: (x=%.2f, y=%.2f), Coordenadas polares: (r=%.2f, θ=%.2f)",
            x, y, coordenadas[0], coordenadas[1]
        );
    }
}

