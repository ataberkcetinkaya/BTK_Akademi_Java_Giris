public class CustomerManager {
    private BaseLogger logger; //private String name, private int id; gibi...
                                //github classesWithAttributes ornegine bak...


    public CustomerManager(BaseLogger logger) { //Burada aslinda baselogger yok, database logger var, (baselogger sadece extend'lerin referansını tutuyor
                                                //baselogger veriyoruz ama extend edenlerden sonucu alıyoruz.
        this.logger = logger;                   //buradaki baselogger yine anne görevi görüyor ve main'den
    }                                           //bunun üzerinden aktarma yapıp extend edenleri çağırıyoruz
    public void Add() {
        //System.out.println("Müşteri eklendi.");
        this.logger.log("Log message."); //burada this.logger.log dediğimizde aslında database log'u çalışmış oluyor
}                                    // aktarmalı sistem olarak düşünmeliyiz hep.
}           //this.logger.log > baselogger'ın.log'u dediğimizde aslinda database logger çalışmış oluyor
