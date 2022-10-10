// Using a quantifier
import java.util.regex.*;
class Regex4{
    public static void main(String args[]){
        Pattern p=Pattern.compile("W+");
        Matcher m=p.matcher("W WW WWW");

        while(m.find()){
            System.out.println("Match: "+m.group());
        }
    }}