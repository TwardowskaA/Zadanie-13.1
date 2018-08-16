import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Math {

    public static void writer(List<Contender> results) throws IOException {
        FileWriter fileWriter = new FileWriter("stats.csv");
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        bfw.write(String.valueOf(results));
        bfw.close();
        System.out.println("Zapisano dane w pliku stats.csv.");
    }

    public static List<Contender> addtoList(List<Contender> results) {
        scanner();
        while (!(Math.scanner().nextLine().equals("stop"))) {
            String name = Math.scanner().nextLine();
            String lastName = Math.scanner().nextLine();
            String score = Math.scanner().nextLine();
            results.add(new Contender(name, lastName, Integer.valueOf(score)));
        }
        return results;
    }

    public static List sort(List<Contender> results) {
        scanner();
        if (scanner().nextLine().equals("stop")) {
            System.out.println("Wybierz algorytm sortowania(imie/nazwisko/wynik)");
            String x = scanner().nextLine();
            if (x.equals("imie")) {
                results.sort(new NameComparator());
            } else if (x.equals("nazwisko")) {
                results.sort(new LastNameComparator());
            } else if (x.equals("wynik")) {
                results.sort(new ResultComparator());
            }
        }
        return results;
    }

    public static Scanner scanner() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wynik kolejnego gracza (lub stop):");
        String name = scan.nextLine();
        String lastName = scan.nextLine();
        String score = scan.nextLine();
        return scan;
    }
}


