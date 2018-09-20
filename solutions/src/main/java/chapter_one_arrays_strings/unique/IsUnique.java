package chapter_one_arrays_strings.unique;

/* 1.1 Implement an algorithm to determine if a string has all unique characters.
        What if you cannot use additional data structures?*/

public class IsUnique {


    public static void main(String[] args) {
        String test1= "abcda";
        String test2= "abcd";
        System.out.println(isUnique(null));
        System.out.println(isUnique(test1));
        System.out.println(isUnique(test2));
        System.out.println(methodTwo(test1));
    }


    // Time Complexity : O(n)

    public static boolean isUnique(String a){
        //Considering ASCII values

        //Edge cases
        if(a==null || a.length()>128) {
            return false;
        }

        boolean[] charSet= new boolean[128];

        for(int i=0; i<a.length();i++){

            char c= a.charAt(i);

            if(charSet[c]){
                return false;
            }

            charSet[c] = true;
        }

       return true;
    }


    // Time Complexity : O(n^2)

    public static boolean methodTwo(String a){

        //Edge cases
        if(a==null || a.length()>128) {
            return false;
        }
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }





}
