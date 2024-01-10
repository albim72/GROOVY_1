import java.io.IOException

static void main(String[] args) {
  def filePath = 'C://Temp//gdatafile.txt'

  def content = '''
    To jest przykładowy tekst
    zapis do pliku txt
    dodajemy więcej treści
  '''

  try {
    new File(filePath).text = content
    println("Dane zostały pomyślnie zapisane...")
  }catch (IOException e){
    println("Błąd!")
  }
}
