package TheadsHomeWork;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class ThreadWriterTask {
    public static void main(String[] args) throws InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("output.txt");
        Random random = new Random();
        Thread writer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {


                        mapper.writeValue(file, new Person("abba", randCountry(), random.nextInt(100)));
                        System.out.println("file was writen");

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        Thread reader = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {

                    synchronized (random) {
                        System.out.println(mapper.readValue(file, Person.class));
                        System.out.println("file was read");



                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        });
        writer.start();
        writer.join();
        reader.start();
        reader.join();


    }

    public static Countries randCountry() {
        List<Countries> list = List.of(Countries.values());
        return list.get(new Random().nextInt(list.size()));
    }
}
