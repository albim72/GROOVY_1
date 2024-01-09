
trait Informacje{
  String pobierzInfo() {
    "to jest trait Informacje"
  }
}

trait Osoba{
    String imie //właściwość w trait
    
        void UstawImie(String noweimie){
        imie = noweimie
    }
    String pobierzImie() {
        return  "to są dane osoby: $imie"
    }
}

class MojaKlasa implements Informacje, Osoba{

}

static void main(String[] args) {
    def obiekt = new MojaKlasa()
    println(obiekt.pobierzInfo())
    obiekt.UstawImie("Karol")
    println(obiekt.pobierzImie())
}
