package org.scoula.test0528;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lunch")
public class LunchServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String mood = request.getParameter("mood");

        out.println("<html><body>");

        if (mood == null) {
            // 기분 선택 화면
            out.println("<h1>오늘 기분은 어떤가요?</h1>");
            out.println("<form method='get' action='/lunch'>");
            out.println("<select name='mood'>");
            out.println("<option value='happy'>기분 최고야</option>");
            out.println("<option value='soso'>그냥 그래</option>");
            out.println("<option value='sad'>우울해</option>");
            out.println("<option value='stressed'>스트레스 쩔어</option>");
            out.println("<option value='etc'>기타</option>");
            out.println("</select>");
            out.println("<input type='submit' value='제출'>");
            out.println("</form>");
        } else {
            // 결과 화면
            String moodMessage;
            switch (mood) {
                case "happy":
                    moodMessage = "매콤한 쭈꾸미볶음 추천!";
                    break;
                case "soso":
                    moodMessage = "든든한 김치찌개 어떠세요?";
                    break;
                case "sad":
                    moodMessage = "부드러운 크림파스타로 위로받으세요.";
                    break;
                case "stressed":
                    moodMessage = "부대찌개 한 냄비 추천드려요!";
                    break;
                default:
                    moodMessage = "오늘은 도시락도 괜찮아요!";
            }

            out.println("<h1>오늘의 추천 메뉴</h1>");
            out.println("<p>" + moodMessage + "</p>");
            out.println("<a href=\"/lunch\">←다시 선택하기</a>");
        }
        out.println("</body></html>");
    }
}
