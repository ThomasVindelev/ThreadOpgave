public class CounterThread implements Runnable {

    private int id;

    public CounterThread(int id) {
        this.id = id;
    }

    public void run() {
        if (id == 1) {
            for (int i = 0; i < 50000; i++) {
                CounterData.number++;
                System.out.println(CounterData.number);
            }
        }
        if (id == 1) {
            for (int i = 0; i < 50000; i++) {
                CounterData.number--;
                System.out.println(CounterData.number);
            }
        }
    }

}