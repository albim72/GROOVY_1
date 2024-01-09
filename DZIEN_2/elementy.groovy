def name  = "Janek"
def s1 = "Witaj $name"
def s2 = 'Witaj $name'
def s3 = s2  + " -> Witaj $name"

println(s1)
println(s2)
println(s3)

println(s1.class)
println(s2.class)
println(s3.class)

def data = new Date()
println("Data spotkania: $data")
println("Data spotkania: ${data.format('dd-MM-yyyy')}")
