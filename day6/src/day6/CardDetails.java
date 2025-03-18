package day6;

import java.io.Serializable;

public class CardDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    private long cardNumber;
    private String cardHolderName;
    private int month;
    private long year;
    private int cvv;

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public CardDetails(long cardNumber, String cardHolderName, long year, int month, int cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.year = year;
        this.month = month;
        this.cvv = cvv;
    }


}