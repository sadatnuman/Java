package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateUserAccount 
{
    private String fullName;
    private String Nid;
    private String userEmail;
    private String userName;
    private String userPassword;
	private String userNumber;
	private String userPasswordConfirm;
    private File file;
    private FileWriter writer;
    private Scanner sc;

  
    public CreateUserAccount()
    {
        this.fullName="";    
        this.Nid="";
        this.userEmail="";
        this.userName="";
        this.userPassword="";
		this.userNumber="";
		this.userPasswordConfirm="";
    }

    public CreateUserAccount(String fullName,String Nid,String userEmail,String userName,String userPassword,String userNumber,String userPasswordConfirm)
    {
        this.fullName=fullName;     
        this.Nid=Nid;
        this.userEmail=userEmail;
        this.userName=userName;
        this.userPassword=userPassword;
		this.userNumber=userNumber;
		this.userPasswordConfirm=userPasswordConfirm;
    }

    //setter & getter method
    public void setFullName(String fullName) 
	{
        this.fullName = fullName;
    }
    public void setNid(String Nid) 
	{
        this.Nid = Nid;
    }
    public void setUserEmail(String userEmail) 
	{
        this.userEmail = userEmail;
    }
    public void setUserName(String userName) 
	{
        this.userName = userName;
    }
    public void setUserPassword(String userPassword) 
	{
        this.userPassword = userPassword;
    }
	public void setuserNumber(String userNumber) 
	{
        this.userNumber = userNumber;
    }
	public void setuserPasswordConfirm(String userPasswordConfirm) 
	{
        this.userPasswordConfirm=userPasswordConfirm;
    }
    public String getFullName() 
	{
        return fullName;
    }
	public String getNumber() 
	{
        return userNumber;
    }
	 public String getPasswordConfirm() 
	{
        return userPasswordConfirm;
    }
    public String getNid() 
	{
        return Nid;
    }
    public String getUserEmail() 
	{
        return userEmail;
    }
    public String getUserName() 
	{
        return userName;
    }
    public String getUserPassword() 
	{
        return userPassword;
    }

    public void addAccount()
    {
        try
        {
            file = new File("Data/Users.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getUserName()+"\t");
            writer.write(getUserPassword()+"\t");
            writer.write(getNid()+"\t");
            writer.write(getFullName()+"\t");
            writer.write(getUserEmail()+"\n");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
	
	 public void addTemp(String userName)
    {
		this.userName=userName;
        try
        {
            file = new File("Data/Temp.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getUserName()+"\t");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    } 

    public boolean getAccount(String userName,String userPassword)
    {
        boolean isAuth = false;
        String path ="Data/Users.txt";
        file = new File(path);
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if(value[0].equals(userName) && value[1].equals(userPassword))
                {
                    isAuth=true;
				try
				{
					file = new File("Data/Temp.txt");
					file.createNewFile();
					writer  = new FileWriter(file,true);
					writer.write(userName+"\t");
					writer.flush();
					writer.close();
					file.deleteOnExit();
				}
				catch(IOException ioe)
				{
					ioe.printStackTrace();
				}
                }
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return isAuth;
    }
}
