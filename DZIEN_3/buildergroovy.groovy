import java.lang.String

class Car{
  String make
  String model
  int year
  String color

  String toString(){
    return "Car(make: $make, model: $model, year:$year, color: $color"
  }
}

//klasa Builder dla obiektu Car

class CarBuilder{
  String make
  String model
  int year
  String color

  Car build() {
    def car = new Car()
    car.make = make
    car.model = model
    car.year = year
    car.color = color
    return car
  }

  CarBuilder withMake(String make){
    this.make = make
    return this
  }

  CarBuilder withModel(String model){
    this.model = model
    return this
  }

  CarBuilder withYear(int year){
    this.year = year
    return this
  }

  CarBuilder withColor(String color){
    this.color = color
    return this
  }
}

def car = new CarBuilder()
    .withMake("Dodge")
    .withModel("Durango")
    .withYear(2022)
    .withColor("Black")
    .build()

println(car)
