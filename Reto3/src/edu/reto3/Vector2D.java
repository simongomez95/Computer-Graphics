package edu.reto3;

/**
 * Created by nekothecat on 2/15/16.
 */
public class Vector2D {

    private Punto2D _puntoIni;
    private Punto2D _puntoFin;

    private double _comp_x;
    private double _comp_y;

    private double _valorEscalar;

    public Vector2D(Punto2D puntoIni, Punto2D puntoFin) {
        _puntoIni = puntoIni;
        _puntoFin = puntoFin;
        _comp_x = componentes()[1];
        _comp_y = componentes()[0];

    }

    public Vector2D(double comp_x, double comp_y) {
        _comp_x = comp_x;
        _comp_y = comp_y;
    }

    public Vector2D(double escalar) {
        _valorEscalar = escalar;
    }

    private double[] componentes() {

        double comp_x = _puntoFin.get_x() - _puntoIni.get_x();
        double comp_y = _puntoFin.get_y() - _puntoIni.get_y();
        double[] comps = {comp_y, comp_x};


        return comps;
    }

    public double get_comp_x () {
        return _comp_x;
    }

    public double get_comp_y () {
        return _comp_y;
    }

    public double get_valorEscalar() {
        return _valorEscalar;
    }

    public Vector2D sumar (Vector2D otro) {
        double comp_x_suma = _comp_x + otro.get_comp_x();
        double comp_y_suma = _comp_y + otro.get_comp_y();
        return new Vector2D(comp_x_suma, comp_y_suma);
    }

    public Vector2D prodPunto (Vector2D otro) {
        double escalar = _comp_x*otro.get_comp_x() + _comp_y * otro.get_comp_y();
        return new Vector2D(escalar);
    }
}
