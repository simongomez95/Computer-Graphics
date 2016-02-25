package reto3b;

/**
 * Created by simon on 21/02/2016.
 */
public class Test_main {

    public void test() {
        Punto2Dh p2d1 = new Punto2Dh(100, 100);
        Punto2Dh p2d2 = new Punto2Dh(200, 200);

        Punto3Dh p3d1 = new Punto3Dh(100, 100, 0);
        Punto3Dh p3d2 = new Punto3Dh(200, 200, 10);

        Matriz2D m2d = new Matriz2D();
        Matriz3D m3d = new Matriz3D();

        Vector3D v3d1 = new Vector3D(new Punto3D(100, 100, 0), new Punto3D(200, 200, 10));
        Vector3D v3d2 = new Vector3D(new Punto3D(300, 300, 0), new Punto3D(400, 400, 10));
        Vector2D v2d1 = new Vector2D(new Punto2D(100, 100), new Punto2D(200, 200));
        Vector2D v2d2 = new Vector2D(new Punto2D(300, 300), new Punto2D(400, 400));


        System.out.println("Transf. p2d1 * m2d: x:" + p2d1.transf(m2d).getX() + " y: " + p2d1.transf(m2d).getY());
        System.out.println("Transf. p3d1 * m3d: x:" + p3d1.transf(m3d).getX() + " y: " + p3d1.transf(m3d).getY()+ " z: " + p3d1.transf(m3d).getZ());

        System.out.println("Suma v3d1+v3d2: x: " + v3d1.suma(v3d2).getX() + " y " + v3d1.suma(v3d2).getY() + " z: " + v3d1.suma(v3d2).getZ());
        System.out.println("Suma v2d1+v2d2: x: " + v2d1.suma(v2d2).getX() + " y " + v2d1.suma(v2d2).getY());

        System.out.println("Producto punto v3d1*v3d2:  " + v3d1.punto(v3d2));

        System.out.println("Producto punto v2d1*v2d2:  " + v2d1.punto(v2d2));

        System.out.println("Producto cruz v3d1*v3d2: x: "+v3d1.cruz(v3d2).getX()+" y: "+v3d1.cruz(v3d2).getY()+" z: "+v3d1.cruz(v3d2).getZ());

        System.out.println("Producto v3d1*10: x: "+v3d1.multEsc(10).getX()+" y: "+v3d1.multEsc(10).getY()+" z: "+v3d1.multEsc(10).getZ());

        System.out.println("Producto v2d1*10: x: "+v2d1.multEsc(10).getX()+" y: "+v2d1.multEsc(10).getY());

        double[][] mult3 = m3d.mult(m3d);

        System.out.println("Multiplicacion m3d*m3d: ");
        for(int i = 0;i<4;i++){

            for(int j = 0;j<4;j++){


                    System.out.println(mult3[i][j]);

            }
        }

        double[][] mult2 = m2d.mult(m2d);
        System.out.println("Multiplicacion m2d*m2d: ");
        for(int i = 0;i<3;i++){

            for(int j = 0;j<3;j++){


                System.out.println(mult2[i][j]);

            }
        }


    }

}
