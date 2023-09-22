package org.example;

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;
    void 공격 () {
        a무기.무기이름 = 이름;
        a무기.작동();
    }

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }
}

abstract class 무기 {
    String 무기이름;
    void 작동 () {

    }
}

class 칼 extends 무기 {

    void 작동 () {
        System.out.println ("카니가 " + 무기이름 + "로 공격합니다.");
    }
}

class 활 extends 무기 {

    void 작동 () {
        System.out.println("카니가 " + 무기이름 + "로 공격합니다.");
    }
}
