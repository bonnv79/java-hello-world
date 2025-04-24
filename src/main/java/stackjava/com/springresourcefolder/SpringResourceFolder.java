package stackjava.com.springresourcefolder;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SpringResourceFolder {
    public static void main(String[] args) throws IOException {
        readFileUsingClassLoader();
        System.out.println("-------------------------------------");
        readFileUsingResourceUtils();
    }

    public static void readFileUsingClassLoader() throws IOException {
        System.out.println("Read file from resource folder via ClassLoader");
        String fileName = "files/demo.txt";
        // ClassLoader classLoader = new ReadFile().getClass().getClassLoader();
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        // Read File Content
        String content = new String(Files.readAllBytes(file.toPath()));
        System.out.println(content);
    }

    public static void readFileUsingResourceUtils() throws IOException {
        System.out.println("Read file from resource folder using Spring ResourceUtils");
        File file = ResourceUtils.getFile("classpath:files/demo-1.txt");
        // Read File Content
        String content = new String(Files.readAllBytes(file.toPath()));
        System.out.println(content);
    }
}
