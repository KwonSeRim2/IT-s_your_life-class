package ch12.sec03.exam01;

import java.util.Objects;

public class Member {
    public String id;
    public String naem;
    public int age;

    public Member(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Member member)) return false;
        return age == member.age && Objects.equals(id, member.id) && Objects.equals(naem, member.naem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, naem, age);
    }
}
