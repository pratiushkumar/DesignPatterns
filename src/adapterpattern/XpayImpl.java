package adapterpattern;

public class XpayImpl implements Xpay{
    @Override
    public String getCreditCardNo() {
        return "";
    }

    @Override
    public String getCustomerName() {
        return "";
    }

    @Override
    public String getCardExpMonth() {
        return "";
    }

    @Override
    public String getCardExpYear() {
        return "";
    }

    @Override
    public Short getCardCVVNo() {
        return 0;
    }

    @Override
    public Double getAmount() {
        return 0.0;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {

    }

    @Override
    public void setCustomerName(String customerName) {

    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {

    }

    @Override
    public void setCardExpYear(String cardExpYear) {

    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {

    }

    @Override
    public void setAmount(Double amount) {

    }
}
