public class UnaryOperator {
 /* + Unary plus
    - Unary minus
    ++ Increment 
    -- Decrement*/
    public static void main(String[] args){
        System.out.println("\n\n\n");
        int x , result;
        x = 10;
        result = +x;
        System.out.println("Unary plus : "+result);
        result = -x;
        System.out.println("Unary minus : "+result);
        //Increment 
        int a = x++; //Postfix Increment
        int b = x;
        int c = ++x; //Prefix Increment 
        //Decrement
        int d = x--; //Postfix Decrement
        int e = x;
        int f = --x; //Prefix Decrement 
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);
        System.out.println("f : "+f);
        System.out.println("\n\n\n");
    }
}
