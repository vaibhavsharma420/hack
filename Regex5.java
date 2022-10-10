// Use Wildcard and Quantifier

import java.util.regex.*;
class Regex5{
    public static void main(String args[]){

        Pattern p=Pattern.compile("e.+?d");
        Matcher m=p.matcher("extend cup end table");
        while(m.find()){
            System.out.println("Match: "+m.group());
        }
    }}


    /* In general, to convert a greedy quamtifier into a reluctant quantifier, add a ?.
    We cam also specify possesive behavior by appending a+.*/