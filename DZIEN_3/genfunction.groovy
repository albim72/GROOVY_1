def <T extends Comparable<T>> T largeValue(T a, T b){
  if (a.compareTo(b) >0){
    return a
  }else {
    return b
  }
}

def Integer suma(int a, int b){
  return 2*(a+b)
}

def lString = largeValue("apple","orange")
def lInt = largeValue(22,12)
def lDbl = largeValue(0.34,7.65)

println("Większa wartość to: ${lString}")
println("Większa wartość to: ${lInt}")
println("Większa wartość to: ${lDbl}")

println("__________________________________")

println("wynik suma = ${suma(4,7)}")
