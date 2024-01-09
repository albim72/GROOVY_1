static void main(String[] args) {
  def mojZbior = [5,37,8,11,2,23,37] as java.util.Set

  def iterator = new MojIterator(mojZbior)
  while(iterator.hasNext()){
    println(iterator.next())
  }

  //wykorzystanie przez Groovy HashSet()

  def mz = new java.util.HashSet<>()

  mz.add("Pomarańcza")
  mz.add("Jabłko")
  mz.add("Gruszka")
  mz.add("Ananas")

  println(mz)

  def czyowoc = mz.contains("bBanan")
  def czyowoc2 = mz.contains("Gruszka")
  println("czy zbiór zawiera banana? $czyowoc")
  println("czy zbiór zawiera gruszkę? $czyowoc2")

  mz.remove("Ananas")
  println(mz)
}
