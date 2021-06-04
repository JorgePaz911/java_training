package Day2;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FNF_IO_ExceptionExample {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("data.txt"));
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }
        finally {
            if(bufferedReader != null){
                try{
                    bufferedReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){

        }catch (FileNotFoundException e){
            System.out.println("fnfe");
        }catch (IOException e){
            System.out.println("ioe");
        }
    }
}
