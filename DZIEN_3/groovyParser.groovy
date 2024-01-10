import groovy.xml.XmlParser

static void main(String[] args) {
  def parser = new XmlParser()
  def doc = parser.parse("C:/Temp/Movies.xml")

  doc.movie.each{
    bk->
      println("***********************")
      print("Tytuł filmu: ")
      println("${bk['@title']}")

      print("Typ filmu: ")
      println("${bk.format[0].text()}")

      print("Rok produkcji filmu: ")
      println("${bk.year[0].text()}")

      print("Klasyfikacja filmu: ")
      println("${bk.rating[0].text()}")

      print("Liczba gwiazdek filmu: ")
      println("${bk.stars[0].text()}")

      print("Opis filmu: ")
      println("${bk.description[0].text()}")

  }

}
