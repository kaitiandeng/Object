import com.sun.org.apache.xerces.internal.parsers.CachingParserPool;
import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

/**
 * Created by Administrator on 2016/10/16.
 */
public class Human {
    Human(String n,int a, String s){
        name = n;
        age = a;
        sex = s;
    }
        String name;
        int age;
        private String sex ;
    private void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    private void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void introduce(){
        System.out.println("我的名字是"+name+"是个"+age+"岁的"+sex);
    }
    void introduce1(){
        System.out.println("学长"+name+"是个"+age+"岁的"+sex);
    }
    }
