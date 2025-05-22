package builder.builder1;

public class TextBuilder extends Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("=======================");
        sb.append("[");
        sb.append(title);
        sb.append("]\n]n");
    }

    @Override
    public void makeString(String str) {
        sb.append("■");
        sb.append(str);
        sb.append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {

    }

    @Override
    public void close() {

    }
}
