import java.io.FileWriter;

class Main{

    public static void main(String args[]) {

        String data = "{\"id\":\"1\",\"name\":\"some_name\",\"age\":\"24\",\"course\":\"BTech.\"}";

        try {
            // Creates a FileWriter
            FileWriter output = new FileWriter("/home/knoldus/Downloads/output.txt",  true);

            // Writes the string to the file
            output.write(data);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}