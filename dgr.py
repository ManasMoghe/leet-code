class Node:
    def __init__(self,data):
        self.data=data
        self.next=None
def build_linked_list(num):
    head=Node(num[0])
    content=head
    for i in num[1:]:
        content.next=Node(i)
        content=content.next
    return head
def print_list(head):
    current=head
    while current:
        print(current.data, end="->")
        current=current.next
    print("None")
l1=[2,4,3]
l2=[5,6,4]
head1=build_linked_list(l1)
head2=build_linked_list(l2)

print_list(head1)
print_list(head2)

