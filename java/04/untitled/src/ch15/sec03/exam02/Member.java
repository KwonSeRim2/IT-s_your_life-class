package ch15.sec03.exam02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Member {
    public String name;
    public int age;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Member member)) return false;
        return age == member.age && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
