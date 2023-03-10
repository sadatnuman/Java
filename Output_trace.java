public class Output_trace {
    static int i ;
    int j;
    static{
        System.out.println("static block 2 called");
    }
    Output_trace(){
        System.out.println("Constructor called");
    }
    static{
        i++;
        System.out.println("static block 1 called");
    }
    Output_trace(int b){
        j = b;
        print_j();
        System.out.println("Constructor is called");
    }
    public void static_count(){
        System.out.println("Total static blocks : "+i);
    }
    public void print_j(){
        System.out.println("Value of j : "+j);
    }
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("Sadat");
        Output_trace t1 = new Output_trace();
        Output_trace t2 = new Output_trace(6);
        t1.static_count();
        System.out.println("\n\n\n");
    }
}
