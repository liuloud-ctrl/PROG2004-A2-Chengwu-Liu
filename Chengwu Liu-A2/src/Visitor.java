public class Visitor extends Person {
    private String ticketType;
    private String visitorId;

    public Visitor() {
        super();
        this.ticketType = "";
        this.visitorId = "";
    }

    public Visitor(String name, int age, String gender, String visitorId, String ticketType) {
        super(name, age, gender);
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Visitor ID: " + visitorId + ", Ticket Type: " + ticketType;
    }
}
