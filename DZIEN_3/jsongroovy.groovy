import groovy.json.JsonSlurper

static void main(String[] args) {
  def jsonSource='''
{
  "employees": [
    {
      "id": 1,
      "name": "John Doe",
      "position": "Developer"
    },
    {
      "id": 2,
      "name": "Jane Smith",
      "position": "Designer"
    },
    {
      "id": 3,
      "name": "Tom Jones",
      "position": "Manager"
    }
  ]
}

'''

  try{
    def slurper = new JsonSlurper()
    def json = slurper.parseText(jsonSource)
    json.employees.each{
      employee ->
        println("Id: ${employee.id}, Name: ${employee.name}, Position: ${employee.position}")
    }
  }catch (Exception e){
    println("Błąd: $e")
  }
}
