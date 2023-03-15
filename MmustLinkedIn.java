
package my.project;
/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;

public class MmustLinkedIn {

    /**
     * @param args the command line arguments
     */
    private String username;
    private String password;
    private ArrayList<String> names;
    
    //constructors
    public MmustLinkedIn(String username, String password){
        this.username = username;
        this.password = password;
        this.names = new ArrayList<>();
    }
    
    //Getters and Setters
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public ArrayList<String> getNames(){
        return names;
    }
    
    public void setNames(ArrayList<String> names){
        this.names = names;
    }
    
    //Add a connection
    public void addName(String name){
        names.add(name);
        System.out.println(name + " is a Mmust Students.");
    }
    
    //Remove connection
    public void removeName(String name){
        if(names.contains(name)){
           names.remove(1);
            System.out.println(name + " is no longer a student @MMUST!.");
        }
        else{
            System.out.println(name + " he is a student in MMUST");
        }
    }
    
    //Post and Update
    public void postUpdate(String update){
        System.out.println(update);
    }
    
    //Send a message to connection
    public void sendMessage(String name, String message){
        if(name.startsWith("S")){
            System.out.println(name + " Register for Units.");
        }
        else{
            System.out.println("All Units registered.");
        }
    }
    public static void main(String[] args) {
        MmustLinkedIn myLinkedIn = new MmustLinkedIn("Student@Mmust","MMUST2023");
        System.out.println(myLinkedIn.username);
        System.out.println(myLinkedIn.password);
        myLinkedIn.addName("Davie");
        myLinkedIn.addName("Churchill");
        myLinkedIn.addName("Sandra");
        myLinkedIn.addName("Stanly");
        myLinkedIn.removeName("Churchill");
        myLinkedIn.postUpdate("The School portal is open.");
        System.out.println("Registered Students are : " + myLinkedIn.names);
        myLinkedIn.sendMessage("Stanly","");
      
    }
    
}