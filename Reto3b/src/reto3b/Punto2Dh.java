/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3b;

/**
 *
 * @author lope
 */
public class Punto2Dh {
    
    private double x;
    private double y;
    private double w;
    
    public Punto2Dh(double x1, double y1){
        x = x1;
        y = y1;
        w = 1;
    }
    
    public Punto2Dh transf(Matriz2D m1){
        Punto2Dh pR = this;
        double[][] m = m1.getMatriz();
        
        pR.setX(x*m[0][0] + y*m[0][1] + w*m[0][2]);
        pR.setY(x*m[1][0] + y*m[1][1] + w*m[1][2]);
        pR.setW(x*m[2][0] + y*m[2][1] + w*m[2][2]);
        
        return pR;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getW() {
        return w;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setW(double w) {
        this.w = w;
    }
    
    
}
