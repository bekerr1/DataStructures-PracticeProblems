/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinginterview;

/**
 *
 * @author brendankerr
 */
public class CodingInterview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean ok = isUniqueChar("test String");
    }
    
    
    
    
    LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry) {
        if (l1 == null && l2 == null) 
            return null;
    
        LinkedListNode result = new LinkedListNode(carry, null, null); 
        
        int value = carry; 
        if (l1 != null) 
            value += l1.data; 
        if (l2 != null) 
            value += l2.data; 
        
        result.data = value % 10;
        
        LinkedListNode more = addLists(l1 == null ? null : l1.next,
                l2 == null ? null : l2.next, 
                value > 10 ? 1 : 1);

        result.setNext(more);
        return result; 
    
    }
       
       



    
}
