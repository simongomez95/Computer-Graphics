package edu.reto3;

/**
 * Created by nekothecat on 2/19/16.
 */
public class Matriz2D {

    private double[][] matriz;

    public Matriz2D(){}

    public double[][] getMatriz() {

        return matriz;

    }

    public Matriz2D sumarMatriz(Matriz2D otro) {


        Matriz2D resultado;

        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                matriz[i][j] = matriz[i][j] + otro.getMatriz()[i][j];

            }
        }

        return resultado;
    }

    public Matriz2D multiplicarEscalar(double otro) {

        Matriz2D resultado;

        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                matriz[i][j] = matriz[i][j]*otro;
            }
        }


        return resultado;
    }

}
