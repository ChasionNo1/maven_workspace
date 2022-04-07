package servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2 init 初始化方法");
        // 1、可以获取 Servlet 程序的别名 servlet-name 的值
        System.out.println("hello servlet程序的别名是" + servletConfig.getServletName());
//        2、获取初始化参数 init-param
        System.out.println("初始化username的值是" + servletConfig.getInitParameter("username"));
        System.out.println("初始化url的值是" + servletConfig.getInitParameter("url"));
//        3、获取 ServletContext 对象
        System.out.println(servletConfig.getServletContext());
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3 service == hello servlet 被访问了");
        // 类型转换（因为它有 getMethod()方法）
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        // 获取请求的方式
        String method = httpServletRequest.getMethod();

        if ("GET".equals(method)){
            doGet();
        }else if ("POST".equals(method)){
            doPost();
        }

    }

    private void doGet() {
        System.out.println("get请求");
        System.out.println("get请求");

    }

    private void doPost() {
        System.out.println("post请求");
        System.out.println("post请求");

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
