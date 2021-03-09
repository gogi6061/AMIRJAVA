package Learning.Queue;

public class QueueFullException extends Exception{
    int size;
    QueueFullException(int s){ size = s;}

    public String toString(){
        return "\n Очередь заполнениа";
    }
}
