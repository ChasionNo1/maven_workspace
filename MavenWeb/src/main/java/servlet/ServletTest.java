package servlet;

public class ServletTest {

    /*
    a)什么是 Servlet
    1、Servlet 是 JavaEE 规范之一。规范就是接口
    2、Servlet 就 JavaWeb 三大组件之一。三大组件分别是：Servlet 程序、Filter 过滤器、Listener 监听器。
    3、Servlet 是运行在服务器上的一个 java 小程序，它可以接收客户端发送过来的请求，并响应数据给客户端。

    b)手动实现 Servlet 程序
    1、编写一个类去实现 Servlet 接口
    2、实现 service 方法，处理请求，并响应数据
    3、到 web.xml 中去配置 servlet 程序的访问地

    c)url 地址到 Servlet 程序的访问
    客户端（浏览器）
    http://localhost:8080/工程路径/资源路径

    通过ip地址定位服务器，通过端口号定位tomcat

    服务端（ip唯一）
    有多个工程文件
    有实现类 public class HelloServlet implements Servlet
    public void service方法执行资源访问功能

    d)Servlet 的生命周期
    1、执行 Servlet 构造器方法
    2、执行 init 初始化方法
    第一、二步，是在第一次访问，的时候创建 Servlet 程序会调用。
    3、执行 service 方法
    第三步，每次访问都会调用。
    4、执行 destroy 销毁方法
    第四步，在 web 工程停止的时候调用

    e)GET 和 POST 请求的分发处理

    f) 通过继承 HttpServlet 实现 Servlet 程序
    一般在实际项目开发中，都是使用继承 HttpServlet 类的方式去实现 Servlet 程序。
    1、编写一个类去继承 HttpServlet 类
    2、根据业务需要重写 doGet 或 doPost 方法
    3、到 web.xml 中的配置 Servlet 程序的

    g)使用 IDEA 创建 Servlet 程

    h)Servlet 类的继承体


    2.ServletConfig
    ServletConfig 类从类名上来看，就知道是 Servlet 程序的配置信息类。
    Servlet 程序和 ServletConfig 对象都是由 Tomcat 负责创建，我们负责使用。
    Servlet 程序默认是第一次访问的时候创建，ServletConfig 是每个 Servlet 程序创建时，就创建一个对应的 ServletConfig 对象。

    a)ServletConfig 类的三大作用
    1、可以获取 Servlet 程序的别名 servlet-name 的值
    2、获取初始化参数 init-param
    3、获取 ServletContext 对


    3.ServletContext 类
    a)什么是 ServletContext?
    1、ServletContext 是一个接口，它表示 Servlet 上下文对象
    2、一个 web 工程，只有一个 ServletContext 对象实例。
    3、ServletContext 对象是一个域对象。
    4、ServletContext 是在 web 工程部署启动的时候创建。在 web 工程停止

    什么是域对象?
    域对象，是可以像 Map 一样存取数据的对象，叫域对象。
    这里的域指的是存取数据的操作范围，整个 web 工程

    b)ServletContext 类的四个作用
    1、获取 web.xml 中配置的上下文参数 context-param
    2、获取当前的工程路径，格式: /工程路径
    3、获取工程部署后在服务器硬盘上的绝对路径
    4、像 Map







    * */
}
