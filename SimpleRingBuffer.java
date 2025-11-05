import java.util.Random;

public class SimpleRingBuffer {
    public static void main(String[] args) {
        String[] ringBuffer = new String[5];
        Random random = new Random();
        int count = 0;

        String[] quotes = {
            "I can go on like this forever!",
            "Still rolling…",
            "Infinite loop? No problem!",
            "Java threads = immortal",
            "Ctrl+C is the only boss"
        };

        for (int i = 0; i < ringBuffer.length; i++) {
            try {
                Thread.sleep(500);                 // ← might throw!
            } catch (InterruptedException e) {
                System.out.println("\nInterrupted! Stopping early.");
                Thread.currentThread().interrupt(); // ← RESTORE the flag!
                return;                             // ← exit main cleanly
            }

            char c = (char)(33 + random.nextInt(94));
            ringBuffer[i] = String.valueOf(c);
            System.out.print(" [" + c + "] ");

            if (i == ringBuffer.length - 1) {
                System.out.println();                    // new line
                count++;
                i = -1;                                  // reset for next lap

                if (count % 2 == 0) {                    // ← every TWO full rings
                    String msg = quotes[random.nextInt(quotes.length)];
                    System.out.println(msg);
                }
            }
        }

        System.out.println("\nBuffer full!");
    }
}