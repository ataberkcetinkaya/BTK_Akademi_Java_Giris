public class Product {

    public Product(int id, String name, String description, double price, int stockAmount) {
        System.out.println("Yapici blok calisti.");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    } //public ve sadece class' ismi ile yazılan bu part'ın anlami;
        //ben sadece bu parametreleri verirsen (int id, String name, ...) kullandırırım sana demek oluyor.
        //Main'de new'lendiği zaman bu değerleri vermek zorundayız.

    public Product() { //overloading > product class'inin parametresiz ve yukarida olan 5 parametreli hali
                        //hangisini kullanmak istersek

    }


    //attribute veya field denebilir.
    //private sadece tanımlandıgı blokta geçerlidir demek yani burada Product blogu
    //private'ın bir üstündeki süslü parantez neredeyse orada geçerlidir.
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

    //getter
    public int getId() {
        return id;
    }
    //setter
    public void setId(int id) {
        this.id = id; //this demek bu class demek, içerisinde bulundugumuz veya _id yazılabilir
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() { //kodu sadece readonly yapıyoruz. only getter
        return this.name.substring(0,1) + id;
    }
}
