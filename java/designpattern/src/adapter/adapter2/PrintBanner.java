package adapter.adapter2;

public class PrintBanner extends Print{
    private Banner banner;

    public PrintBanner(String string){//상속을 통한 adapter와 형태를 같게 하기 위해
        this.banner = new Banner(string);
    }

    public PrintBanner(Banner banner){//일반적으로 이렇게 사용함
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAstar();
    }
}
