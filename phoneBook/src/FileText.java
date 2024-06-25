import java.io.*;

// FileText 클래스는 파일을 읽고 쓰는 기능을 제공하는 클래스
public class FileText {

    // read 메서드는 지정된 경로와 파일 이름을 사용하여 파일을 읽고, 그 내용을 문자열로 반환
    public String read(String path, String fileName) {
        File file = new File(path, fileName);  // 파일 객체 생성
        BufferedReader br;  // BufferedReader 객체 선언
        String retStr = "";  // 반환할 문자열 초기화

        try {
            br = new BufferedReader(new FileReader(file));  // BufferedReader 객체 생성
            String line;
            // 파일의 각 라인을 읽어와서 retStr에 추가
            while ((line = br.readLine()) != null) {
                System.out.println("line: " + line);
                retStr += line + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();  // 파일을 찾지 못한 경우 예외 처리
        } catch (IOException e) {
            e.printStackTrace();  // 입출력 예외 처리
        }

        return retStr;  // 파일의 내용을 문자열로 반환
    }

    // write 메서드는 지정된 경로와 파일 이름을 사용하여 파일에 내용을 씀
    public void write(String path, String fileName, String content, String username, String phone) {
        File file = new File(path, fileName);  // 파일 객체 생성

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));  // BufferedWriter 객체 생성
            writer.write(content);  // 파일에 내용 쓰기
            writer.close();  // BufferedWriter 닫기
        } catch (IOException e) {
            e.printStackTrace();  // 입출력 예외 처리
        }
    }
}