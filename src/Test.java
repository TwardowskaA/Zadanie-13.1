import java.util.*;

import static java.lang.String.valueOf;

public class Test {
    public static void main(String[] args) {

        List<Contender> results = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wynik kolejnego gracza(lub stop):");
        String name = scan.nextLine();
        String lastName = scan.nextLine();
        int score = scan.nextInt();
        scan.nextLine();
        while (!(name.contains("stop") || lastName.contains("stop") || String.valueOf(score).contains("score"))) {
            results.add(new Contender(name, lastName, score));
            System.out.println("Podaj wynik kolejnego gracza(lub stop):");
            name = scan.nextLine();
            lastName = scan.nextLine();
            score = scan.nextInt();
            scan.nextLine();

            if (name.contains("stop") || lastName.contains("stop") || String.valueOf(score).contains("stop")) {
                System.out.println("Wybierz algorytm sortowania(imie/nazwisko/wynik)");
                String x = scan.nextLine();
                if (x.contains("imie")) {
                    results.sort(new NameComparator());
                } else if (x.contains("nazwisko")) {
                    results.sort(new LastNameComparator());
                } else if (x.contains("wynik")) {
                    results.sort(new ResultComparator());
                }
            }

        }
        System.out.println(results);
    }
}



