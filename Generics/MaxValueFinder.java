package Generics;

import java.util.Random;

public class MaxValueFinder {
    
    public static <T extends Comparable<T>> T findMax(T[] array){
        if(array == null || array.length == 0){
            return null;
        }
        T max = array[0];
        for(int i = 1; i < array.length; i++){
            T element = array[i];
            if(element != null && element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args){
        Random random = new Random();
        Integer[] intArray = {random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        Double[] doubleArray = {random.nextDouble()*100, random.nextDouble()*100, random.nextDouble()*100, random.nextDouble()*100, random.nextDouble()*100};


        Integer maxInt = findMax(intArray);
        Double maxDouble = findMax(doubleArray);
        System.out.println("Max int: " + maxInt);
        System.out.println("Max double: " + maxDouble);
    }
}
