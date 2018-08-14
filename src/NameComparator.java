import java.util.Comparator;

public class NameComparator implements Comparator<Contender> {
    @Override
    public int compare(Contender c1, Contender c2) {
        return c1.getFirstName().compareTo(c2.getFirstName());
    }
}
