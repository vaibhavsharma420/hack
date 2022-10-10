//* We can reduce an input sequence into its individual tokens by using the split() method defined by Pattern.*/

import java.util.regex.*;
class Regex9{
    public static void main(String args[]){
        // Match lower case words
        Pattern p=Pattern.compile("[ ,.!]");
        String strs[]=p.split("one two, alpha9 12! done. ");
        for(int i=0; i<strs.length;i++)
        System.out.println("Next Token: "+strs[i]);
        }
    }
