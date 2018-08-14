import java.util.Comparator;

public class LastNameComparator implements Comparator<Contender> {
    @Override
    public int compare(Contender c1, Contender c2) {
        return c1.getLastName().compareTo(c2.getLastName());
    }
}
