package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1、获取 web.xml 中配置的上下文参数 context-param
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        System.out.println("context-param 参数 username 的值是:" + username);
        System.out.println("context-param 参数 password 的值是" + context.getInitParameter("password"));
        // 2、获取当前的工程路径，格式: /工程路
        // 当前工程路径:/MavenWeb_war
        System.out.println( "当前工程路径:" + context.getContextPath());
        // 3、获取工程部署后在服务器硬盘上的绝对路径
        // 工程部署的路径是:D:\Program Files\apache-tomcat-8.5.78\webapps\MavenWeb_war\
        System.out.println("工程部署的路径是:" + context.getRealPath("/"));
        // 工程下 css 目录的绝对路径是:D:\Program Files\apache-tomcat-8.5.78\webapps\MavenWeb_war\css
        System.out.println("工程下 css 目录的绝对路径是:" + context.getRealPath("/css"));
        // 工程下 imgs 目录 1.jpg 的绝对路径是:D:\Program Files\apache-tomcat-8.5.78\webapps\MavenWeb_war\imgs\1.jpg
        System.out.println("工程下 imgs 目录 1.jpg 的绝对路径是:" + context.getRealPath("/imgs/1.jpg"));
        System.out.println("HelloServlet2的doGet方法");

        System.out.println(context);
//        Context2 中获取域数据 key1 的值是:value1
        System.out.println("Context2 中获取域数据 key1 的值是:"+ context.getAttribute("key1"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
