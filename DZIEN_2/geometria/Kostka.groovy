class Kostka extends Figura3D{
    
    double bok

    Kostka(double bok) {
        this.bok = bok
    }

    @Override
    double PoliczPole() {
        return 6*bok*bok
    }

    @Override
    double PoliczObjetosc() {
        return bok*bok*bok
    }
}
