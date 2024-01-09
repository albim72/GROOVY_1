static void main(String[] args) {
  println(ColorEnum.values().size())
  println(ColorEnum.getColorEnum('white'))
  println(ColorEnum.WHITE.desc)

  println(ColorEnum.values().getClass())
}
