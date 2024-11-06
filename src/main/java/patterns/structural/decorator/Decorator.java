package patterns.structural.decorator;

import java.io.*;

public class Decorator {
    /*
    used for when you wanr to wrap another object to add functionality to it
    can add behavior without affecting other objects
    its more then just inheritance
    single responsobility principle - every class should have resposibility over a single part
    of the functionality provided by the software

    inheritance based
    utilizes composition and inheritance(Is-A, Has-A)
    alternative to a subclass
    constructors requires an instance from hierarchy
   pitfalls are we need a new class for every feture added
   many little objects
   often confused with simple inheritance

    Examples:
    java.io.InputStream
    java.util.Collections#checkList
     */
    public static void main(String[] args) throws Exception {
        File file = new File("./output.txt");
        boolean wasCreated = file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        dataOutputStream.writeChars("text");

        dataOutputStream.close();
        outputStream.close();
    }
}
