package chapter_one_arrays_strings.urlify;

// Write a method to replace all spaces with %20

public class Urlify {
    public static void main(String[] args) {
        System.out.println(urlify(new char[]{'a',' ','b',' ',' '},3));
    }


    public static String urlify(char[] c,int len){

        int count =0;
        for(int i=0;i<len;i++) {

            if (c[i] == ' ') {
                count++;
            }
        }
         int index = len+ (count*2) ;

           for(int j=len-1;j>=0;j--){

               if(c[j]==' '){

                   c[index-1]='0';
                   c[index-2]='2';
                   c[index-3]='%';
                    index-=3;
               }else{
                   c[index-1]=c[j];
                   index--;

               }


           }







        return new String(c);

    }
}
