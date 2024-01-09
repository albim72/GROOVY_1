class Outer {
    String name
    def callInnerMethod(){
        new Inner().methodA()
    }
    class Inner{
        def methodA(){
            println(name)
        }
    }
}
