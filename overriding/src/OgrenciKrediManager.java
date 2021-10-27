public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.10;
        //BaseKrediManager icindeki yapıyı buraya yazıp editlersek bu BaseKrediManager'ı ezecektir ve
        //buradaki hesaplamaya tutarına göre main'de hesaplayacaktir. (overriding)
    }
}
