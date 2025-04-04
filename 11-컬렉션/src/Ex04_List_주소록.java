import java.util.ArrayList;
import java.util.List;

public class Ex04_List_주소록 {
    public static void main(String[] args) {
        List< Member> list = new ArrayList<Member>();
        List.add(new Member("철수", "010-1234-2345"));
        List.add(new Member("수현", "010-2345-3456"));
        List.add(new Member("석훈", "010-3456- 4567"));
        List.add(new Member("민영", "010-4567-5678"));
        List.add(new Member ("호영", "010-5678-6789"));


        for (int i = 0; i<list.size(); i++) {
            Member item = List.get(i);
            System.out.println(item.toString());
        }
    }
}
