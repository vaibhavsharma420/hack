import java.util.regex.*;
class Regex1{
    public static void main(String args[]){
        Pattern p=Pattern.compile("Java");
        Matcher m=p.matcher("Java is good.");

        if(m.find())
        System.out.println("Subsequence Matched");
    else{
        System.out.println("Subsequence Not matched");
    }  

}}