static void main(String[] args) {
    def kwadrat = new FiguraPlaska(6)
    println("Pole kwadratu: ${kwadrat.PoliczPole()}")

    def szescian = new Kostka(5)
    println("Pole sześcianu: ${szescian.PoliczPole()}")
    println("Objętość sześcianu: ${szescian.PoliczObjetosc()}")

}
