import java.util.Comparator;

public class ResultComparator implements Comparator<Contender> {
    @Override
    public int compare(Contender c1, Contender c2) {
        return Integer.compare(c1.getScore(),c2.getScore());
    }
}
