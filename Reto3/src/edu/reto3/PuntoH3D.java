package edu.reto3;

/**
 * Created by nekothecat on 2/15/16.
 */
public class PuntoH3D {

    private double _x;
    private double _y;
    private double _z;
    private double _w;

    public PuntoH3D(double x, double y, double z, double w) {
        _x = x;
        _y = y;
        _z = z;
        _w = w;
    }

    public double get_x() {
        return _x;
    }

    public double get_y() {
        return _y;
    }

    public double get_z() {
        return _z;
    }

    public double get_w() { return _w;}
}
