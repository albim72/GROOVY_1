def liczby = [2,14,55,67,8,19,15,90]
println("Zawartość tablicy 'liczby': $liczby")
println("Pierwszy element tablicy 'liczby': ${liczby[0]}")
println("Czwarty element tablicy 'liczby': ${liczby[3]}")

liczby[2] = 100
println("Zawartość tablicy 'liczby': $liczby")

liczby << 17
println("Zawartość tablicy 'liczby': $liczby")
