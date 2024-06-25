import java.util.Comparator;

// Info 객체를 비교하는 Comparator 구현 클래스
public class UserComparator implements Comparator<Info> {

    // compare 메서드는 두 Info 객체를 비교하여 정렬 순서를 결정
    @Override
    public int compare(Info o1, Info o2) {
        // 첫 번째 Info 객체의 이름을 두 번째 Info 객체의 이름과 비교
        // 이름을 사전순으로 비교하여 결과 반환
        return o1.getUsername().compareTo(o2.getUsername());
    }
}