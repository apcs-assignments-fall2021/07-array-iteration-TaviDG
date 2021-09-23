
import java.util.Arrays;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int [] reversed = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            reversed[arr.length-(i+1)]=arr[i];
        }
        return reversed;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        for (int x:arr){
            int bigger = 0;
            for (int y: arr){
                if (y>x){
                    bigger++;
                }
            }
            if (bigger==1){
                return x;
            }
        }
        return 0;
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};
        for (String dicWord : dictionary){
            if (word.equals(dicWord)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] arr={1,5,7,2,4,8};
        int [] arr2={8,4,6,2,9,4,56};
        System.out.println("Reverse test:");
        System.out.println(Arrays.toString(reverse(arr))); //8,4,2,7,5,1
        System.out.println(Arrays.toString(reverse(arr2)));//56,4,9,2,6,4,8
        System.out.println("Second largest test:");
        System.out.println(secondLargest(arr));//7
        System.out.println(secondLargest(arr2));//9
        System.out.println("Spelling tests:");
        System.out.println(spellCheck("that"));//true
        System.out.println(spellCheck("pumpernickel"));//false

    }
}
