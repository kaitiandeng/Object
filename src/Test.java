/**
 * Created by Administrator on 2016/10/17.
 */
public class Test {
    public static void main(String[] args) {
        Human p  =  new Human ("邓凯天",18,"boy");
        Human xueZhang1 = new Human ("曾名扬",18,"boy");
        Human xueZhang2= new Human ("曹越",18,"boy");
        Human xueZhang3 = new Human("郑昱旋",18,"boy");//a.setName(fucker);
        Human xueZhang4 = new Human ("徐书展",18,"boy");
        Human xueZhang5 = new Human ("凌霄",18,"boy");
        Human wuSui    = new Human("吴随",18,"girl");
        p.introduce();
        xueZhang1.introduce1();
        xueZhang2.introduce1();
        xueZhang3.introduce1();
        xueZhang4.introduce1();
        xueZhang5.introduce1();
        wuSui.introduce1();
    }
}
