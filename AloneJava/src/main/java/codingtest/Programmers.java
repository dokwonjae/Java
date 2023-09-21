package codingtest;

import java.util.Scanner;

/**
 * packageName : codingtest
 * fileName : Programmers
 * author : GGG
 * date : 2023-09-19
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-19         GGG          최초 생성
 */
public class Programmers {
    // 대소문자 변환
    public void exam04() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        int tmp;

        for (int i = 0; i < a.length(); i++) {
            tmp = (int) a.charAt(i);
            if (65 <= tmp && 90 >= tmp) {
                b += (char) (tmp + 32);
            } else if (97 <= tmp && tmp <= 122) {
                b += (char) (tmp - 32);
            } else {
                b += (char) (tmp);
            }
        }
        System.out.println(b);
    }

    // 특수문자
    public void exam05() {
        System.out.print("!@#$%^&*(\\\'\"<>?:;");
    }

    public void exam06() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void exam07() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String[] c = a.split(" ");
        String[] d = b.split(" ");
        System.out.print(c[0]);
        System.out.print(d[0]);
    }

    public  void exam08() {
        int a = 91;
        int b = 9;
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);
        if(Integer.valueOf(ab) > Integer.valueOf(ba)){
            System.out.print(Integer.valueOf(ab));
        } else {
            System.out.print(Integer.valueOf(ba));
        }
    }
}
