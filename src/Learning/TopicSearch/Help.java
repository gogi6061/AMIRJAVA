package Learning.TopicSearch;

import java.io.*;
import java.nio.Buffer;

public class Help {
    String helpfile;

    Help(String fname) {
        helpfile = fname;
    }

    boolean helpon(String what) {
        int ch;
        String topic, info;
        try (BufferedReader reader = new BufferedReader(new FileReader(helpfile))) {
            do {
                ch = reader.read();

                if (ch == '#') {
                    topic = reader.readLine();
                    if (what.compareTo(topic) == 0) {
                        do {
                            info = reader.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);

        } catch (IOException exc) {
            System.out.println("error");
            return false;
        }
        return false;
    }

    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Укажите тему:");
        try {
            topic = br.readLine();
        } catch (IOException exc) {
            System.out.println("error IO");
        }
        return topic;


    }


}
