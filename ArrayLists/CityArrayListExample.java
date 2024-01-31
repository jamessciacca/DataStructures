package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CityArrayListExample {
    public static void main(String[] args){
    
       ArrayList<String>cities = new ArrayList<>();

       cities.add("NY");
       cities.add("Tokyo");
       cities.add("Paris");
       cities.add("London");

       System.out.println("Cities in the list: " + cities);

       String firstCity = findFirstCity(cities);
       System.out.println("First city is: " + cities);
       for (String city : cities){
           if (city.startsWith("L")){
                System.out.println("City starting with L: " + cities);
           }
       }
    }

    public static String findFirstCity(ArrayList<String> cities){
        if(cities.isEmpty()){
            return null;
        }
        Comparator<String>cityComparator = Comparator.naturalOrder();
        //sort by collection.sort
        Collections.sort(cities, cityComparator);
        //first element after sorting is the first city 
        return cities.get(0);
    }
}
