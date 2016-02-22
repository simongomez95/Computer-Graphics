package reto3b;

/**
 * Created by simon on 21/02/2016.
 */
public class test_main {

    public void test() {
        punto2Dh p2d1 = new punto2Dh(100, 100);
        punto2Dh p2d2 = new punto2Dh(200, 200);

        punto3Dh p3d1 = new punto3Dh(100, 100, 0);
        punto3Dh p3d2 = new punto3Dh(200, 200, 10);

        matriz2D m2d = new matriz2D();
        matriz3D m3d = new matriz3D();

        vector3D v3d1 = new vector3D(new punto3D(100, 100, 0), new punto3D(200, 200, 10));
        vector3D v3d2 = new vector3D(new punto3D(300, 300, 0), new punto3D(400, 400, 10));
        vector2D v2d1 = new vector2D(new punto2D(100, 100), new punto2D(200, 200));
        vector2D v2d2 = new vector2D(new punto2D(300, 300), new punto2D(400, 400));


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
