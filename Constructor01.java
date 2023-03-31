public class Constructor01 {
    public static void main(String[] args) {
//在创建人类时，就直接指定这个对象的年龄和姓名
        Prson p1 = new Prson("smith" , 80);
        System.out.println("P1的信息如下");
        System.out.println("P1对象name=" + p1.name);//smith
        System.out.println("P1对象age=" + p1.age);//80
    }
}
class Prson {
    String name;
    int age;

//构造器

    public Prson(String pNme, int Page) {
        System.out.println("构造器被调用～～ 完成对象的属性初始化");
        name = pNme;
        age = Page;

    }
}