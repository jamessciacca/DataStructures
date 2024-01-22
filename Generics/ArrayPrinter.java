package Generics;
public class ArrayPrinter{

    public static void main(String[] args){
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'H','E','L','L','O'};
        String[] stringArray = {"Hello", "World"};

        System.out.println("Array integerArray contains:");
        printArray(intArray);
        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);
        System.out.println("Array charArray contains:");
        printArray(charArray);
        System.out.println("Array stringArray contains:");
        printArray(stringArray);
    
    }

    //this allows you to pass anything into the method!
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}