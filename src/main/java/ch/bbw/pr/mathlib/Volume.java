package ch.bbw.pr.mathlib;

/**
 * Berechnet Volumen verschiedener Koerper.
 *
 * @author Milo Ruf, 5IA23b
 * @version 1.0.0
 */
public class Volume {

    /**
     * Volumen eines Zylinders: V = pi * r^2 * h
     *
     * @param radius Radius der Grundflaeche
     * @param height Hoehe des Zylinders
     * @return das Volumen
     */
    public double cylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    /**
     * Volumen einer Kugel: V = 4/3 * pi * r^3
     *
     * @param radius Radius der Kugel
     * @return das Volumen
     */
    public double sphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Volumen eines Wuerfels: V = a^3
     *
     * @param edge Kantenlaenge
     * @return das Volumen
     */
    public double cube(double edge) {
        return edge * edge * edge;
    }
}
