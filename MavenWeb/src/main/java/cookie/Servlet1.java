package cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
        //1 创建 Cookie 对象
        Cookie cookie = new Cookie("key1", "value1");
        //2 通知客户端保存 Cookie
        resp.addCookie(cookie);
        //1 创建 Cookie 对
        Cookie cookie1 = new Cookie("key5", "value5");
        //2 通知客户端保存 Cookie
        resp.addCookie(cookie1);
        resp.getWriter().write("Cookie 创建成功");
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
// getName 方法返回 Cookie 的 key（名）
// getValue 方法返回 Cookie 的 value 值
            resp.getWriter().write("Cookie[" + cookie.getName() + "=" + cookie.getValue() + "] <br/>");
        }
        Cookie iWantCookie = CookieUtils.findCookie("key1", cookies);
// for (Cookie cookie : cookies) {
// if ("key2".equals(cookie.getName())) {
// iWantCookie = cookie;
// break;
// }
// }
// 如果不等于 null，说明赋过值，也就是找到了需要的 Cookie
        if (iWantCookie != null) {
            resp.getWriter().write("找到了需要的 Cookie");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("wzg168".equals(username) && "123456".equals(password)) {
            //登录 成功
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(60 * 60 * 24 * 7);//当前 Cookie 一周内有效
            resp.addCookie(cookie);
            System.out.println("登录 成功");
        } else {
        // 登录 失败
            System.out.println("登录 失败");
        }
    }
}
