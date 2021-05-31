 

public class LinkedList
{
   //State of a linkedlist at the beginning
    Node head ;

    //Methods - behaviors
    //insert method
    public void insert(int data)
    {
        //Instantiate new node object from Node.java class
        Node newNode = new Node();

        //The data the newNode object takes is the parameter of insert method
        newNode.data = data;
        newNode.pointerToNext = null;

        //Insertion
        //Linkedlist could be empty
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            //need to traverse linkedlist to add node at the end. I.e where pointer points to null
            //use a reference node
            

            //At start of operation this node references the head node.
            Node ref = head;
            

            while(ref.pointerToNext != null)
            {
                ref = ref.pointerToNext;

            }

            //When we exit while loop, we now make reference to the new Node which points to null itself.
            //newNode is now the last node in the linkedlist
            ref.pointerToNext = newNode;
 
        }

    }

    //print method

    public void printElements()
    {

        Node ref = head;

        while(ref.pointerToNext != null)
        {
            System.out.println(ref.data);

            //think of x = x+1;
            ref = ref.pointerToNext;

        }

        if(ref.pointerToNext == null)
        {
            System.out.println(ref.data);
        }

    }

    public void insertAtStart(int data) //review implementation

    {
        //general procedure for creating a node
        Node newNode = new Node();
        newNode.data = data;
        newNode.pointerToNext = null;

        //?
        newNode.pointerToNext = head;
        head = newNode;

    }

    public void insertAt (int index, int data)
    {

        //create a new node to be inserted
        Node newNode = new Node();
        newNode.data = data;
        newNode.pointerToNext = null;
        
        //to traverse start by making reference to head node  
        Node ref = head;

        //edge case for when index = 1 (I.e insert at start)
        if(index == 1)
        {
            insertAtStart(data);
        }
        
        //traverse the linkedlist
        for(int i = 1; i < index-1; i++)
        {
            //iterate i times 
            ref = ref.pointerToNext;
        }

        //once loop exits and we reach appropriate index assign reference node to newNode
        newNode.pointerToNext =  ref.pointerToNext;
        ref.pointerToNext = newNode;
  
    }

    public void deleteAt(int index)
    {

        
        








    } 






    
   





}

