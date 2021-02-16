package Learning.Queue;

public class GenQDemo {
    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstration");
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("addIssuedBooks " +i);
                q.put(i);

            }
        }catch (QueueFullException exc){
            System.out.println(exc);

        }
        System.out.println();

        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("get");
                iVal = q.get();
                System.out.println(iVal);

            }
        }catch (QueueEmptyException exc){
            System.out.println(exc);
        }

        System.out.println();

        Double dStore[] = new Double[10];

        GenQueue<Double> q2 = new GenQueue<Double>(dStore);

        Double dVal;

        System.out.println("Demonstration");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Add" + (double) i/2);
                q2.put((double) (i/2));


            }

        }catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("Поулчение из ку");
                iVal = q.get();
                System.out.println(iVal);
            }
        }catch (QueueEmptyException exc){
            System.out.println(exc);
        }

        System.out.println();
    }
}
