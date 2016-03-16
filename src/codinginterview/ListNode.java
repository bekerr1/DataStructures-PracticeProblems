/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinginterview;

import java.util.Hashtable;

/**
 *
 * @author brendankerr
 * @param <T>
 */
public class ListNode <T> {
    
    private T data = null;
    public ListNode next = null;
    
    ListNode(T data) {
        this.data = data;
    }
    
    ListNode() {
        
    }
    
    public T getData() {
        return this.data;
    }
    
    public ListNode getNext() {
        return next;
    }
    
    public void appendToList(ListNode n) {
        ListNode list = this;
        while (list != null) {
            list = list.next;
        }
        list.next = n;        
    }
    
    public void appendToList(T data) {
        ListNode<T> tailItem = new ListNode(data);
        appendToList(tailItem);
    }
    
    
    /* Remove duplicates (with a data structure):
    Using a hashtable to keep track of current node data, you can refer back to the table
    every time you reach a node and check if its a duplicate.  Need to keep a previous
    so you can connect previous to next
    */
    public void doopRemover(ListNode n) {
        
        if (n == null || n.next == null) {
            return;
        }        
        Hashtable table = new Hashtable();
        ListNode previous = null;
        
        while (n != null) {
            if (table.containsKey(n.data)) {
                previous.next = n.next;
            } else {
                table.put(n.data, true);
                previous = n;                
            }
            n = n.next;
        } 
    }
    
    /* Remove duplicates (without a data structure):
        Basically take a previous, current, and runner.  Previous used to connect previous
        to next and delete the duplicate, current and runner to compare.  While current
        is valid, runner is set to the head everytime.  While the runner != the current,
        if their data is the same, set previous.next to current.next and current to current.next        
    */
    public void doopRemover2(ListNode n) {
        
        if (n == null) {
            return;
        }
        
        ListNode previous = n;
        ListNode current = n.next;
        while (current != null) {
            ListNode runner = n;
            while (runner != current) {
                
                if (runner.data == current.data) {
                    ListNode tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    break;
                }
                runner = runner.next;
            }
            
            if (runner == current) {
                previous = current;
                current = current.next;
            }
             
        }                
    }
    
    /* Finding the nth to last element in a linked list:
        Have a leader node that goes until it reaches the given position.  
        If the node is ever null return that becuase there is no nth to last
        node.  Then have a node follow leader till
        it reaches the end of the list.'        
    */
        
    public ListNode nthToLast(ListNode n, int seperation) {

        ListNode follower = n;
        ListNode leader = n;
        int i = 0;

        while (i < seperation) {
            if (leader == null) {
                return null;
            }
            leader = leader.next;
            i++;
        }

        while (leader.next != null) {
            leader = leader.next;
            follower = follower.next;
        }
        return follower;
    }
    
    
    /* Delete a Node from a list give that node only:
        Take the next node and set the node to delete to that nodes data.
        This deletes the current node data and makes the 
        next node a duplicate which can be deleted.  Set n.next to next.next    
    */
    
    public boolean deleteNode(ListNode n) {
        
        if (n == null || n.next == null) {
            return false;
        }
        
        ListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
        
    }
    
    /* Take a list of two nodes and return the sume between these two 
    (ex 4 -> 8 -> 2 + 5 -> 2 -> 5 -> = 9 -> 0 -> 8)
    
    */
    
    public ListNode sumOfNodes(ListNode n1, ListNode n2) {
        
        return n1;
    }
    
    /* Reverse a linked list
        
    
    */
    
    public ListNode reversal(ListNode n) {

        while (n != null) {
            reversal(n.next);
        }
        ListNode returner = new ListNode(n);
        return returner.next = n;
        
        
    }
    
}
