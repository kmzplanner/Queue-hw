public class Person {

    private String name;
    private String surName;
    private int numberOfTickets;

    public Person (String name, String surName, int numderOfTickets){
        this.name = name;
        this.surName = surName;
        this.numberOfTickets = numderOfTickets;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
