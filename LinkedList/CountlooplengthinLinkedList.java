package LinkedList;
// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(){
//         val =0;
//         next = null;
//     }
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
        // return -1 if no loop exists else return length of the loop
        Node slow = root;
        Node fast = root;
        int count = 0;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
            if(slow == fast) {
                count = 1;
                Node temp = slow.next;

                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }

                return count;
            }
        }
        
        return -1;
    }
}