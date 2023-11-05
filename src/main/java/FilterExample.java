import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Ball", "cat","Dog");

        names.stream().filter(FilterExample::IsnotApple)
                .forEach(System.out::println);
    }

    private static boolean IsnotApple(String Name) {
        return !Name.equals("Apple");
    }
}
