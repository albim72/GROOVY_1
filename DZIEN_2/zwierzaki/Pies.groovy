class Pies extends Zwierze{
    Pies(String gatunek) {
        super(gatunek)
    }

    @Override
    void dzwiek() {
        println("$gatunek: Szczekanie -> hau hau")
    }
}
