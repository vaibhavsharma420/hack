//Use a character class
import java.util.regex.*;
class Regex7{
    public static void main(String args[]){
        Pattern p=Pattern.compile("[a-z]+");
        Matcher m=p.matcher("hello this is ankita");
        while(m.find()){
            System.out.println("Match: "+m.group()+"\n");
        }}}