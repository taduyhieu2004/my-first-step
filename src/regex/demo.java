package regex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("hanoi");
        countries.add("hcm");

        Iterator<String> countriesIterator = countries.iterator();

        while (countriesIterator.hasNext()) {
            System.out.println(countriesIterator.next());
        }

    }
}
