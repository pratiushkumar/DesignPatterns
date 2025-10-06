package adapterpattern;

public class AdapterImpl {
    public static void main(String[] args){
//        1. First create Xpay class object and set its properties
        Xpay xpay =  new XpayImpl();
        xpay.setCreditCardNo("456465464612");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);
//        2.Then we will crate an adapter and pass it that object of Xpay
        PayD payd =  new XpayToPDay(xpay);
        testPayD(payd);


    }

//    3.The testPayD() static method takes a PayD type as an
//    argument which run and print its methods in order to test
    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
