public class main {

    public static void main(String[] arg){
        Point p = new Point(1, 4);
        p.scale(2);
        p.move( new Point(2, -5) );
        Point q = new Point();

        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("Distance = " + p.distance(q));
        System.out.println("p.equals(q) = " + p.equals(q));
    }

}
