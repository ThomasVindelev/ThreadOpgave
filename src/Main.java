public class Main {

    public static void main(String[] args) {

        /*Thread additionThread = new Thread(new CounterThread(1));
        Thread subtractionThread = new Thread(new CounterThread(2));

        additionThread.run();
        subtractionThread.run();*/

        for (int i = 1; i < 3; i++) {
            Thread object = new Thread(new CounterThread(i));
            object.start();
        }

    }
}
