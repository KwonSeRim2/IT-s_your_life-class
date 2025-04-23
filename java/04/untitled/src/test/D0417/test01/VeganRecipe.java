package test.D0417.test01;

public class VeganRecipe extends Recipe {


    public VeganRecipe() {
        this.title = "두부 샐러드";
        this.cookTime = 10;
        this.isVegan = true;
    }

    @Override
    public String getDescription() {
        return "신선한 두부 샐러드를 추천합니다!";
    }

    @Override
    public String toString() {
        String isV;
        if (isVegan == true) {
            isV = "비건";
        } else {
            isV = "비건 아님";
        }

        return (title + "(" + cookTime + ")" + "-" + isV).toString();
    }

}
