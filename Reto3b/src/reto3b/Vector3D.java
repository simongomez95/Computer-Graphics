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
public class Vector3D {
    
    private double x;
    private double y;
    private double z;
    
    public Vector3D(Punto3D p1, Punto3D p2){
        x = p2.getX() - p1.getX();
        y = p2.getY() - p1.getY();
        z = p2.getZ() - p1.getZ();
    }
    
    public Vector3D multEsc(double e){
        Vector3D vR = this;
        
        vR.setX(this.x*e);
        vR.setY(this.y*e);
        vR.setZ(this.z*e);
        
        return vR;
    }
    
    public Vector3D suma(Vector3D v1){
        Vector3D vR = v1;
        
        vR.setX(this.x + v1.getX());
        vR.setY(this.y + v1.getY());
        vR.setZ(this.z + v1.getZ());
        
        return vR;
    }
    
    public Vector3D cruz(Vector3D v1){
        Vector3D vR = v1;
        
        vR.setX(this.y*v1.getZ()-this.z*v1.getY());
        vR.setY(-1*(this.x*v1.getZ()-this.z*v1.getX()));
        vR.setZ(this.x*v1.getY()-this.y*v1.getX());
        
        return vR;
    }
    
    public double punto(Vector3D v1){
        return (this.x*v1.getX() + this.y*v1.getY() + this.z*v1.getZ());
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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    
}
