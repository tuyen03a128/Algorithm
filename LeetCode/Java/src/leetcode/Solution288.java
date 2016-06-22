/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 * Unique Word Abbreviation.
 * An abbreviation of a word follows the form <first letter><number><last letter>. 
 * Below are some examples of word abbreviations:
 * 
 * a) it                      --> it    (no abbreviation)
 * 
 *      1
 * b) d|o|g                   --> d1g
 * 
 *               1    1  1
 *      1---5----0----5--8
 * c) i|nternationalizatio|n  --> i18n
 * 
 *               1
 *      1---5----0
 * d) l|ocalizatio|n          --> l10n
 * Assume you have a dictionary and given a word, find whether its abbreviation 
 * is unique in the dictionary. A word's abbreviation is unique if no other word 
 * from the dictionary has the same abbreviation.
 * 
 * Example: 
 * Given dictionary = [ "deer", "door", "cake", "card" ]
 * 
 * isUnique("dear") -> false
 * isUnique("cart") -> true
 * isUnique("cane") -> false
 * isUnique("make") -> true 
 * 
 * @author Johnny
 */
public class Solution288 {
    //http://buttercola.blogspot.com/2015/10/leetcode-unique-word-abbreviation.html
    HashMap<String, String> map = new HashMap();
    public Solution288(String[] dictionary) {
        if (dictionary == null || dictionary.length == 0) {
            
        }
        for (String item: dictionary) {
            String abbr = toAbbr(item);
            if (!map.containsKey(abbr)) {
                map.put(abbr, item);
            }
        }            
    }
    
    public boolean isUnique(String word) {
        String abbr = toAbbr(word);
        if(!map.containsKey(abbr) || map.get(abbr).equals(word)) {
            return true;
        } else {
            return false;
        }
    }

    private String toAbbr(String s) {
        if (s == null || s.length() <= 2) {
            return s;
        }
         
        int len = s.length() - 2;
         
        return s.charAt(0) + "" + len + s.charAt(s.length() - 1);
    }
}
