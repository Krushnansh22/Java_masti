class Participant{
    private int counter = 1001;
    private String registrationId;
    private String name;
    private String branch;
    private long contactNumber;

    Participant(String name, long contactNum, String branch) {
        this.name = name;
        this.contactNumber = contactNum;
        this.branch = branch;
    }

    public String getRegistrationId(){
        registrationId = "D-"+counter;
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

        // First object
        Participant p = new Participant("sagar",1234567890,"AIML");
        
        System.out.println("Your registration ID is : "+p.getRegistrationId());
        System.out.println("Counter : "+p.getCounter());
        System.out.println("Name : "+p.getName());
        System.out.println("Contact Number : "+p.getContactNumber());
        System.out.println("Branch : "+p.getBranch());
        System.out.println("\n**After Updation Data is : ");
        
        //updatig the data members
        p.setCounter(102);
        p.setName("Manthan");
        p.setContactNumber(9087654321L);
        p.setBranch("AIDS");
        
        System.out.println("Your registration ID is : "+p.getRegistrationId());
        System.out.println("Counter : "+p.getCounter());
        System.out.println("Name : "+p.getName());
        System.out.println("Contact Number : "+p.getContactNumber());
        System.out.println("Branch : "+p.getBranch());
    }
}