package jsp;

public class JSPTest {
    /*
    1.什么是 jsp，它有什么用
    jsp 的全称是 java server pages。Java 的服务器页面。
    jsp 的主要作用是代替 Servlet 程序回传 html 页面的数据。
    因为 Servlet 程序回传 html 页面数据是一件非常繁锁的事情。开发成本和维护成本都极高。

    jsp 的小结：
    1、如何创建 jsp 的页面?
    2、jsp 如何访问：
    jsp 页面和 html 页面一样，都是存放在 web 目录下。访问也跟访问 html 页面一样。
    比如：
    在 web 目录下有如下的文件：
    web 目录
    a.html 页面 访问地址是 =======>>>>>> http://ip:port/工程路径/a.html
    b.jsp 页面 访问地址是 =======>>>>>> http://ip:port/工程路径/b.jsp

    2.jsp 的本质是什么。
    jsp 页面本质上是一个 Servlet 程序。
    当我们第一次访问 jsp 页面的时候。Tomcat 服务器会帮我们把 jsp 页面翻译成为一个 java 源文件。并且对它进行编译成
    为.class 字节码程序。我们打开 java 源文件不难发现其里面的内容是
    我们跟踪原代码发现，HttpJspBase 类。它直接地继承了 HttpServlet 类。也就是说。jsp 翻译出来的 java 类，它间接了继
    承了 HttpServlet 类。也就是说，翻译出来的是一个 Servlet 程序

    总结：通过翻译的 java 源代码我们就可以得到结果：jsp 就是 Servlet 程序。
    大家也可以去观察翻译出来的 Servlet 程序的源代码，不难发现。其底层实现，也是通过输出流。把 html 页面数据回传给客户端。

    3.jsp 的三种语法
    a)jsp 头部的 page 指令
    jsp 的 page 指令可以修改 jsp 页面中一些重要的属性，或者行为。
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    i. language 属性 表示 jsp 翻译后是什么语言文件。暂时只支持 java。
    ii. contentType 属性 表示 jsp 返回的数据类型是什么。也是源码中 response.setContentType()参数值
    iii. pageEncoding 属性 表示当前 jsp 页面文件本身的字符集。
    iv. import 属性 跟 java 源代码中一样。用于导包，导类。
    ========================两个属性是给 out 输出流使用=============================
    v. autoFlush 属性 设置当 out 输出流缓冲区满了之后，是否自动刷新冲级区。默认值是 true。
    vi. buffer 属性 设置 out 缓冲区的大小。默认是 8kb
    vii. errorPage 属性 设置当 jsp 页面运行时出错，自动跳转去的错误页面路径。
    viii. isErrorPage 属性 设置当前 jsp 页面是否是错误信息页面。默认是 false。如果是 true 可以获取异常信息。
    ix. session 属性 设置访问当前 jsp 页面，是否会创建 HttpSession 对象。默认是 true。
    x. extends 属性 设置 jsp 翻译出来的 java 类默认继承谁




    * */

}
