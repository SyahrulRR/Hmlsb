package hmlsb;

import java.util.Comparator;


//class HuffmanNode : untuk membuat node
 
class HuffmanNode {
    int item;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}

  //class ImplementComparator : untuk perbandingan node
 
class ImplementComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y){
        return x.item - y.item;
    }
}

public class HuffmanModule {
    
    // init character, code
    public String character = "";
    public String code = "";
    
    
     // method printCode : untuk menyimpan kode huffman
     
    public void printCode(HuffmanNode root, String s){
        if(root.left == null && root.right == null){
            this.character = this.character + root.c + " ";
            this.code = this.code + s + " ";
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }
    
      //method isExist : untuk mengecek karakter dalam plaintext 
    public boolean isExist(String plaintext, char character){
        for(int i=0; i<plaintext.length(); i++){
            if(character == plaintext.charAt(i)){
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * method getCharacter : untuk mendapatkan karakter dalam plaintext
     * @return character_plaintext {String}
     * 
     */
    public String getCharacter(String plaintext){
        String character_plaintext = "";
        
        for(int i=0; i<plaintext.length(); i++){
            if(!isExist(character_plaintext, plaintext.charAt(i))){
                character_plaintext = character_plaintext + plaintext.charAt(i);
            }
        }
        
        return character_plaintext;
    }
    
    /**
     * method getFrequency : untuk menghitung frekuensi karakter
     * @return frequency {int}
     */
    public int getFreqency(String plaintext, char character){
        int frequency = 0;
        
        for(int i=0; i<plaintext.length(); i++){
            if(character == plaintext.charAt(i)){
                frequency++;
            }
        }
        
        return frequency;
    }
    
    /**
     * method sortByFrequency : untuk mengurutkan karakter berdasarkan frekuensi
     * @param character {array char}
     * @param frequency {array int}
     */
    public void sortByFrequency(char character[], int frequency[]){
        for(int i=0; i<frequency.length-1; i++){
            for(int j=0; j<frequency.length-i-1; j++){
                if(frequency[j] > frequency[j+1]){
                    int temp = frequency[j];
                    char temp2 = character[j];
                    
                    frequency[j] = frequency[j+1];
                    character[j] = character[j+1];
                    
                    frequency[j+1] = temp;
                    character[j+1] = temp2;
                }
            }
        }
    }
    
    /**
     * method encode : untuk encoding plaintext menjadi
     */
    public String encode(String character, String code, String plaintext){
        String encode = "";
        
        String charArr[] = character.split(" "); //split: membagi ke array string
        String codeArr[] = code.split(" ");
                
        for(int i=0; i<plaintext.length(); i++){
            for(int j=0; j<charArr.length; j++){
                if(Character.toString(plaintext.charAt(i)).equals(charArr[j])){
                    encode = encode + codeArr[j];
                }
            }
        }
        
        return encode;
    }
    
    public String decode(String character, String code, String ciphertext){
        String decode = "";
        
        String charArr[] = character.split(" ");
        String codeArr[] = code.split(" ");
        
        String ch = "";
        for(int i=0; i<ciphertext.length(); i++){
            ch = ch + ciphertext.charAt(i);
            
            for(int j=0; j<codeArr.length; j++){
                if(ch.equals(codeArr[j])){
                    decode = decode + charArr[j];
                    ch = "";
                }
            }
        }
        
        return decode;
    }
}
