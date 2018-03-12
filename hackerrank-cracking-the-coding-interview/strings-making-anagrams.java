/* 
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        HashMap<Character, Integer> occ = new HashMap<Character, Integer>();
        HashMap<Character, Integer> occ2 = new HashMap<Character, Integer>();
        
        for (int i = 0; i < first.length(); i++) {
            Character key = first.charAt(i);
            Integer value = 0;
            if (occ.containsKey(key)) {
                value = occ.get(key);
            }
            occ.put(key, value + 1);
        }
        
        for (int i = 0; i < second.length(); i++) {
            Character key = second.charAt(i);
            
            if (occ.containsKey(key)) {
                Integer value = occ.get(key);
                occ.put(key, value - 1);
                if (value == 1) {
                    occ.remove(key);
                }
            }
            else {
                Integer value = 0;
                if (occ2.containsKey(key)) {
                    value = occ2.get(key);
                }
                occ2.put(key, value + 1);
            }
        }
        
        int sum = 0;
        
        for (Integer i: occ.values()) {
            sum += i; 
        }
        for (Integer i: occ2.values()) {
            sum += i; 
        }
        
        return sum;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
