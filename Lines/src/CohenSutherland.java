/**
 * Created by nekothecat on 2/12/16.
 */
public class CohenSutherland {

    static int INSIDE = 0;
    static int LEFT = 1;
    static int RIGHT = 2;
    static int DOWN = 4;
    static int UP = 8;

    int xmin;
    int xmax;
    int ymin;
    int ymax;

    public CohenSutherland(int xmin, int xmax, int ymin, int ymax) {
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymin = ymin;
        this.ymax = ymax;
    }



   public int encode(int x, int y) {
        int code = 0;
        if (x < xmin)
            code |= LEFT;
        else if (x > xmax)
            code |= RIGHT;
        if (y < ymin)
            code |= DOWN;
        else if (y > ymax)
            code |= UP;

        return code;

    }
}
