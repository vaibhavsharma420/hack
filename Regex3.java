import java.util.regex.*;
class Regex3{
    public static void main(String args[])
    {
        Pattern pat=Pattern.compile("Java");
        Matcher mat=pat.matcher("Java and Java are good");

        while(mat.find()){
            System.out.println(" test found at index "+mat.start()+"\n");
        }
    }
}