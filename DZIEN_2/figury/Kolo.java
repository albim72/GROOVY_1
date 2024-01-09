public class Kolo extends Figura {


    public Kolo(double a) {
        super(a);
    }

    @Override
    public double policzPole() {
        return Math.PI*a*a;
    }

    //napisz klasę Kolo reprezentującą figurę Koło, wyznacz pole i policz pole koła dla promienia 5.5
    //pole koła = Pi*r^2
}
