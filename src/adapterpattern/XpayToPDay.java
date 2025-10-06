package adapterpattern;

public class XpayToPDay implements PayD{
    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;
    private final Xpay xpay;
    public XpayToPDay(Xpay xpay){
        this.xpay = xpay;
        setProp();
    }

    @Override
    public String getCustCardNo() {
        return "";
    }

    @Override
    public String getCardOwnerName() {
        return "";
    }

    @Override
    public String getCardExpMonthDate() {
        return "";
    }

    @Override
    public Integer getCVVNo() {
        return 0;
    }

    @Override
    public Double getTotalAmount() {
        return 0.0;
    }

    @Override
    public void setCustCardNo(String custCardNo) {

    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {

    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {

    }

    @Override
    public void setCVVNo(Integer cVVNo) {

    }

    @Override
    public void setTotalAmount(Double totalAmount) {

    }
    private void setProp(){
        setCardOwnerName(this.xpay.getCustomerName());
        setCustCardNo(this.xpay.getCreditCardNo());
        setCardExpMonthDate(this.xpay.getCardExpMonth()+"/"+this.xpay.
                getCardExpYear());
        setCVVNo(this.xpay.getCardCVVNo().intValue());
        setTotalAmount(this.xpay.getAmount());
    }

}
