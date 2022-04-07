package cookie;

public class CookieTest {
    /*
    1、Cookie 饼干
    a)什么是 Cookie?
    1、Cookie 翻译过来是饼干的意思。
    2、Cookie 是服务器通知客户端保存键值对的一种技术。
    3、客户端有了 Cookie 后，每次请求都发送给服务器。
    4、每个 Cookie


    b)如何创建 Cooki

    c)服务器如何获取 Cookie
    服务器获取客户端的 Cookie 只需要一行代码：req.getCookies():Cookie[]

    d)Cookie 值的修改
    方案一：
    1、先创建一个要修改的同名（指的就是 key）的 Cookie 对象
    2、在构造器，同时赋于新的 Cookie 值。
    3、调用 response.addCookie( Cook

    方案二：
    1、先查找到需要修改的 Cookie 对象
    2、调用 setValue()方法赋于新的 Cookie 值。
    3、调用 response.addCookie()通知客户端保存

    e)浏览器查看 Cookie：

    f) Cookie 生命控
    Cookie 的生命控制指的是如何管理 Cookie 什么时候被销毁（删除）
    setMaxAge()
    正数，表示在指定的秒数后过期
    负数，表示浏览器一关，Cookie 就会被删除（默认值是-1）
    零，表示马上删除 Cookie

    g)Cookie 有效路径 Path 的设
    Cookie 的 path 属性可以有效的过滤哪些 Cookie 可以发送给服务器。哪些不发。
    path 属性是通过请求的地址来进行有效的过滤。
    CookieA path=/工程路径
    CookieB path=/工程路径/abc
    请求地址如下：
    http://ip:port/工程路径/a.html
    CookieA 发送
    CookieB 不发送
    http://ip:port/工程路径/abc/a.html
    CookieA 发送
    CookieB 发送
        * */
}
