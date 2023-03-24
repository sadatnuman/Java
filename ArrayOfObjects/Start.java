import java.lang.*;
public class Start{
	public static void main(String[] args){
        System.out.println("\n\n\n");
		Box b1 = new Box();
		b1.setLength(10);
		b1.setWidth(20);
		b1.setHeight(30);
		
		/*System.out.println("Length: "+b1.getLength());
		System.out.println("Width: "+b1.getWidth());
		System.out.println("Height: "+b1.getHeight());*/
		//b1.display();
		
		Box b2 = new Box(100, 200, 300);
		Box b3 = new Box(400, 500, 600);
		
		Box boxes[] = new Box[]{b1, b2, b3};
		for(int i = 0; i<boxes.length;i++){
			if(boxes[i] == null){
				System.out.println("Null at boxes["+i+"]. Cannot Print");
			}
			else{
				System.out.println("boxes["+i+"].length: "+boxes[i].getLength());
				System.out.println("boxes["+i+"].width: "+boxes[i].getWidth());
				System.out.println("boxes["+i+"].height: "+boxes[i].getHeight());
			}
		}
		int check = 0;
		for(int i = 0; i<boxes.length;i++){
			if(boxes[i]==b2){
				boxes[i] = null;
				check = 1;
			}
		}
		if(check == 1 ){
			System.out.println("Found and removed.");
		}
		else{
			System.out.println("Pawai to jainai, ki ar remove korbo?");
		}
		for(int i = 0; i<boxes.length;i++){
			if(boxes[i] == null){
				System.out.println("Null at boxes["+i+"]. Cannot Print");
			}
			else{
				System.out.println("boxes["+i+"].length: "+boxes[i].getLength());
				System.out.println("boxes["+i+"].width: "+boxes[i].getWidth());
				System.out.println("boxes["+i+"].height: "+boxes[i].getHeight());
			}
		}
        System.out.println("\n\n\n");
	}
}