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
public class StringProblems {
    
    
    /*
    Unique String:
    Creates an array of 256 (one index for each ASCII character value
    initializes each index to false, if during the traversal of the string, an
    index is hit that is already true, the string is not unique and should return
    false.  If it passes, return true    
    */
    public static boolean isUniqueChars(String test) {
        
        boolean [] charValueArray = new boolean[256];
        
        for(int i = 0; i < test.length(); i++) {
            charValueArray[i] = false;
        }
        for(int i = 0; i < test.length(); i++) {
            int valueAtIndex = test.charAt(i);
            if (charValueArray[valueAtIndex]) {
                return false;
            } else {
                charValueArray[valueAtIndex] = true;
            }
            
        }
        return true;
    }
    
    //If no data structures are allowed to find a unique string
    public static boolean isUniqueChar(String test) {
        
        int checker = 0;
        for (int i = 0; i < test.length(); i++) {
            int val = test.charAt(i);
            val -= 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        
        }
        return true;
    }
    
    
    //----------------------------------------------------------------------
    
    /* Reverse a C-Style String ("abcd" = 4 chars and null pointer):
        Basically get one int index to the end of the array (if its a C array,
    one would have to get to the null pointer and then go back one) and 
    another int index to the begining and swap values while the lower is less than
    the upper.
    */
    
    public static String reversal(String toReverse) {
        
        int l = toReverse.lastIndexOf(toReverse);
        int i = 0;
        char[] charArr = toReverse.toCharArray();
        //In C, one would traverse the array till the '\0' value was found
        //then go back one and start the while loop
        for (i = 0; i < charArr.length; i++) {
            
            while (i < l) {
                char holder = charArr[i];
                charArr[i] = charArr[l];
                charArr[l] = holder;
                i++;
                l++;                
            }
        }
        return charArr.toString();
    }
    
    
    //----------------------------------------------------------------------
    
    /* Write Code to Remove the duplicate values of a String:
    
    
    */
    
    public static void doopRemover(String str) {
        
        int i = 0;
        int j = 0;
        
        char [] charArr = str.toCharArray();
        
        
    }
    
    /*Write a method to decide if two strings are anagrams or not
    
    
    */
    
    
    /*Write a method to replace all spaces in a string with ‘%20’
    
    
    */
    
    
    /*
    Assume you have a method isSubstring 
    which checks if one word is a substring 
    of another Given two strings, s1 and s2, 
    write code to check if s2 is a rotation of s1 
    using only one call to isSubstring 
    (i e , “waterbottle” is a rotation of “erbottlewat”)
    
    */
    
}
