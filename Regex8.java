import java.util.regex.*;
class Regex8{
    public static void main(String args[]){
        String str="Jon Jonathan Swift is immortal";
        Pattern p=Pattern.compile("Jon.*? ");
        Matcher m=p.matcher(str);
        System.out.println("Original Sequence: "+str);
        str=m.replaceAll("Ankita ");
        System.out.println("Modified Sequence: "+str);
        }
    }
