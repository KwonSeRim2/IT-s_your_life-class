package ch06.sec07.exam03;

public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;

    public Korean() {
    }//alt + ins => 생성자 새성 가능

    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
