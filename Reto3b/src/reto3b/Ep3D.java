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
public class Ep3D {
    
    private double x0;
    private double y0;
    private double z0;
    private double a;
    private double b;
    private double c;
    private double t;
    
    public Ep3D(double x1, double y1, double z1, double x2, double y2, double z2){
        x0 = x1;
        y0 = y1;
        z0 = z1;
        a = x2 - x1;
        b = y2 - y1;
        c = z2 - z1;
        t = 0;
    }
}
