public class Ticket{
    private String ticketID;
    private Customer customer;
    private Payment payment;
    private static int idCounter = 1;

    public Ticket(Customer customer, Payment payment) {
        this.ticketID = generateTicketID();
        this.customer = customer;
        this.payment = payment;
    }

    private static String generateTicketID() {
        return "A" + String.format("%03d", idCounter++); 
    }

    public String getTicketID() {
        return ticketID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;

    }

    @Override
    public String toString() {
        return "Ticket" + "\nTicketID : " + ticketID + "\nCustomer : " + customer + "\nPayment : " + payment + "";
    }
}
