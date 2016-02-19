package edu.reto3;

/**
 * Created by nekothecat on 2/15/16.
 */
public class Vector3D {

    private Punto3D _puntoIni;
    private Punto3D _puntoFin;

    private double _comp_x;
    private double _comp_y;
    private double _comp_z;

    private double _valorEscalar;

    public Vector3D(Punto3D puntoIni, Punto3D puntoFin) {
        _puntoIni = puntoIni;
        _puntoFin = puntoFin;
        _comp_x = componentes()[0];
        _comp_y = componentes()[1];
        _comp_z = componentes()[2];

    }

    public Vector3D(double comp_x, double comp_y, double comp_z) {
        _comp_x = comp_x;
        _comp_y = comp_y;
        _comp_z = comp_z;
    }

    public Vector3D(double escalar) {
        _valorEscalar = escalar;
    }

    public double get_comp_x () {
        return _comp_x;
    }

    public double get_comp_y () {
        return _comp_y;
    }

    public double get_comp_z () {
        return _comp_z;
    }

    public double get_valorEscalar() {
        return _valorEscalar;
    }

    private double[] componentes() {

        double comp_x = _puntoFin.get_x() - _puntoIni.get_x();
        double comp_y = _puntoFin.get_y() - _puntoIni.get_y();
        double comp_z = _puntoFin.get_z() - _puntoIni.get_z();
        double[] comps = {comp_x, comp_y, comp_z};


        return comps;
    }

    public Vector3D sumar (Vector3D otro) {
        double comp_x_suma = _comp_x + otro.get_comp_x();
        double comp_y_suma = _comp_y + otro.get_comp_y();
        double comp_z_suma = _comp_z + otro.get_comp_z();
        return new Vector3D(comp_x_suma, comp_y_suma, comp_z_suma);
    }

    public Vector3D prodPunto (Vector3D otro) {
        double escalar = _comp_x*otro.get_comp_x() + _comp_y * otro.get_comp_y() + _comp_z * otro.get_comp_z();
        return new Vector3D(escalar);
    }
}
