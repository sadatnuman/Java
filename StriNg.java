public class StriNg{
	public static void main(String[] args){
		String s1 = "Hello java";
		String s2 = new String();
		String s3= new String("Hello");
		String s4= "Hello";
		String s5= new String( "Hello");
		String s6 = "Hello";
		String s8 = new String( "JaVaClaSs");
		String s14 = "Bangladesh";
		String s15 = "bangladesh";
		String s16 = new String("Bangladesh");
		String s17 = new String("bangladesh");
		System.out.println("\n\n\n");
	
		
		System.out.println(s1.isEmpty());//false
		System.out.println(s2.isEmpty());//true
		System.out.println(s1.length());//10
		System.out.println(s3.charAt(1));//e
		
		System.out.println(s1.concat(s3));//Hello javaHello
		System.out.println(s1);//Hello java
		System.out.println(s3);//Hello
		
		
		if(s14 == s15){
			System.out.println("1");
		}
		else{
			System.out.println("2");//2
		}
		
		
		if(s16 == s17){
			System.out.println("3");
		}
		else{
			System.out.println("4");//4
		}
		
		
		if(s14.equals(s15)){
			System.out.println("5");
		}
		else{
			System.out.println("6");//6
		}
		
		
		if(s16.equals(s17)){
			System.out.println("7");
		}
		else{
			System.out.println("8");//8
		}
		
		
		if(s3 == s4){
			System.out.println("yes");
		}
		else{
			System.out.println("no");//no
		}
		
		
		if(s3.equals(s5)){
			System.out.println("Yes");//Yes
		}
		else{
			System.out.println("No");
		}
		
		
		if(s4 == s6){
			System.out.println("yes");//yes
		}
		else{
			System.out.println("no");
		}
		
		
		if(s4.equals(s6)){
			System.out.println("yes");//yes
		}
		else{
			System.out.println("no");
		}
		
		
		if(s3 == s5){
			System.out.println("yes");
		}
		else{
			System.out.println("no");//no
		}
		
		String s7 = s1.substring(2,7);
		System.out.println(s7);//llo j
		System.out.println(s1);//Hello java
		s1 = s1.substring(3,7);
		System.out.println(s1);//lo j
		s8 = s8.toLowerCase();
		System.out.println(s8);//javaclass
		s8 = s8.toUpperCase();
		System.out.println(s8);//JAVACLASS
		String s10 = "Java";
		System.out.println(s1.compareTo(s10));//34
		System.out.println(s10.compareTo(s1));//-34
		System.out.println(s1.compareTo(s8));//34
		System.out.println(s8.compareTo(s1));//-34
		System.out.println(s3.compareTo(s8));//-2
		String s11 = "This is Sadat sadat";
		int x = s11.indexOf("is");
		int y = s11.indexOf("sadat");
		int z = s11.indexOf("Sadat");
		int a = s11.indexOf("s");
		System.out.println(x);//2
		System.out.println(y);//14
		System.out.println(z);//8
		System.out.println(a);//3
		
	
	    System.out.println("\n\n\n");
	}
}