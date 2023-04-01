import java.lang.*;
public class Coutomer {
    private int nid;
    private String name;
    private SavingsAccount savingsAccount[];
    private FixedAccount fixedAccount[];
    Coutomer(){}
    Coutomer(int nid,String name,int size1,int size2){
        this.nid=nid;
        this.name=name; 
        savingsAccount= new SavingsAccount[size1];
        fixedAccount= new FixedAccount[size2];
    }
   public void setNid(int nid){
    this.nid=nid;
   }
   public void setName(String name){
    this.name=name;
   }
   public int getNid(){
    return nid;
   }
   public String getName(){
    return name;
   }
   public void addSavingsAccount(SavingsAccount sa){
    for(int i = 0;i<savingsAccount.length;i++){
        if(savingsAccount[i]==null){
            savingsAccount[i]= sa;
            break;
        }
    }
   }
   public void removeSavingsAccount(SavingsAccount sa){
    for(int i = 0;i<savingsAccount.length;i++){
        if(savingsAccount[i]==sa){
            savingsAccount[i]= null;
            break;
        }
   }
  }
  public void showAllSavingsAccount(){
    for(int i = 0;i<savingsAccount.length;i++){
        if(savingsAccount[i] != null){
            savingsAccount[i].showAccInfo();
            System.out.println("Nid :"+nid);
            System.out.println("Name :"+name);
        }
    }  
  }
  public void addFixedAccount(FixedAccount a2){
    for(int i = 0;i<fixedAccount.length;i++){
        if(fixedAccount[i]==null){
            fixedAccount[i]= a2;
            break;
        }
    }
   }
   public void removeFixedAccount(FixedAccount fa){
    for(int i = 0;i<fixedAccount.length;i++){
        if(fixedAccount[i]==fa){
            fixedAccount[i]= null;
            break;
        }
   }
  }
  public void showAllFixedAccount(){
    for(int i = 0;i<fixedAccount.length;i++){
        if(fixedAccount[i] != null){
            fixedAccount[i].showAccInfo();
            System.out.println("Nid :"+nid);
            System.out.println("Name :"+name);
        }
    }  
  }
}
