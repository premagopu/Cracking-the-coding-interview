package chapter_one_arrays_strings.palindromepermutation;

import java.util.HashSet;

public class PalindromePermutation {
    public static void main(String[] args) {

        System.out.println(checkPalindromePermutation("dog"));
        System.out.println(checkPalindromePermutation("tact coa"));
        System.out.println(methodTwo("dog"));
        System.out.println(methodTwo("tact coa"));

    }

// Time Complexity O(n)

    public static boolean checkPalindromePermutation(String s){

        int count =0;
        int[] charSet = new int[128];

        for(int i=0; i<s.length();i++){

            charSet[s.charAt(i)]++;

            if(charSet[s.charAt(i)]%2==0){
                count++;
            }else{
                count--;
            }

        }

        return count<=1;


    }

    // Time Complexity O(N) This solution doesn't work with spaces in the string

    public static Boolean methodTwo(String s){

        HashSet<Character> charSet = new HashSet<Character>();


        for(int i =0;i<s.length();i++) {

            if (!charSet.add(s.charAt(i))) {
                charSet.remove(s.charAt(i));
            }
        }
            return charSet.size()<=1;


    }


}
