import java.util.Comparator;

// Info 클래스는 사용자 이름과 전화번호를 저장하는 클래스
public class Info {
    private String username;  // 사용자 이름
    private String phone;     // 전화번호

    // 생성자: 사용자 이름과 전화번호를 초기화
    public Info(String username, String phone) {
        this.username = username;
        this.phone = phone;
    }

    // getUsername: 사용자 이름을 반환
    public String getUsername() {
        return username;
    }

    // setUsername: 사용자 이름을 설정
    public void setUsername(String username) {
        this.username = username;
    }

    // getPhone: 전화번호를 반환
    public String getPhone() {
        return phone;
    }

    // setPhone: 전화번호를 설정
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // equals: 주어진 문자열이 사용자 이름에 포함되어 있는지 확인
    public boolean equals(String data) {
        if (username.contains(data)) {
            return true;
        }
        return false;
    }
}