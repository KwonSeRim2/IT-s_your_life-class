package test.D0417.test02;

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


}
