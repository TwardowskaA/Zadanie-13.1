import java.util.Objects;

public class Contender {
    private String firstName;
    private String lastName;
    private int score;

    public Contender(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Contender{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contender contender = (Contender) o;
        return score == contender.score &&
                Objects.equals(firstName, contender.firstName) &&
                Objects.equals(lastName, contender.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, score);
    }
}
