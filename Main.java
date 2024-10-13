import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = List.of("a", "b", "c", "d", "e", "f", "g");
        var array = list.subList(1, 3).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}