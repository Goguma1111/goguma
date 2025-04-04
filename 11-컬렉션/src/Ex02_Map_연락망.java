import java.util.HashMap;
import java.util.Map;

public class Ex02_Map_연락망 {
    public static void main(String[] args) {
        Map<String, Member> map = new HashMap<String, Member>(); 


        // 객체생성후 map에 추가하기
        Member mem1 = new Member("010-1234-2345", "member1@naver.com");
        map.put("철수", mem1);

        // 참조변수 없이 map에 직접추가

        map.put("수현", new Member("010-2345-3456", "member2@kakao.com"));
        map.put("석훈", new Member("010-3456- 4567", "member3@gmail.com"));
        map.put("민영", new Member("010-4567-5678", "member4@hanmail.com"));
        map.put("호영", new Member("010-5678-6789", "member5@icloud.com"));

        // 저장한 객체중 하나를 추출하여 내용 확인
        Member output = map.get("호영");
        System.out.println(output.toString());
    }
}
