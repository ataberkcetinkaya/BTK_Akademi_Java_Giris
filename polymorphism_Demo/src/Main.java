public class Main {

    public static void main(String[] args) {
       // BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        //int[] sayilar = new int[] {1,2,3,5} gibi sadece int array'e int verebiliyorduk, string veya başka bir şey veremeyiz.
        //aynı şekilde BaseLogger'a da yukarida sadece BaseLogger türünde bir şey verebiliriz, yukarıdakilerin hepsini yani
        //çünkü hepsi BaseLogger'ı extends ediyor.
      //  for (BaseLogger logger:loggers) {
      //      logger.log("Log message.");
       // }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger()); //çok biçimlilik
                                                            //CustomerManager içindeki
                                                             //  public CustomerManager(BaseLogger logger) kısmından diğer istediğimiz
                                                                //logları çekmemizi saglamakta?!.

                                                             //buraya istediğimizi yazabiliriz, FileLogger vs.
       customerManager.Add();
    }
}
