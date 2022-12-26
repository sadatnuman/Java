import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        System.out.print("\n\n\n");
        
        
        Scanner a = new Scanner(System.in);
        int INT;
        System.out.print("Enter a integer type number : ");
        INT = a.nextInt();
        System.out.println("int : "+INT);


        Scanner e = new Scanner(System.in);
        short s;
        System.out.print("Enter a integer type number (short): ");
        s = e.nextShort();
        System.out.println("short : "+s);


        Scanner f = new Scanner(System.in);
        byte B;
        System.out.print("Enter a integer type number (byte) : ");
        B = f.nextByte();
        System.out.println("byte : "+B);


        Scanner g = new Scanner(System.in);
        long L;
        System.out.print("Enter a integer type number (long): ");
        L = g.nextLong();
        System.out.println("long : "+L);

         
        Scanner b = new Scanner(System.in);
        float FLOAT;
        System.out.print("Enter a float type number : ");
        FLOAT = b.nextFloat();
        System.out.println("float : "+FLOAT);


        Scanner c = new Scanner (System.in);
        double DOUBLE;
        System.out.print("Enter a double type number : ");
        DOUBLE = c.nextDouble();
        System.out.println("double : "+DOUBLE);


        Scanner d = new Scanner (System.in);
        String S;
        System.out.print("Enter a String : ");
        S = d.nextLine();
        //S = d.next();
        System.out.println("String : "+S);
        
        
        System.out.print("\n\n\n");
    }
}
