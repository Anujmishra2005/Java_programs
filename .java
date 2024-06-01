package Even_and_odd;

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; ; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




package Even_and_odd;

class OddThread extends Thread {
    public void run() {
        for (int i = 1; ; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
package Even_and_odd;

public class Main {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}

