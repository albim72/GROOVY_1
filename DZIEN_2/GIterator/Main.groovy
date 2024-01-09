static void main(String[] args) {
def mojaKolekcja = [1,3,4,5,8,9,11,13,56,78,99]
  def iterator = new MojIterator(mojaKolekcja)

  while (iterator.hasNext()){
    println(iterator.next())
  }
}
