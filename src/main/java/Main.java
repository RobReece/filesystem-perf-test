import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Main {
    public static void main(String... args) throws IOException {
        long startTime = System.currentTimeMillis();
        long filecount = Files.walk(Paths.get(args[0]))
                              .parallel()
                              .filter(Files::isRegularFile)
                              .count();
        long endTime = System.currentTimeMillis();


        System.out.printf("Found %d files in %.2f seconds.\n", filecount, (endTime-startTime)/1000.0f);
    }
}