package Recursion.String;

import java.util.HashSet;

public class SubSequence {
    public static void main(String[] args) {
//    subsequence("abc",0,"");

    HashSet<String> set=new HashSet<>();
        subsequence2("aaa",0,"",set);

    }

    public static void subsequence2(String s,int index,String newS,HashSet<String> set){
        // if string s= "aaa" and we want unique substrings therefore we use hashset
        if(index==s.length()){
            if(set.contains(newS)){return;}
            else{
            System.out.println(newS);
            set.add(newS); return;
            }
        }
        char currChar=s.charAt(index);
        //to choose
        subsequence2(s,index+1,newS+currChar,set);

        //not choose
        subsequence2(s,index+1,newS,set);


    }

    public static void subsequence(String s,int index,String newS){
        if(index==s.length()){
            System.out.println(newS);
            return;
        }
        char currChar=s.charAt(index);
        //to choose
        subsequence(s,index+1,newS+currChar);

        //not choose
        subsequence(s,index+1,newS);


    }

}

// to print substring of a string we have 2 choices
// 1--> choose call1--> newString+currchar
// 2--> no choose call2--> newString