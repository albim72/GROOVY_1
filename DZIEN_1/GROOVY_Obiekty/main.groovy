
Sport s = new Sport("biegi ultra",6,"102km 19h 23min 56s")
println(s.InfoSport())
Special p = new Special()
p.setFirstName("Marcin")
p.setLastName("Albiniak")
p.address = ("Brzeska 23, Kraków")
println(p.getFirstName() + " " + p.getLastName() + " " + p.getAddress())

Employee e = new Employee(firstName: "Olga",lastName: "Kot",age: 30,address:"Złota 67. Toruń",idEmp: 456,firm: "ABC",mojsport: s)


println(e)
printf("pracownik %s %s, nr %d, firma: %s\n",e.firstName,e.lastName,e.idEmp,e.firm)
printf("pracownik %s %s, nr %d, firma: %s\n",e.getFirstName(),e.getLastName(),e.getIdEmp(),e.getFirm())
printf("sport: %s, lata uprawiania: %s, życiówka: %s",e.mojsport.dyscyplina,e.mojsport.lata_upr,e.mojsport.best_wynik)
printf("%s",e.mojsport.InfoSport())

