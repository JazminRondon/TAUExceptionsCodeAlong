package tauCodeAlongCh13A;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

      //  createNewFile();
        numbersExceptionHandling();
    }
        public static void createNewFile () {
            File file = new File("C:\\Users\\Jazmin\\New Projects\\ExceptionsAndLoggers\\src\\main\\resources\\nonexistent.txt");
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("Directory does not exist.");
                ex.printStackTrace();
            }
        }// end createNewFile()
        public static void numbersExceptionHandling () {
            File file = new File("C:\\Users\\Jazmin\\New Projects\\ExceptionsAndLoggers\\src\\main\\resources\\numbers.txt");
            try(Scanner fileReader=new Scanner(file)) {
                    while(fileReader.hasNext()){
                        double num=fileReader.nextDouble();
                        System.out.println(num);
                    }

            }  catch (FileNotFoundException | InputMismatchException ex) {
                ex.printStackTrace();
            }
        }


} //end Class
