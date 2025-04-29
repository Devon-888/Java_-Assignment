public class Ticket{
    private String ticketID;
    private Customer customer;
    private payment payment;
    private static int idCounter = 1;

    public Ticket(Customer customer, payment payment) {
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

    public payment getPayment() {
        return payment;
    }

    public void setPayment(payment payment) {
        this.payment = payment;

    }

    @Override
    public String toString() {
        return "Ticket" + "\nTicketID : " + ticketID + "\nCustomer : " + customer + "\nPayment : " + payment + "";
    }
}
