public class Main
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insertAtStart(4);
        list.insertAt(3, 45);
        list.printElements();
        list.deleteAt(3);
         



    }
}