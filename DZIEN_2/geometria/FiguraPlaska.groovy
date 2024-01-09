class FiguraPlaska extends FiguraGeometryczna{
    
    double bok;

    FiguraPlaska(double bok) {
        this.bok = bok
    }
    
    
    @Override
    double PoliczPole() {
               
        return bok*bok
    }
}
