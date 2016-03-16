/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinginterview;

/**
 *
 * @author brendankerr
 * @param <M>
 */
public class Stack <M> {
    
    /* Has a top where it can push or pop to.
    
    
    */
    //Array Top
    private M arrTop[];
    private int currentTopIndex = 0;
    private int minStackElement = 0;
    
    //LinkedList Top
    private ListNode <M> listTop;
    //Node <M> currentTopNodeHandler = null;
    ListNode <M> minStackNode = null;
    
    
    
    Stack(M data) {
        this.arrTop = (M[]) new Object[100];
        this.arrTop[0] = data;
        listTop = new ListNode(data);
        
    }
    
    Stack() {
        this.arrTop = (M[]) new Object[100];
        listTop = new ListNode();
    }
    
    M popArrFromZero() {
        int i = 0;
        for (i = 0; arrTop[i] != null; i++) {
            
        }        
        i--;
        M returnData = arrTop[i];
        arrTop[i] = null;
        return returnData;      
    }
    
    M popArr() {
        M returnData = arrTop[currentTopIndex];
        arrTop[currentTopIndex] = null;
        currentTopIndex--;        
        return returnData;
    }
    
    M popListFromZero() {
        while (listTop.next != null) {
            listTop = listTop.next;
        }
        M returnData = listTop.getData();
        listTop = null;
        return returnData;
    }
    
    public void pushToArr(M data) {
        
        arrTop[currentTopIndex] = data;
        currentTopIndex++;
    }
    
    public void pushToList(M data) {
        
        ListNode <M> newNode = new ListNode(data);
        while (listTop != null) {
            listTop = listTop.next;
        }
        listTop = newNode;
    }
    
    /*Describe how you could use a single array to implement three stacks
    
    */
    
    
    /*How would you design a stack which, in addition to push and pop, 
    also has a function min which returns the minimum element? 
    Push, pop and min should all operate in O(1) time
        Keep a variable min insider your stack object.
    
    */
    
    
    
    /* Imagine a (literal) stack of plates If the stack gets too high, 
    it might topple There- fore, in real life, we would likely start a 
    new stack when the previous stack exceeds some threshold Implement
    a data structure SetOfStacks that mimics this SetOf- Stacks should 
    be composed of several stacks, and should create a new stack once 
    the previous one exceeds capacity SetOfStacks push() and SetOfStacks 
    pop() should behave identically to a single stack (that is, pop() 
    should return the same values as it would if there were just a single stack)
    FOLLOW UP:
    Implement a function popAt(int index) which performs a pop operation on a specific sub-stack
    */
    
    /*In the classic problem of the Towers of Hanoi, you have 3 rods
    and N disks of different sizes which can slide onto any tower 
    The puzzle starts with disks sorted in ascending order of size 
    from top to bottom (e g , each disk sits on top of an even larger one)
    You have the following constraints:
        (A) Only one disk can be moved at a time
        (B) A disk is slid off the top of one rod onto the next rod
        (C) A disk can only be placed on top of a larger disk
    Write a program to move the disks from the first rod to the last using Stacks
    */
    
    
    /*Implement a MyQueue class which implements a queue using two stacks
    
    
    */
    
    
    /*Write a program to sort a stack in ascending order 
    You should not make any assump- tions about how the stack
    is implemented The following are the only functions that 
    should be used to write this program: push | pop | peek | isEmpty
    */
    
    
}
