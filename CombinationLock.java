import java.io.*;

public class CombinationLock {
    private String key;
    
    /**
     * Simple constructor to take a string and assign it to the key.
     * 
     * @param initKey A string to assign to key.
     **/
    public CombinationLock(String initKey) {
        key = initKey;
    }
    
    /**
     * A function to check a string against the key and get a clue.
     * Outputs a character in the corresponding point in the guess.
     * The same character if it's a match, + if the character is in the string but wrong place, + if it's not in the string at all.
     * Additionally, it'll only output as long as the key is, so if the guess is longer it'll cut off, and if it's shorter it'll fill with -.
     * 
     * @param guess A string to check against the key and get a clue for.
     **/
    public void getClue(String guess) {
        int diff = key.length() - guess.length();
        String tmp = "";
        
        for (int i = 0; i < guess.length(); i++) {
            if (i > key.length()) {
                break;
            }
            
            if(key.charAt(i) == guess.charAt(i)) {
                tmp += key.charAt(i);
                
                continue;
            }
            
            if (key.indexOf(guess.charAt(i)) != -1) {
                tmp += "+";
            } else {
                tmp += "*";
            }
        }
        
        for (int k = 0; k < diff; k++) {
            tmp += "-";
        }
        
        System.out.println(tmp);
    }
}
