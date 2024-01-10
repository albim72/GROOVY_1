static void main(String[] args) {
  def stringbox = new Box<String>("Takie tam coś..")
  def intbox = new Box<Integer>(433)
  def dblbox = new Box<Double>(6.234567)

  println("Zawartość stringbox: ${stringbox.getItem()}")
  println("Zawartość intbox: ${intbox.getItem()}")
  println("Zawartość dblbox: ${dblbox.getItem()}")
}
