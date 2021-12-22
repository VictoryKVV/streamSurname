import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = Surnames.getRandomSurnameList(50);
        list.stream()
                .filter(i -> i.startsWith("А"))
                .forEach(System.out::println);
        }
    }


