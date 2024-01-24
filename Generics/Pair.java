package Generics;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public void setKey(K key){
        this.key = key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value){
        this.value = value;
    }

    public String toString(){
        return key + ", " + value;
    }

    public static<K, V>Pair<K, V>createPair(K key, V value){
       return new Pair<> (key, value);
    }

    public static void main(String[] args){
        Pair<Integer, String> pair1 = createPair(1, "one");

        System.out.println("Pair 1: " + pair1);
    }
}