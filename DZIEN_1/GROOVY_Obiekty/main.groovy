Special p = new Special()
p.setFirstName("Marcin")
p.setLastName("Albiniak")
p.address = ("Brzeska 23, Kraków")
println(p.getFirstName() + " " + p.getLastName() + " " + p.getAddress())

Employee e = new Employee(firstName: "Olga",lastName: "Kot",age: 30,address:"Złota 67. Toruń",idEmp: 456,firm: "ABC")

println(e)
printf("pracownik %s %s, nr %d, firma: %s\n",e.firstName,e.lastName,e.idEmp,e.firm)
printf("pracownik %s %s, nr %d, firma: %s\n",e.getFirstName(),e.getLastName(),e.getIdEmp(),e.getFirm())
