/**
 * CountOccurenceOfGivenChar
 */
public class CountOccurenceOfGivenChar {

    public static int countOccurenceGivenChar(String str,char ch) {

        // using n time 
        // and constant Space
        int count=0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)==ch) {
                count++;
            }
            
        }

        return count;

    }

    //using compare method
    public static int countOccurenceGivenChar1(String str,char ch) {
        // Compare will subtract the first character from the second character and returns the value
        // so char1 == char2 -->0
        //char1 > char2 --> +ve
        //char1 < char2 --> -ve
        int count=0;
        for (int i = 0; i < str.length(); i++) 
            if (Character.compare(str.charAt(i), ch)==0) 
                count++;

        return count;

    }
    public static void main(String[] args) {
        
        int result=countOccurenceGivenChar1("nnn",'n');
        System.out.println(result);
    }

    
}


