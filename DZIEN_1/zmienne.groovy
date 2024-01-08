static void main(String[] args) {
  int x = 7
  int h = 15
  def _name = "Janek"

  println(x)
  println(h)
  println(_name)

  Scanner sc = new Scanner(System.in)

  println("Podaj wartość q: ")
  def wr = sc.nextFloat()
  println(wr)

  def range = 15..55;
  println(range)
  println(range.get(4))
}


