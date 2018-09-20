package chapter_one_arrays_strings.checkpermutation;

//Given two strings, write a method to decide if one is a permutation of other

import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) {
        String original = "dog";
        String check = "god";
        System.out.println(checkPalindrome(original,check));
        System.out.println(methodTwo(original,check));
    }


    // Method 1 : sorting and comparing

    public static boolean checkPalindrome(String org, String chk){

        // Edge cases
        if(org.length()!=chk.length()){
            return false;
        }

       return sort(org).equals(sort(chk));
    }


    public static String sort(String a){

       char[] temp = a.toCharArray();
       Arrays.sort(temp);

       return new String(temp);
    }


    // Method 2: Assuming ASCII characters

    public static boolean methodTwo(String org, String chk){
        // Edge cases
        if(org.length()!=chk.length()){
            return false;
        }

        int[] charSet =new int[128];
        char[] orgAry = org.toCharArray();
        for(char c: orgAry){
            charSet[c]++;
        }

        for(int i=0;i<chk.length();i++){
            int val =chk.charAt(i);
            charSet[val]--;

            if(charSet[val]<0){
                return false;
            }



        }

        return true;





    }


}
