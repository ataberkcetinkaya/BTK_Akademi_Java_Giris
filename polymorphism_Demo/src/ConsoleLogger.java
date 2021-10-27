public class ConsoleLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Console logged: " + message); //ayri bir loglama, ozel
    } //override
    //yeni eklenen log, bir nevi plug n play, easy.
}
