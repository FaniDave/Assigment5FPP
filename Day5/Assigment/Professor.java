package Day5.Assigment;

//Professor class (Child class)
public class Professor extends DeptEmployee {

    //Instance fields
    private int numberOfPublications;

    //Constructor
    public Professor(String name, double salary, int year, int month, int day, int numberOfPublications) {
        super(name, salary, year, month, day);
        this.numberOfPublications = numberOfPublications;
    }

    //Getters and Setters

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
