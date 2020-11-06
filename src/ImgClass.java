import java.util.Scanner;
import java.util.*;

public class ImgClass {

    String fileName = "";

    // test function, call to test a piece of the code
    // give user input for the function you want to run and it will return the output to where the function was called
    // "fname" for first name
    // "lname" for last name
    // "set" for the image set
    // "fetFunN" for the name of the file name
    public String test() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, enter a command: ");

        String retVal = "";
        boolean tryAgain = false;
        do {
            //get input
            String a = scanner.nextLine();

            // check input and run function if possible, if not repeats this loop
            tryAgain = false;
            if (a.equals("fname")) {
                retVal = getNameF();
            } else if (a.equals("lname")) {
                retVal = getNameL();
            } else if (a.equals("set")) {
                retVal = getSet();
            }else if (a.equals("getFunN")){
                retVal = getFileName();
            }else{
                // make sure that the given input is something it can run
                tryAgain = true;
                System.out.println("Not valid input, try again: ");
            }
        }while(tryAgain);

        // returns the result of the function call
        return retVal;
    }

    // sets the name of the file which this class is understanding the data for
    public void setFileName(String a){
        fileName = a;
    }

    // returns the file name that this class is holding
    public String getFileName(){
        return fileName;
    }

    // returns the image set that this image is a part of
    public  String getSet(){
        try{
            String set = fileName.substring(0, fileName.indexOf("."));

            return set;
        }catch (StringIndexOutOfBoundsException e){
            // tells the user that nothing was found and returns null if there is nothing found
            System.out.println("Data not provided or inputted incorrectly");
            return null;
        }
    }

    // returns the first name of the person
    public String getNameF(){
        try {
            // get name to equal the first name
            String name = fileName.substring(fileName.indexOf(".")+1, fileName.lastIndexOf("."));
            name = name.substring(0, name.indexOf("."));

            return name;
        }catch (StringIndexOutOfBoundsException e){
            // tells the user that nothing was found and returns null if there is nothing found
            System.out.println("Data not provided or inputted incorrectly");
            return null;
        }
    }

    // returns the last name of the person
    public String getNameL(){
        try{
            // get name to equal the last name
            String name = fileName.substring(fileName.indexOf(".")+1, fileName.lastIndexOf("."));
            name = name.substring(name.indexOf(".")+1, name.length());

            return name;
        }catch (StringIndexOutOfBoundsException e){
            // tells the user that nothing was found and returns null if there is nothing found
            System.out.println("Data not provided or inputted incorrectly");
            return null;
        }
    }
}
