package test.D0423.test2;

import java.util.Objects;

public class MaleCelebrity implements Celebrity{
    private String name;

    public MaleCelebrity(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MaleCelebrity that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "남자 연예인: "+name;
    }

    @Override
    public String getName() {
        return name;
    }
}
