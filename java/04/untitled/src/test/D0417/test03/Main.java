package test.D0417.test03;

public class Main {
    public static void main(String[] args) {
        Recipe[] recipes = {
                new KoreanRecipe(),
                new VeganRecipe(),
                new FusionRecipe()
        };

        for (int i = 0; i < recipes.length; i++) {
            System.out.println(recipes[i].getDescription());
            if (recipes[i] instanceof KoreanRecipe) {
                KoreanRecipe ch = (KoreanRecipe) recipes[i];
                System.out.println("-> " +ch.getSpicinessLevel());
            }
            System.out.println();
        }
    }
}
