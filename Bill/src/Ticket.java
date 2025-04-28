public class Ticket {
    private int ticketID;
    private Customer customer;
    private Payment payment;

    public Ticket(int ticketID, Customer customer, Payment payment) {
        this.ticketID = ticketID;
        this.customer = customer;
        this.payment = payment;
    }

    public int getTicketID(){
        return ticketID;
    }

    public void setTicketID(int ticketID){
        this.ticketID = ticketID;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public Payment getPayment(){
        return payment;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
  
}
