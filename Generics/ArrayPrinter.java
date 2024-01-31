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

//Line 21: public static <T> void printArray(T[] array){ This line declares a public static method named printArray. The <T> denotes that this method uses generics, meaning it can work with any object type. The method takes one parameter: an array of any type T.

//Line 22: for(T element : array){ This line starts a for-each loop that iterates over each element in the input array. The type of element is T, which will match whatever type of objects are in the array.

//Line 23: System.out.printf("%s ", element); This line prints the current element to the console. The %s is a placeholder that gets replaced by the string representation of element.

//Line 25: System.out.println(); This line prints a newline to the console, which helps separate the output of different calls to printArray.
    