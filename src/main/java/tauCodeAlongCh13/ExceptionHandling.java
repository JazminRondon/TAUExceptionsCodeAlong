package tauCodeAlongCh13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        createNewFile();
        numbersExceptionHandling();
        createNewFileRethrow();
    }
        public static void createNewFile () {
            File file = new File("C:\\Users\\Jazmin\\New Projects\\ExceptionsAndLoggers\\src\\main\\resources\\nonexistent.txt");
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("Directory does not exist.");
                ex.printStackTrace();
            }
        }// end createNewFileRethrow()
    public static void createNewFileRethrow() throws IOException  {
        File file = new File("C:\\Users\\Jazmin\\New Projects\\ExceptionsAndLoggers\\src\\main\\resources\\nonexistent.txt");

            file.createNewFileRethrow();

    }// End createNewFileRethrow()
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
        public static void calculatSalary(double hours, double rate){
        if (hours>40);
        throw new IllegalArgumentException("We do not allow overtime")
        }
    public static void calculatSalary(double hours, double rate){
        if (hours>40);
        throw new IllegalArgumentException("We do not allow overtime");
    }


} //end Class
