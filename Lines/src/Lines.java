/*
 * Ejemplo básico en Java2D
 *
 * Basado en el Tutorial de Java2D de ZetTutorial: http://zetcode.com/tutorials/java2dtutorial/
 *
 * Java tiene un tutorial oficial para Java2D: http://docs.oracle.com/javase/tutorial/2d/index.html
 */

//package points;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.JFrame;


public class Lines extends JPanel {

  /*
   * Este programa dibuja las lineas tangentes a una circunferencia de radio (radio) cada (i) grados usando el algoritmo
   * de Bresenham.
   *
   * Entregan: Simón Gómez Uribe y Lope Carvajal Peralta.
   */



    CohenSutherland cohenSutherland;

    public void clipping(int x0, int y0, int x1, int y1, Graphics2D g) {
        int origin = cohenSutherland.encode(x0, y0);
        int end = cohenSutherland.encode(x1, y1);
        while(true) {
            if ((origin | end) == 0) {
                g.setColor(Color.BLUE);
                bresenham(x0, y0, x1, y1, g);
                break;
            } else if ((origin & end) != 0) {
                g.setColor(Color.RED);
                bresenham(x0, y0, x1, y1, g);
                break;
            } else {
                int x = 0, y = 0, code;
                if (origin != 0) {
                    code = origin;
                } else {
                    code = end;
                }
                if ((code & cohenSutherland.UP) != 0) {           // point is above the clip rectangle
                    x = x0 + (x1 - x0) * (cohenSutherland.ymax - y0) / (y1 - y0);
                    y = cohenSutherland.ymax;
                } else if ((code & cohenSutherland.DOWN) != 0) { // point is below the clip rectangle
                    x = x0 + (x1 - x0) * (cohenSutherland.ymin - y0) / (y1 - y0);
                    y = cohenSutherland.ymin;
                } else if ((code & cohenSutherland.RIGHT) != 0) {  // point is to the right of clip rectangle
                    y = y0 + (y1 - y0) * (cohenSutherland.xmax - x0) / (x1 - x0);
                    x = cohenSutherland.xmax;
                } else if ((code & cohenSutherland.LEFT) != 0) {   // point is to the left of clip rectangle
                    y = y0 + (y1 - y0) * (cohenSutherland.xmin - x0) / (x1 - x0);
                    x = cohenSutherland.xmin;
                }
                // Now we move outside point to intersection point to clip
                // and get ready for next pass.
                if (code == origin) {
                    x0 = x;
                    y0 = y;
                    origin = cohenSutherland.encode(x0, y0);
                } else {
                    x1 = x;
                    y1 = y;
                    end = cohenSutherland.encode(x1, y1);
                }
                g.setColor(Color.RED);
                bresenham(x0, y0, x1, y1, g);
            }
        }
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
    @Override
  public void paintComponent(Graphics g) {
      super.paintComponent(g);



      Graphics2D g2d = (Graphics2D) g;

      Dimension size = getSize();

      int w =  size.width ;
      int h =  size.height ;

        cohenSutherland = new CohenSutherland(100, 400, 100, 200);
        bresenham(100, 100, 400, 100, g2d);
        bresenham(100, 200, 400, 200, g2d);
        bresenham(100, 100, 100, 200, g2d);
        bresenham(400, 100, 400, 200, g2d);

        int radio=100;
        g2d.setColor(Color.GREEN);

        //tangentes(g2d, w, h, radio);

        diezMilLineas(g2d, w, h);

        //bresenham(600, 600, 800, 800, g2d);
       // clipping(600, 600, 800, 800, g2d);


    }

    private void diezMilLineas(Graphics2D g2d, int w, int h) {
        for(int j=0; j <= 100; j++) {
            int x = (int) (Math.random()*w-w/2);
            int y = (int) (Math.random()*h-h/2);
            int xf = (int) (Math.random()*w-w/2);
            int yf = (int) (Math.random()*h-h/2);
            clipping(x, y, xf, yf, g2d);
        }
    }

    private void tangentes(Graphics2D g2d, int w, int h, int radio) {
        for(int i=0; i<=360; i=i+10) {
            double degRad = i*(Math.PI/180);
            int xl = (int) (radio*Math.cos(degRad));
            int yl = (int) (radio*Math.sin(degRad));

            int xt =  xl + yl;
            int yt = (yl - xl);
            bresenham(w/2+xl, h/2+yl, w/2+xt, h/2+yt, g2d);
        }
    }


    public static void main(String[] args) {

      //System.out.println("");
      // Crear un nuevo Frame
      JFrame frame = new JFrame("Lines");
      // Al cerrar el frame, termina la ejecución de este programa
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Agregar un JPanel que se llama Points (esta clase)
      frame.add(new Lines());
      // Asignarle tamaño
      frame.setSize(1024, 768);
      // Poner el frame en el centro de la pantalla
      frame.setLocationRelativeTo(null);
      // Mostrar el frame
      frame.setVisible(true);
  }
}