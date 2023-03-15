
package my.project;

import java.util.ArrayList;

public class Queue {
    
    private ArrayList<Integer> unitCode;
    private MmustLinkedIn linkedIn;
    
    public Queue(String username, String password){
        this.unitCode = new ArrayList<>();
        this.linkedIn = new MmustLinkedIn(username, password);
    }
    
    public void enqueue(int unitCode){
        this.unitCode.add(unitCode);
        this.linkedIn.postUpdate("Enqued unitCode : " + unitCode);    
    }
    
    public int dequeue(){
        if(this.unitCode.size()==0){
            this.linkedIn.postUpdate("Tried to dequeue from an empty queue");
            return -1; //Indicates an error
        }
        int unitCode = this.unitCode.get(0);
        this.unitCode.remove(0);
        this.linkedIn.postUpdate("Dequeued unitCode " + unitCode);
        return unitCode;
    }
    
    public static void main(String[] args){
        Queue queue = new Queue("myusername", "mypassword");
        queue.enqueue(223);
        queue.enqueue(227);
        queue.enqueue(220);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();//Error
        
    }   
}