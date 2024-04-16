package Ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class example01 {
    public static void runExample01() throws Exception {
        // Using .Builder for building the Person
        Person.Builder personBuilder = Person.newBuilder();
        personBuilder.setName("Geralt Rivea");
        personBuilder.setAge(31);

        // We can immediately .build() after everything is done and use getters
        Person personBuilt  = personBuilder.build();
        System.out.println(personBuilt.getName() + " <- gotten name from a person");

        // Writing the personBuilt to a .bin file.
        FileOutputStream output = new FileOutputStream("geralt.bin");
        personBuilt.writeTo(output);
        output.close();

        // Reading from a .bin file
        Person personRead = Person.parseFrom(new FileInputStream("geralt.bin"));
        System.out.println(personRead.getName() + " <- gotten name from a person loaded from a .bin");
    }
}
