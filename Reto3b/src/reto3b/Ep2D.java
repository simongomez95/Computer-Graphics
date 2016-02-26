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
public class Ep2D {
    
    private double x0;
    private double y0;
    private double a;
    private double b;
    private double t;
    
    public Ep2D(double x1, double y1, double x2, double y2){
        x0 = x1;
        y0 = y1;
        a = x2 - x1;
        b = y1 - y1;
        t = 0;
    }
}
