import java.util.ArrayList;
import java.util.Arrays;

public class ReversedView {
    public static void main(String[] args) {
        var list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        var reversed = list.reversed();
        for (var e : reversed) {
            System.out.println(e);
        }
        System.out.println("---");

        reversed.addFirst("X");
        for (var e : list) {
            System.out.println(e);
        }
    }   
}
