public class Main {

    public static void main(String[] args) {
        FemalePlayerCalculator femalePlayerCalculator = new FemalePlayerCalculator();
        femalePlayerCalculator.hesapla();
        femalePlayerCalculator.gameOver();

        //GameCalculator gameCalculator = new GameCalculator() {
            //ABSTRACT SINIFLAR ASLA NEW'LENEMEZ
            //Ancak override edilerek(add unimplemented methods dedigimizde cıkan sonuclardaki gibi yapılırsa yapılabilir)

        GameCalculator gameCalculator = new FemalePlayerCalculator();

        

        //oyun icin gelecekte yeni oyuncular eklenecegi zaman, bunu kolayca kullaniriz.



    }
}
