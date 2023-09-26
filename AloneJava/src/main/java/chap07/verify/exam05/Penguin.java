package chap07.verify.exam05;

/**
 * packageName : chap07.verify.exam05
 * fileName : Penguin
 * author : GGG
 * date : 2023-09-21
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-21         GGG          최초 생성
 */
public class Penguin {
//    속성 정의
    String name;
    String habitat;
//    setter/getter : alt + Insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

//    함수 : showInfo()
    void showInfo() {
        System.out.println(this.name + " 은 " + this.habitat + " 살아요!!!!");
    }
}
