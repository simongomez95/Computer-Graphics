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
public class Punto3Dh {
    
    private double x;
    private double y;
    private double z;
    private double w;
    
    public Punto3Dh(double x1, double y1, double z1){
        x = x1;
        y = y1;
        z = z1;
        w = 1;
    }
    
    public Punto3Dh transf(Matriz3D m1){
        Punto3Dh pR = this;
        double[][] m = m1.getMatriz();
        
        pR.setX(x*m[0][0] + y*m[0][1] + z*m[0][2] + w*m[0][3]);
        pR.setY(x*m[1][0] + y*m[1][1] + z*m[1][2] + w*m[1][3]);
        pR.setZ(x*m[2][0] + y*m[2][1] + z*m[2][2] + w*m[2][3]);
        pR.setW(x*m[3][0] + y*m[3][1] + z*m[3][2] + w*m[3][3]);
        
        return pR;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
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

    public void setZ(double z) {
        this.z = z;
    }

    public void setW(double w) {
        this.w = w;
    }
    
    
    
}
