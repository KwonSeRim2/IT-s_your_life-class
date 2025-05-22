package prototype;

import prototype.framework.Product;

public class MessageBox implements Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int decloen = 1+s.length()+1;
        for (int i =0; i<decloen; i++){
            
        }

    }

    @Override
    public Product createCopy() {
        return null;
    }
}
