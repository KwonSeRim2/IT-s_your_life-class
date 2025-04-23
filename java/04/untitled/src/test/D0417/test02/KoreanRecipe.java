package test.D0417.test02;

public class KoreanRecipe extends Recipe {

    public KoreanRecipe() {
        this.title = "김치째개";
        this.cookTime = 20;
        this.isVegan = false;
    }


    @Override
    public String getDescription() {

        return "매콤한 김치찌개를 추천합니다!";
    }



}
