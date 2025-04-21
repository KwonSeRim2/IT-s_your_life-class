package test.D0417;

public class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FileDownloadServlet());

    }

    public static void method(HttpServlet ch){
        ch.service();
    }

}
