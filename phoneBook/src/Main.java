import javax.lang.model.type.ArrayType;
import java.io.*;
import java.util.*;

// FileText 클래스는 파일을 읽고 쓰는 기능을 제공하는 클래스
public class Main {

    private static ArrayList<Info> infoBook = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            while(true) {
                System.out.println("1. 저장하기");
                System.out.println("2. 목록 출력하기");
                System.out.println("3. 이름으로 검색하기");
                System.out.println("4. 프로그램 종료하기");
                System.out.println("5. 목록 내보내기\n");
                System.out.print("번호 입력 : ");
                int n = scan.nextInt();

                if (n == 1) {
                    System.out.print("이름 입력 : ");
                    String num = scan.next();
                    System.out.print("전화번호 입력 : ");
                    String phone = scan.next();
                    System.out.println();
                    infoBook.add(new Info(num, phone));
                }

                else if (n == 2) {
                    System.out.println("현재 등록된 데이터 개수 : " + infoBook.size() + "개");
                    infoBook.sort(new UserComparator());
                    for (Info info : infoBook) {
                        System.out.println("[ " + info.getUsername() + " - " + info.getPhone() + " ]");
                    }
                    System.out.println();
                }

                else if (n == 3) {
                    System.out.print("검색할 이름 : ");
                    String name = scan.next();
                    ArrayList<String> array = new ArrayList<>();
                    for (Info info : infoBook) {
                        if (info.getUsername().contains(name)) {
                            array.add("[ " + info.getUsername() + " - " + info.getPhone() + " ]");
                        }
                    }
                    System.out.println("검색 결과 개수 : " + array.size());
                    for (String str : array) {
                        System.out.println(str);
                    }
                    System.out.println();
                }

                else if (n == 4) {
                    System.out.println("프로그램을 종료합니다...");
                    break;
                }

                else if (n == 5) {
                    ArrayList<String> array = new ArrayList<>();
                    for (Info info : infoBook) {
                        array.add("[ " + info.getUsername() + " - " + info.getPhone() + " ]\n");
                    }
                    FileText.write(array);
                }
            }
        }
        catch (Exception e) {
            System.out.println("에러 발생");
            System.exit(1);
        }

    }
}
