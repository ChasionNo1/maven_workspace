package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        System.out.println(context);
//        保存之前：coontext1 获取 key1的值是：null
        System.out.println("保存之前：coontext1 获取 key1的值是：" + context.getAttribute("key1"));
        context.setAttribute("key1", "value1");
//        context1中获取域数据key1的值是：value1
        System.out.println("context1中获取域数据key1的值是：" + context.getAttribute("key1"));

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        // 重写init方法，一定要调用父类的init方法
        super.init(config);
        System.out.println("重写了init初始化方法，做了一些工作");
    }
}
