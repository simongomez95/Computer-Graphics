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
public class Matriz3D {
    
    private double[][] matriz;
    
    public Matriz3D(){
        matriz = new double[4][4];
        matriz[0][0] = 2;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 3;
        matriz[2][0] = 2;
        matriz[2][1] = 2;
        matriz[2][2] = 3;
        matriz[0][2] = 3;
        matriz[1][2] = 3;
        matriz[0][3] = 1;
        matriz[1][3] = 1;
        matriz[2][3] = 1;
        matriz[3][3] = 1;
        matriz[3][0] = 1;
        matriz[3][1] = 1;
        matriz[3][2] = 1;
    }
    
    public double[][] mult(Matriz3D m1){
        double[][]m = m1.getMatriz();
        double[][]mR = new double[4][4];
        
        for(int i = 0;i<4;i++){
            
            for(int j = 0;j<4;j++){
                
                for(int k = 0;k<4;k++){
                    mR[i][j] += this.matriz[i][k]*m[k][j];
                }
            }
        }
        
        return mR;
    }
    
    public double[][] transp(){
        double[][] mR = this.matriz;
        for(int j = 0;j<4;j++){
               
            for(int k = 0;k<4;k++){
                mR[j][k] += this.matriz[k][j];
            }
        }
        return mR;
    }

    public double[][] getMatriz() {
        return matriz;
    }    
    
}
