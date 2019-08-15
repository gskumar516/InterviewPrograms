package StreamAPI;
import java.util.Arrays;
import java.util.List;
 
public class StreamMapEx {
 
    public static void main(String a[]) {
 
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        vehicles.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}