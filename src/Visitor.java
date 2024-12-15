public class Visitor extends Person {
    private String membershipID;
    private String membershipType;

    @Override
    public String toString() {
        return "Visitor{" +
                "membershipID='" + membershipID + '\'' +
                ", membershipType='" + membershipType + '\'' +
                '}';
    }

    // Default constructor
    public Visitor() {
        super();
        this.membershipID = "Unknown";
        this.membershipType = "Unknown";
    }

    // Constructor with name only
    public Visitor(String name) {
    }

    // Constructor with all parameters
    public Visitor(String name, String address, int age, String membershipID, String membershipType) {
        super(name, address, age);
        this.membershipID = membershipID;
        this.membershipType = membershipType;
    }

    // Getters and Setters for membershipID and membershipType
    public String getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(String membershipID) {
        this.membershipID = membershipID;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

}