package servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletTest2 extends HttpServlet {
    /*
    1.HttpServletRequest 类
    a)HttpServletRequest 类有什么作用。
    每次只要有请求进入 Tomcat 服务器，Tomcat 服务器就会把请求过来的 HTTP 协议信息解析好封装到 Request 对象中。
    然后传递到 service 方法（doGet 和 doPost）中给我们使用。我们可以通过 HttpServletRequest 对象，获取到所有请求的
    信息。

    b)HttpServletRequest 类的常用方法
    i. getRequestURI() 获取请求的资源路径
    ii. getRequestURL() 获取请求的统一资源定位符（绝对路径）
    iii. getRemoteHost() 获取客户端的 ip 地址
    iv. getHeader() 获取请求头
    v. getParameter() 获取请求的参数
    vi. getParameterValues() 获取请求的参数（多个值的时候使用）
    vii. getMethod() 获取请求的方式 GET 或 POST
    viii. setAttribute(key, value); 设置域数据
    ix. getAttribute(key); 获取域数据
    x. getRequestDispatcher() 获取请求转发对象

    c)如何获取请求参数
    d)POST 请求的中文乱码解
    e)请求的转发
    什么是请求的转发?
    请求转发是指，服务器收到请求后，从一次资源跳转到另一个资源的操作叫请求转发。

    f) base 标签的作用
    标签设置页面相对路径工作时参照的地址
    href 属性就是参数的地
    <base href="http://localhost:8080/07_servlet/a/b/">

    g)Web 中的相对路径和绝对路
    在 javaWeb 中，路径分为相对路径和绝对路径两种：
    相对路径是：
    . 表示当前目录
    .. 表示上一级目录
    资源名 表示当前目录/资源名
    绝对路径：
    http://ip:port/工程路径/资源路径
    在实际开发中，路径都使用绝对路径，而不简单的使用相对路径。
    1、绝对路径
    2、base+相对

    h)web 中 / 斜杠的不同意义
    在 web 中 / 斜杠 是一种绝对路径。
    / 斜杠 如果被浏览器解析，得到的地址是：http://ip:port/

    2.HttpServletResponse 类
    a)HttpServletResponse 类的作用
    HttpServletResponse 类和 HttpServletRequest 类一样。每次请求进来，Tomcat 服务器都会创建一个 Response 对象传
    递给 Servlet 程序去使用。HttpServletRequest 表示请求过来的信息，HttpServletResponse 表示所有响应的信息，
    我们如果需要设置返回给客户端的信息，都可以通过 HttpServletResponse 对象来进行设

    b)两个输出流的说明。
    字节流 getOutputStream(); 常用于下载（传递二进制数据）
    字符流 getWriter(); 常用于回传字符串（常用）
    两个流同时只能使用一个。
    使用了字节流，就不能再使用字符流，反之亦然，否则就会报错。
    c)如何往客户端回传数据

    e)请求重定向
    请求重定向，是指客户端给服务器发请求，然后服务器告诉客户端说。我给你一些地址。你去新地址访问。叫请求
    重定向（因为之前的地址可能已经被废弃）。
    请求重定向的第一种方案：
    // 设置响应状态码 302 ，表示重定向，（已搬迁）
    resp.setStatus(302);
    // 设置响应头，说明 新的地址在哪里
    resp.setHeader("Location", "http://localhost:8080");
    请求重定向的第二种方案（推荐使用）：
    resp.sendRedirect("http://localhost:8080");



    * */


}
