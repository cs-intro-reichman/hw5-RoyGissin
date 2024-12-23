/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
        System.out.println(countChar(hello, 'h'));
        System.out.println(countChar(hello, 'l'));
        System.out.println(countChar(hello, 'z'));
        System.out.println(spacedString(hello));
        
    }

    /**
     * Returns the number of times the given character appears in the given string.
     * 
     * @param str - a string
     * @param c - a character
     * @return the number of times c appears in str
     */
    public static int countChar(String str, char c) {
        int counter=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                counter++;
            }
        }
        return counter;
    }

    /** Returns true if str1 is a subset string str2, false otherwise.
     *  For example, "spa" is a subset of "space", and "pass" is not
     *  a subset of "space".
     *
     * @param str1 - a string
     * @param str2 - a string
     * @return true is str1 is a subset of str2, false otherwise
     */
    public static boolean subsetOf(String str1, String str2) {
       if(str1.length()>str2.length()){
        return false;
       }
       for(int i=0;i<str1.length();i++){
        char c=str1.charAt(i);
        if(countChar(str1, c)>countChar(str2, c)){
            return false;
        }
       }
       return true;
    }

    /** Returns a string which is the same as the given string, with a space
     * character inserted after each character in the given string, except
     * for last character of the string, that has no space after it. 
     * Example: if str is "silent", returns "s i l e n t".
     * 
     * @param str - a string
     * @return a string consisting of the characters of str, separated by spaces.
     */
    public static String spacedString(String str) {
        String space="";
        if(str==""){
            return space;
        }
        for(int i=0;i<str.length();i++){
            if((i==str.length()-1)){
                space+=str.charAt(i);
                break;
            }
        space+=(str.charAt(i)) + " ";
    } 
    return space;
}
  
    /**
     * Returns a string of n lowercase letters, selected randomly from 
     * the English alphabet 'a', 'b', 'c', ..., 'z'. Note that the same
     * letter can be selected more than once.
     * 
     * @param n - the number of letter to select
     * @return a randomly generated string, consisting of 'n' lowercase letters
     */
    public static String randomStringOfLetters(int n) {
        char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] newarr=new char[n];
        for(int i=0;i<n;i++){
            int x=(int) (Math.random()*26);
            newarr[i]=arr[x];
        }
       String str="";
        for(int i=0;i<n;i++){
            str+=newarr[i];
        }
        
        return str;
    }

    /**
     * Returns a string consisting of the string str1, minus all the characters in the
     * string str2. Assumes (without checking) that str2 is a subset of str1.
     * Example: "committee" minus "meet" returns "comit". 
     * 
     * @param str1 - a string
     * @param str2 - a string
     * @return a string consisting of str1 minus all the characters of str2
     */
    public static String remove(String str1, String str2) {
        char [] arr1=new char[str1.length()];
        for(int i=0;i<str1.length();i++){
            arr1[i]=str1.charAt(i);
        }
        char [] arr= arr1;
        char [] arr2=new char[str2.length()];
        for(int i=0;i<str2.length();i++){
            arr2[i]=str2.charAt(i);
        }

        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==arr2[j]){
                    arr[i]=' ';
                   arr2[j]=' ';
                   break;
                }
            }
        } 
        String str="";
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=' '){
                str+=arr[i];
            }
        }

            
        
        return str;
    }

    public static String insertRandomly(char ch, String str) {
         // Generate a random index between 0 and str.length()
         int randomIndex = (int) (Math.random() * (str.length() + 1));
         // Insert the character at the random index
         String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
         return result;
    }    
}