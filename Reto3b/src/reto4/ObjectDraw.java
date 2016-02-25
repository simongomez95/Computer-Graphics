package reto4;

import reto3b.Punto2Dh;

import java.awt.*;
import java.util.List;

/**
 * Created by nekothecat on 2/25/16.
 */
public class ObjectDraw {

    FileReader fr;
    Graphics2D g2d;
    public ObjectDraw (FileReader f, Graphics2D g2) {
        this.fr = f;
        this.g2d = g2;
    }

    public void dibujarObjeto() {
        List<Punto2Dh> puntos = fr.getPuntos();
        List<int[]> aristas = fr.getAristas();

        for(int i=0; i < aristas.size(); i++) {
            int x0 = (int) puntos.get(aristas.get(i)[0]).getX();
            int y0 = (int) puntos.get(aristas.get(i)[0]).getY();
            int x1 = (int) puntos.get(aristas.get(i)[1]).getX();
            int y1 = (int) puntos.get(aristas.get(i)[1]).getY();
            g2d.drawLine(x0, y0, x1, y1);
        }
    }
}
