import java.util.Date;
import java.util.UUID;

public class Invoice {
    private String invoiceID;
    private String paymentID;
    private String ticketID;
    private String customerName;
    private String seatNumber;
    private String movieTitle;
    private double totalPrice;
    private double finalAmount;
    private Date date;

    public Invoice(String paymentID, String ticketID, String customerName, String seatNumber,
            String movieTitle, double totalPrice, double finalAmount, Date date) {
        this.invoiceID = generateUniqueID("INV");   
        this.paymentID = paymentID;
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
        this.movieTitle = movieTitle;
        this.totalPrice = totalPrice;
        this.finalAmount = finalAmount;
        this.date = date;
    }

    private String generateUniqueID(String prefix) {
        return prefix + "-" + UUID.randomUUID().toString();
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void seyInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID() {
        this.paymentID = paymentID;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName() {
        this.customerName = customerName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double calculateFinalAmount() {
        return finalAmount;
    }

    @Override
    public String toString() {
        return "Invoice" + "\nInvoiceID : " + invoiceID + "\nPayment ID : " + getPaymentID() +
                "\nTicket ID" + getTicketID() + "\nCustomer Name : " + customerName +
                "\nSeat Number : " + seatNumber + "\nMovie Title : " + movieTitle + 
                "\nTotal Price : " + totalPrice +"\nFinal Amount : " + finalAmount + "\nDate : " + date + "";
    }
}