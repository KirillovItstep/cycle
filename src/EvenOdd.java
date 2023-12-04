public class EvenOdd {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 2;
        boolean b1 = a%2==0;
        boolean b2 = b%2==0;
        boolean b3 = c%2==0;

         if (!b1&!b2&b3 | !b1&b2&!b3 | b1&!b2&!b3 | b1&b2&b3)
             System.out.println("even");
         else System.out.println("odd");
    }
}
