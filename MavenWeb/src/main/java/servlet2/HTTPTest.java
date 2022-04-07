package servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HTTPTest extends HttpServlet {
    /*
    4.HTTP 协议
    a)什么是 HTTP 协议
    什么是协议?
    协议是指双方，或多方，相互约定好，大家都需要遵守的规则，叫协议。
    所谓 HTTP 协议，就是指，客户端和服务器之间通信时，发送的数据，需要遵守的规则，叫 HTTP 协议。
    HTTP 协议中的数据又叫报文。
    b)请求的 HTTP 协议格式
    客户端给服务器发送数据叫请求。
    服务器给客户端回传数据叫响应。
    请求又分为 GET 请求，和 POST 请求两种

    i. GET 请求
    1、请求行
    (1) 请求的方式 GET
    (2) 请求的资源路径[+?+请求参数]
    (3) 请求的协议的版本号 HTTP/1.1
    2、请求头
    key : value 组成 不同的键值对，表示不同的含义

    ii. POST 请求
    1、请求行
    (1) 请求的方式 POST
    (2) 请求的资源路径[+?+请求参数]
    (3) 请求的协议的版本号 HTTP/1.1
    2、请求头
    1) key : value 不同的请求头，有不同的含义
    空行
    3、请求体 ===>>> 就是发送给服务器的数据

    iii. 常用请求头的说明
    Accept: 表示客户端可以接收的数据类型
    Accpet-Languege: 表示客户端可以接收的语言类型
    User-Agent: 表示客户端浏览器的信息
    Host： 表示请求时的服务器 ip 和端口号

    iv. 哪些是 GET 请求，哪些是 POST 请求
    GET 请求有哪些：
    1、form 标签 method=get
    2、a 标签
    3、link 标签引入 css
    4、Script 标签引入 js 文件
    5、img 标签引入图片
    6、iframe 引入 html 页面
    7、在浏览器地址栏中输入地址后敲回车
    POST 请求有哪些：
    8、form 标签 method=pos

    c)响应的 HTTP 协议格式
    1、响应行
    (1) 响应的协议和版本号
    (2) 响应状态码
    (3) 响应状态描述符
    2、响应头
    (1) key : value 不同的响应头，有其不同含义
    空行
    3、响应体 ---->>> 就是回传给客户端的数据

    d)常用的响应码说明
    200 表示请求成功
    302 表示请求重定向（明天讲）
    404 表示请求服务器已经收到了，但是你要的数据不存在（请求地址错误）
    500 表示服务器已经收到请求，但是服务器内部错误（代码错误）

    e)MIME 类型说明
    MIME 是 HTTP 协议中数据类型。
    MIME 的英文全称是"Multipurpose Internet Mail Extensions" 多功能 Internet 邮件扩充服务。MIME 类型的格式是“大类型/小
    类型”，并与某一种文件的扩展名相对应。
    常见的 MIME 类型：
    文件 MIME 类型
    超文本标记语言文本 .html , .htm text/html
    普通文本 .txt text/plain
    RTF 文本 .rtf application/rtf
    GIF 图形 .gif image/gif
    JPEG 图形 .jpeg,.jpg image/jpeg
    au 声音文件 .au audio/basic
    MIDI 音乐文件 mid,.midi audio/midi,audio/x-midi
    RealAudio 音乐文件 .ra, .ram audio/x-pn-realaudio
    MPEG 文件 .mpg,.mpeg video/mpeg
    AVI 文件 .avi video/x-msvideo
    GZIP 文件 .gz application/x-gzip
    TAR 文件 .tar application/x-tar


    * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("URI =>" + req.getRequestURI());
        System.out.println("URL =>" + req.getRequestURL());
        System.out.println("客户端ip地址 =》" + req.getRemoteHost());
        System.out.println("请求头User-Agent" + req.getHeader("User-Agent"));
        System.out.println("请求的方式 =>"  + req.getMethod());



    }
}
