package test.D0417.test03;

class KoreanRecipe extends Recipe {
    @Override
    public String getDescription() {
        return "매콤한 김치찌개를 추천합니다!";
    }

    public String getSpicinessLevel() {
        return "맵기: ★★★☆☆";
    }
}
