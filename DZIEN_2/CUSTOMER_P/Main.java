package marcin.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Adam","Nowak","Wrocław",1970));
        customers.add(new Customer("Ada","Kot","Lublin",1979));
        customers.add(new Customer("Leon","Bzik","Łódź",1988));
        customers.add(new Customer("Nadia","Kowal","Katowice",1966));
        customers.add(new Customer("Jacek","Nowik","Gdańsk",1971));
        customers.add(new Customer("Julia","Nowa","Wrocław",1971));

        List<String> names = customers.stream()
                .filter(c->c.getCity().equals("Wrocław"))
                .map(c->c.getFisrtName().toUpperCase() + " " + c.getLastName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
