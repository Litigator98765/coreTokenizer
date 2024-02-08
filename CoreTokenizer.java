import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

/*
* coreTokenizer
*/
public class CoreTokenizer {
    public CoreTokenizer(String input) {
        try {
            FileReader fileReader = new FileReader(input);
            BufferedReader in = new BufferedReader(fileReader);
        } catch(IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
        
    }

    public int getToken(){
        return 0;
    }

    public void skipToken(){

    }

    public int intVal(){
        return 0;
    }

    public String idName(){
        return "";
    }



    public static void main(String[] args){
        System.out.println("Hello");
    }
}