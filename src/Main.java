import arithmetic.Arithmetic;
import map.MyMap;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Integer> quickMath = new Arithmetic<>(10, 5);
        System.out.println("Sum: " + quickMath.add());
        System.out.println("Difference: " + quickMath.subtract());
        System.out.println("Product: " + quickMath.multiply());
        System.out.println("Quotient: " + quickMath.divide());
        System.out.println("Min: " + quickMath.getMin());
        System.out.println("Max: " + quickMath.getMax());

        MyMap<Character, Integer> map = new MyMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);

        System.out.println("a " + map.get('a'));
        System.out.println("b " + map.get('b'));
        System.out.println("c " + map.get('c'));
        System.out.println("removed " + map.remove('a'));
        System.out.println("a " + map.get('a'));
    }
}