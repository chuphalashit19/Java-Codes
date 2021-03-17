import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileWriter;

public class vignereCipher {

    public static void main(String arg[]){
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Encryption key : ");
			String key = sc.nextLine();
			encrypt_file(key);
		}


        //System.out.print("Enter the String to be encrypted : ");
        //String inString = sc.nextLine();
        //String finalString = encrypt(inString, key);
        //System.out.print("\nThe encrypted String is : " + finalString);
    }

    // method that removes all the numbers, punctuations
    static String remove_ichars(String original_msg){
        original_msg = original_msg.replaceAll("[^A-Z\n\r]", "");
        return original_msg;
    }

    static String encrypt(String original_msg, String key){

                // allchars is our keyspace 
        String allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int all_chars_length = allChars.length();
        String encrypted_msg = "";

                // converting our string to uppercase
        original_msg = original_msg.toUpperCase();
                
                // removing all numbers, punctuations
        original_msg = remove_ichars(original_msg);
                
                // converting key to uppercase
        key = key.toUpperCase();
        
                int index = 0;
                // iterating over the original message character by chracter and decrypting it and appending it to the new string
        for(int i=0; i< original_msg.length(); i++){
            Character letter = original_msg.charAt(i);
            if(allChars.indexOf(letter) >= 0) {
                int position = (allChars.indexOf(letter) + allChars.indexOf(key.charAt(index))) % all_chars_length;
                Character e_letter = allChars.charAt(position);
                encrypted_msg += e_letter;
                index++;
                if(index >= key.length()){
                    index %= key.length();
                }
            }else{
                encrypted_msg += letter;
                index = 0;
            }
        }

        return encrypted_msg;
    }


    static void encrypt_file(String key){
        FileInputStream fin;
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path of the file : ");
        String file_name = sc.nextLine();
        String fullFile = "";

        try {
            fin = new FileInputStream(file_name);
            Scanner fp = new Scanner(fin);
            int size = 0;

            while (fp.hasNextLine()) {
                String line = fp.nextLine();
                fullFile += line + "\n";
                size += line.length();
            }
            System.out.println("File read successfully!!");
            fullFile = encrypt(fullFile, key);
            System.out.println("Data encrypted successfully!!");
            System.out.println(fullFile);
        }catch (Exception e){
            e.printStackTrace();
        }


        try {

            File newTextFile = new File("encrypted_file.txt");
            FileWriter f1 = new FileWriter(newTextFile);
            f1.write(fullFile);
            f1.close();
            System.out.println("Encrypted file stored on Desktop");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}