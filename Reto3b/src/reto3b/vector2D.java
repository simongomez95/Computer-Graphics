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
public class vector2D {

    private double x;
    private double y;
    
    public vector2D(punto2D p1, punto2D p2){
        x = p2.getX() - p1.getX();
        y = p2.getY() - p1.getY();
    }
    
    public vector2D suma(vector2D v1){
        vector2D vR = v1;
        
        vR.setX(this.x + v1.getX());
        vR.setY(this.y + v1.getY());
        
        return vR;
    }
    
    public vector2D multEsc(double e){
        vector2D vR = this;
        
        vR.setX(this.x*e);
        vR.setY(this.y*e);
        
        return vR;
    }
    
    public double punto(vector2D v1){
        return (this.x*v1.getX() + this.y*v1.getY());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}
