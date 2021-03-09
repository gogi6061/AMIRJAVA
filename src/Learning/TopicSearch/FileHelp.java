package Learning.TopicSearch;

public class FileHelp {
    public static void main(String[] args) {
        Help help1 = new Help("C:\\Users\\steam\\IdeaProjects\\DZ(9.10.20)\\src\\Learning\\helpfile.txt");
        String topic;

        System.out.println("ВОспользуйтесь справочной системой. \n" +
                "Для выхода из системы введите 'stop'.");

        do {
            topic = help1.getSelection();

            if (!help1.helpon(topic))
                System.out.println("Тема не найдена \n");
        } while (topic.compareTo("stop") != 0);
    }

}

