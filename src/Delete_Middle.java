/**
 * Created by jiayicheng on 17/7/19.
 */
public class Delete_Middle {
    class Node{
        int data;
        Node next;
         public Node(int d)
         {
             data=d;
         }
         void appendToTail(int d)
         {
             Node end=new Node(d);
             Node n=this;
             while(n.next!=null)
             {
                 n=n.next;
             }
             n.next=end;
         }
    }

    boolean Delete_Middle(Node n)
    {
        if(n==null||n.next==null)
            return false;
        n.data=n.next.data;       //已知要删除的那个链表元素，把它删掉。首先要把下一个的值赋给要删掉的元素
        n.next=n.next.next;       //然后，将要删掉元素的下一个指针指向，元素的下一个的下一个。
        return true;
    }
}
