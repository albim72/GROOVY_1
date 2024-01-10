class MojaKlasa{
  def witaj(){
    return "Witaj użytkowniku"
  }
}

def metaClassMojaKlasa = MojaKlasa.metaClass

metaClassMojaKlasa.powitanie = {
  "Hej, jak się czujesz?"
}
metaClassMojaKlasa.a = 67

def myObj = new MojaKlasa()
println(myObj.witaj())
println(myObj.powitanie())
println(myObj.a)
