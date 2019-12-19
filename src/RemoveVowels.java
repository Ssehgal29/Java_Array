public class RemoveVowels {
    public static void main(String args[]){
        String str="sahil";
        RemoveVowels obj=new RemoveVowels();
        String afterRemoval=obj.removeVowel(str);
        System.out.print(afterRemoval);
    }
    private static String removeVowel(String str){
        String finalString="";
        for (int i=0;i<str.length();i++){
            if (!isVowel(str.charAt(i))){
                finalString=finalString+str.charAt(i);
            }
        }
        return finalString;
    }

    private static boolean isVowel(char c){
        String vowel="aeiou";
        for (int i=0;i<vowel.length();i++){
            if (c==vowel.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
