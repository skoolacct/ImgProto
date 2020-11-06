import java.util.*;

public class Runner {
    public static void main(String[] args) {

        // arraylists
        // the zip file that we are reading is hard coded right now but can be adjusted as needed
        // example zip files "testing.zip" and "test2.zip" are propperly named and work correctly
        // "Something.zip" does not have the propper names so you can see what happens when it does not work
        List<String> a = ReadZipFile.main("test2.zip");
        List<ImgClass> b = new ArrayList<>();

        // loop through the arraylist with the contents of the zip file and store the needed data
        for (int i =1; i<a.size(); i+=2){
            //System.out.println(a.get(i));

            // this is the string that can be passed into ImgClass -> imgSet.firstName.lastName.jpeg
            String f = a.get(i).substring(a.get(i).lastIndexOf("/") + 1);

            // make sure that we are not throwing an exception
            try {
                // debug line
                System.out.println(f);

                // create new ImgClass -> set the name -> store it in the arraylist b
                ImgClass m = new ImgClass();
                m.setFileName(f);
                b.add(m);
            }catch (StringIndexOutOfBoundsException e){
                // currently doing nothing
                //System.out.println("No value here.");
            }
        }

        // spacer line
        System.out.println();

        // demonstrating the arraylist saved information
        System.out.println("The first name of the first object is: " + b.get(0).getNameF());
        System.out.println("The last name of the first object is: " + b.get(0).getNameL());
        System.out.println("The last name of the second object is: " + b.get(1).getNameL());


        /* <- delete this and the one at the bottom to test these

        // extra examples of ImgClass (without zip file information)

        // example 1
        // runs test function I made to test differant functions in the ImgClass.java class
        // then prints the file name
        ImgClass one = new ImgClass();
        one.setFileName("celeb.Dwain.Johnson.jpg");
        //String a = one.test();
        //System.out.println(a);
        System.out.println(one.getFileName());

        //spacer line
        System.out.println();

        // example 2
        // prints first name (Andrew)
        // prints the set of images this one is from (grade8)
        // prints the file name (grade8.Andrew.Barth.jpg)
        ImgClass two = new ImgClass();
        two.setFileName("grade8.Andrew.Barth.jpg");
        System.out.println(two.getNameF());
        System.out.println(two.getSet());
        System.out.println(two.getFileName());

        //spacer line
        System.out.println();

        // example 3
        // shows what happens when an exception is thrown
        ImgClass three = new ImgClass();
        three.setFileName("this doesnt work");
        System.out.println(three.getNameF());

         */
    }
}
