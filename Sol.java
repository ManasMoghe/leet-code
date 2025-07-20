class Node
{
        public __init__(data)
        {
                self.data=data;
                self.next=None;
        }
}

class Solution {
    public ListNode build_linklist(num)
    {
        int head=Node(num[0]);
        int content=head;
        for(int i=0;content!=0;i++)
        {
                content.next=num[1:];
                content=content.next;
        }
        return head;
    }
    public ListNode print_list(head)
    {
        content=head;
        while (content)
        {
                System.out.println(content.data,end="->");
                content=content.next;
        }
        System.out.println(""None"");
    }
}

public class Main
{
        public static void main(String[] args)
        {
                l1=[2,4,3];
                head1=sol.build_linklist(l1);
        }
} 