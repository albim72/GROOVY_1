interface Printable {
    void printMessage(String message)
    default void printHello(){
        printMessage("Hello!!!")
    }

}
