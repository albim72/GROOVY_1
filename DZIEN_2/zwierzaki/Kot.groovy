class Kot extends Zwierze{
    Kot(String gatunek) {
        super(gatunek)
    }

    @Override
    void dzwiek() {
        println("$gatunek: Miauczenie -> miau miau")
    }
}
