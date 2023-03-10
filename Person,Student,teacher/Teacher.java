public class Teacher extends Person
{

	private String Tid;
	private double roomno;
	static{
		System.out.println("Numan");
	}
	public  Teacher()
	{
		System.out.println("Empty  Teacher");
	}
	public  Teacher(String name, int age, String Tid, double roomno)
	{
		super(name, age);
		System.out.println("Parameterized  Teacher");
		this.Tid = Tid;
		this.roomno = roomno;
	}
	public void setTid(String Tid)
	{
		this.Tid = Tid;
	}
	public void setroomno(double roomno)
	{
		this.roomno = roomno;
	}
	public String getTid()
	{
		return Tid;
	}
	public double getroomno()
	{
		return roomno;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Teacher ID: "+Tid);
		System.out.println("Room NO: "+roomno);
	}
}