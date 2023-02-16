/* 
2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
Если уже файл создан, то перезаписываем его.
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


class Task02 {

    public static void main(String[] args)
    {
        File file = new File("test.txt");

        if (file.exists()) {
            System.out.println("Файл существует");
        }
        else{
            System.out.println("Файл не существует");
        }
        String text = "TEST".repeat(100);
 
        try (PrintWriter out = new PrintWriter(file, StandardCharsets.UTF_8))
        {
            Files.write(Paths.get("file3.txt"), "content".getBytes());
            out.print(text);
            System.out.println("Информация в файл записана");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}