package marcin.com;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("test aplikacji opartej na Maven");
        List<Integer> number = Arrays.asList(3, 6, 2, 12, 77, 8, 123, 888, 34, 10, 0, 9,0);
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(number);
        System.out.println(square);

        List<String> names = Arrays.asList("Strumień", "Serializacja", "Kolekcja", "Refleksja");
        List<String> wynik = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(names);
        System.out.println(wynik);

        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        List<String> sortshow = names.stream().sorted().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(sortshow);

        Set<Integer> cubeset = number.stream().map(x->x*x*x).collect(Collectors.toSet());
        System.out.println(cubeset);

        number.stream().filter(x->x%2==0).forEach(y-> System.out.println(y));

        int ev = number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println(ev);

    }
}
