import java.util.ArrayList;

/**
 * firstNonRepeatedCharacter
 */
public class firstNonRepeatedCharacter {

    public static  char firstNonRepeat(String s) {

        ArrayList<Character> keyList=new ArrayList<Character>();
        ArrayList<Integer> frequencyList=new ArrayList<Integer>();

        for ( char inputChar: s.toCharArray()) {
            Character c=new Character(inputChar);
            if (!keyList.contains(c)) {
                keyList.add(c);
                frequencyList.add(1);
            }
            else{
                int updatedIndex=0;
                updatedIndex=keyList.indexOf(c);
                int currentKey=0;
                currentKey=frequencyList.get(updatedIndex);
                frequencyList.set(updatedIndex, ++currentKey);
                

            
            }
            
        }     

        if (frequencyList.contains(new Integer(1))) {

            int indexOfFirstRepeat=frequencyList.indexOf(new Integer(1));
            System.out.println("First non repeating character is "+ keyList.get(indexOfFirstRepeat));
            return keyList.get(indexOfFirstRepeat).charValue();
                    
        }
        else{

            System.out.println("no such char which is repeated");
            return Character.MIN_VALUE;
        }
    }
    public static void main(String[] args) {
        

        char result= firstNonRepeat("eerrtt");
       
        System.out.println(result);
    }
}


//GeeksQuiz

