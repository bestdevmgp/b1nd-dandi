import java.io.*;
import java.util.ArrayList;

public class FileText {
    public static void write(ArrayList<String> content) throws IOException {
        File file = new File(System.getProperty("user.dir") + "/phoneBook/src/phoneBook.txt");  // 파일 객체 생성

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));  // BufferedWriter 객체 생성
            for (String line : content) {
                writer.write(line);  // 파일에 내용 쓰기
            }
            writer.close();  // BufferedWriter 닫기
            System.out.println("전화번호 목록을 내보냅니다...\n");
        } catch (IOException e) {
            throw e;
        }
    }
}