public class CustomerManager {

   ICustomerDal iCustomerDal;

    public void add() {
        iCustomerDal.Add();
    }
    //iş kodlari


    //2.YONTEM
    //VEYA

//    public class CustomerManager {
//
//        private ICustomerDal iCustomerDal;
//
//        public CustomerManager(ICustomerDal iCustomerDal) {
//            this.iCustomerDal = iCustomerDal;
//        }
//    }
//
//        public void add() {
//            iCustomerDal.Add();
//        }

}
