public class BitwiseOperator {
    /* 
    &  Bitwise AND
    | Bitwise OR
    ^ Bitwise EXOR
    >> Bitwise Shift Right
    << Bitwise Shift Left
    ~ Bitwise NOT
    */
    public static void main(String[] args){
        System.out.print("\n\n\n");
        int x , y;
        x = 32;
        y = 12;
        int a = x & y;
        int b = x | y;
        int c = x ^ y;
        int d = x >> 3;
        int e = x << 3;
        int f = ~x;
        int g = ~(x & y);
        System.out.println("Bitwise AND (x & y): "+a);
        System.out.println("Bitwise OR (x | y) : "+b);
        System.out.println("Bitwise EXOR (x ^ y) : "+c);
        System.out.println("Bitwise Shift Right (x >> 3) : "+d);
        System.out.println("Bitwise Shift Left (x << 3) : "+e);
        System.out.println("Bitwise NOT (~x) : "+a);
        System.out.println("Bitwise NOT (x & y) : "+a);
        System.out.print("\n\n\n");
    }
}
