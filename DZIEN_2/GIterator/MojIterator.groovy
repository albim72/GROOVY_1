class MojIterator {
    def kolekcja
    def indeks = 0

    MojIterator(kolekcja) {
        this.kolekcja = kolekcja
    }
    
    boolean hasNext() {
        indeks < kolekcja.size()
    }
    
    def next(){
        def wartosc = kolekcja[indeks]
        indeks++
        wartosc
    }
}
