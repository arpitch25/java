import java.util.ArrayList;
import java.util.List;

public class ten {
    public static void main(String[] args) throws Exception {
        List<byte[]> memory = new ArrayList<>();

        int oneGb = 1024 * 1024 * 1024;

        for (int i = 1; i <= 10; i++) {
            byte[] block = new byte[oneGb];
            memory.add(block);
            System.out.println("Allocated " + i + " GB");
            Thread.sleep(1000); // slow it down so you can observe memory usage
        }

        System.out.println("Done. Holding ~10 GB of RAM.");
        Thread.sleep(Long.MAX_VALUE); // keep program running
    }
}