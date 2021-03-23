import java.io.*;

public class Calendar {
    private static final String FILENAME = "eventFile.ser";

    public static void main(String[] args) {
        // write to file
        Event party1 = new Event("Fun Party", "2021-03-15 11:00", "New Orleans", "This is a fun party");
        Event party2 = new Event("Fun Party", "2021-03-15 11:00", "New Orleans", "This is a fun party");
        Event party3 = new Event("Fun Party", "2021-03-15 11:00", "New Orleans", "This is a fun party");

        Event[] events = new Event[] {party1, party2, party3};
        ObjectOutputStream output = null;

        try {
            output = new ObjectOutputStream(new FileOutputStream(FILENAME));
            output.writeObject(events);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read from file
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream("eventFile.ser"));
            while (true) {
                Event[] event = (Event[]) input.readObject();
                for (Event e : event)
                    System.out.println(event);
            }
        } catch (IOException e) {
            try {
                input.close();
            } catch(IOException e1) {
                e1.printStackTrace();
            }
            if (e instanceof EOFException) {
                System.out.println("End of file reached");
            }
            else {
                e.printStackTrace();
            }
        } catch (
                ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}