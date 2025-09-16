//Participant class
class Participant{
    //class variables  
    public static int counter;
    static{
        counter = 1000;
    }
    private String registrationId;
    private String name;
    private String branch;
    private long contactNumber;

    //Constructor to initialize object
    Participant(String name,long contactNum,String branch) {
        counter +=1;
        this.name = name;
        this.contactNumber = contactNum;
        this.branch = branch;
        this.registrationId = "D"+counter;
    }

    //class functions
    public String getRegistrationId(){
        return registrationId;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getCounter(){
        return counter;
    }
    public void setCounter(int newCounter){
        counter = newCounter;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String newBranch){
        branch = newBranch;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(long newNumber){
        contactNumber = newNumber;
    }
}

public class DanceClub {
    public static void main(String  args[]){
        //First Object
        Participant p = new Participant("Rohit",1234567889,"Computer");
        System.out.print("Hi "+p.getName()+"! Your registration ID is "+p.getRegistrationId()+"\n");
       
        //Second Object
        Participant p1 = new Participant("Sayli",1988612300,"Mechanical");
        System.out.print("Hi "+p1.getName()+"! Your registration ID is "+p1.getRegistrationId()+"\n");
    }
}
