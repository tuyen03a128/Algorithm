package johnny.algorithm.leetcode;

/**
 * ZigZag Conversion.
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 * 
 *  P   A   H   N
 *  A P L S I I G
 *  Y   I   R
 * 
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a 
 * number of rows:
 * 
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 
 * @author Johnny
 */
public class Solution006 {
    public String convert2(String s, int nRows) {
        if(s == null || s.length() == 0) {
            return "";
        }
        if(nRows <= 1) {
            return s;
        }
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }
    //http://www.cnblogs.com/springfor/p/3889414.html
    public String convert(String s, int nRows) {  
        if(s == null || s.length() == 0) {
            return "";
        }
        if(nRows <= 1) {
            return s;
        }
            
        StringBuilder res = new StringBuilder();  
        int size = 2 * nRows - 2;  
        for(int i = 0; i < nRows; i++){  
            for(int j = i; j < s.length(); j += size){  
                res.append(s.charAt(j));  
                if(i != 0 && i != nRows - 1){//except the first row and the last row
                    int temp = j + size - 2 * i;
                    if(temp < s.length()) {
                        res.append(s.charAt(temp));
                    }
                }
            }                  
        }  
        return res.toString();  
    }
}
