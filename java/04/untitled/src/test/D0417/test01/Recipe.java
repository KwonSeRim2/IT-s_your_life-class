package test.D0417.test01;

public abstract class Recipe {
    protected String title; //(레시피 제목, protected)
    protected int cookTime; //(조리 시간, protected)
    protected boolean isVegan; //(비건 여부, protected)


    public abstract String getDescription();

    public abstract String toString();
}

