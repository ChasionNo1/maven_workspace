package JSON;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {
    /*
    1、什么是 JSON?
    JSON (JavaScript Object Notation) 是一种轻量级的数据交换格式。易于人阅读和编写。同时也易于机器解析和生成。JSON
    采用完全独立于语言的文本格式，而且很多语言都提供了对 json 的支持（包括 C, C++, C#, Java, JavaScript, Perl, Python
    等）。 这样就使得 JSON 成为理想的数据交换格式。
    json 是一种轻量级的数据交换格式。
    轻量级指的是跟 xml 做比较。
    数据交换指的是客户端和服务器之间业务数据的传递格式。

    1.2、JSON 在 java 中的使用
    1.2.1、javaBean 和 json 的互转
    * */

//    javaBean 和 json 的互
    @Test
    public void test1(){
        Person person = new Person(1, "chasion");
        // 创建 Gson 对象实例
        Gson gson = new Gson();
        String personJsonString = gson.toJson(person);
        System.out.println(personJsonString);

        // fromJson 把 json 字符串转换回 Java 对象
        // 第一个参数是 json 字符串
        // 第二个参数是转换回去的 Java 对象类
        Person person1 = gson.fromJson(personJsonString, Person.class);
        System.out.println(person1);
    }

//    List 和 json 的互转
    @Test
    public void test2(){
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person(2, "aa"));
        personList.add(new Person(3, "bb"));

        Gson gson = new Gson();
        // 把 List 转换为 json 字符串
        String personListJsonString = gson.toJson(personList);
        System.out.println(personListJsonString);
        List<Person> list = gson.fromJson(personListJsonString, new PersonListType().getType());
        System.out.println(list);
    }

    // map 和 json 的互转
    @Test
    public void test3(){
        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, new Person(1, "aa"));
        map.put(2, new Person(2, "bb"));
        Gson gson = new Gson();
        String personMapJsonString = gson.toJson(map);
        System.out.println(personMapJsonString);
//        Map<Integer, Person> map1 = gson.fromJson(personMapJsonString, new PersonMapType().getType());
        Map<Integer, Person> map1 = gson.fromJson(personMapJsonString, new TypeToken<HashMap<Integer, Person>>() {
        }.getType());
        System.out.println(map1);
    }
}
