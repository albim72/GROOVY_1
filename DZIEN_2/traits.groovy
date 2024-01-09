class Testowa{
    int d;

    Testowa(int d) {
        this.d = d
    }

    int showd(){
        return d
    }
}

trait gg {
    String msg(){
        "ważna informacja: gg"
    }
}
interface abc{
    double rabat(double a,double b)
}

trait Test implements abc{
    int num = 100
    int printNum(){
        return num*2
    }
}

trait Informacje implements Test{
  String pobierzInfo() {
    "to jest trait Informacje"
  }
    abstract int oblicz(d)
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

interface dodatek{
    boolean czyjest()
}

class MojaKlasa implements Informacje, Osoba, dodatek{


    @Override
    double rabat(double a, double b) {
        return (a+b)*0.06
    }

    @Override
    boolean czyjest() {
        return true
    }


    @Override
    int oblicz(java.lang.Object d) {
        return d*9
    }
}

static void main(String[] args) {
    def obiekt = new MojaKlasa()
    println(obiekt.pobierzInfo())
    obiekt.UstawImie("Karol")
    println(obiekt.pobierzImie())
    println(obiekt.printNum())
    println(obiekt.rabat(34,7))
    println(obiekt.czyjest())
    println(obiekt.oblicz(34))
}
