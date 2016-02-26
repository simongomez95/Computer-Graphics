package reto4;

import reto3b.Punto2Dh;

import java.awt.*;
import java.util.List;

/**
 * Created by nekothecat on 2/25/16.
 */
public class ObjectDraw {

    FileReader fr;
    public ObjectDraw (FileReader f) {
        this.fr = f;
    }

    public  void bresenham(int x0, int y0, int x1, int y1, Graphics2D g) {


        int dx =  Math.abs(x1-x0), sx = x0<x1 ? 1 : -1;
        int dy = -Math.abs(y1-y0), sy = y0<y1 ? 1 : -1;
        int err = dx+dy, e2; /* error value e_xy */

        for(;;){  /* loop */
            g.drawLine(x0,y0, x0, y0);
            if (x0==x1 && y0==y1) break;
            e2 = 2*err;
            if (e2 >= dy) { err += dy; x0 += sx; } /* e_xy+e_x > 0 */
            if (e2 <= dx) { err += dx; y0 += sy; } /* e_xy+e_y < 0 */
        }
        return;
    }

    public void dibujarObjeto(Graphics2D g2d) {
        List<Punto2Dh> puntos = fr.getPuntos();
        List<int[]> aristas = fr.getAristas();

        for(int i=0; i < aristas.size(); i++) {
            int x0 = (int) puntos.get(aristas.get(i)[0]).getX();
            int y0 = (int) puntos.get(aristas.get(i)[0]).getY();
            int x1 = (int) puntos.get(aristas.get(i)[1]).getX();
            int y1 = (int) puntos.get(aristas.get(i)[1]).getY();
            bresenham(x0, y0, x1, y1, g2d);
        }
    }
}
