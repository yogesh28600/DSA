package assignments.arrays;

//10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
public class PangramSetence {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        return helper(sentence,'a',false,0);


    }

    static boolean helper(String sen,char c,boolean isPangram,int idx){

        if(idx>=26){
            return isPangram;
        }
        String str= ""+c;
        if(!sen.contains(str)){
            return false;
        }else{
            isPangram=true;
        }
        return helper(sen,c+=1,isPangram,idx+1);
    }
}
