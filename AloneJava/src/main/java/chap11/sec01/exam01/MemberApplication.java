package chap11.sec01.exam01;

/**
 * packageName : chap11.sec01.exam01
 * fileName : MemberApplication
 * author : GGG
 * date : 2023-09-25
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
//      Member 객체 2명 생성
        Member member = new Member("blue");
        Member member2 = new Member("blue");

//        객체 2명 비교
        if(member.equals(member2)) {
            System.out.println("같습니다.");
        } else {
            System.out.println("다릅니다.");
        }
    }
}
