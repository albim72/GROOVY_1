import java.io.IOException

static void main(String[] args) {
  def filePath = 'C:\\Temp\\mojedane.txt'

  try {
    def file = new File(filePath)
    def lines = file.readLines()


    lines.each{line ->println(line)}
  }catch (IOException e){
    println("wystąpił błąd: ${e.message}")
  }
}
