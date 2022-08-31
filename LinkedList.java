class LinkedList{
    class Node{
        int data;
        Node next;
 public Node (){
    data=0;
    next=null;
 } 
 public Node(int data){
    this.data=data;
    next =null;
 }
    }  
    Node head;
    Node tail; 
 public LinkedList(){
    head=null;
    tail=null;
 }
 public void addNode(int data){
    Node n= new Node(data);
    if(head=null)
    {
     head=n;
     tail=n;
    } 
  else{
    tail.next=n;
    tail=n;
  } 
 } 
public void display(){
    Node t1= head; 
    while(t1!=tail)
    {
        system.out.println(t1.data + "");
        t1=t1.next;
    }
public static void main(String[] args) {    
LinkedList List = new LinkedList();    
                                                           
list.addNode(1);    
List.addNode(2);    
List.addNode(3); 
List.display();   
}
}
                                                                            
                                                                                        
                                                                                     
                                                                                         
                                                                                               
                                                                                   

 
