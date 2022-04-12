package javatest;

//三种方式获取class对象
/*
1.使用class属性来获取class对象
2.使用getClass方法来获取class对象
3.使用Class中的静态成员方法forName(String className):通过类的全路径来获取class对象
 */

//class student{
//    public String name;
//    public int age;
//
//    public student() {
//    }
//
//    public student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//public class Test {
//    public static void main(String[] args) throws ClassNotFoundException {
//        //1.使用class属性来获取class对象
//        Class<student> c1 = student.class;
//        System.out.println(c1);//class javatest.student 这个类在javatest包下
//        //2.使用getClass方法来获取class对象
//        student s=new student();
//        Class<? extends student> c2 = s.getClass();
//        System.out.println(c1==c2);//true
//        //3.使用Class中的静态成员方法forName(String className):通过类的全路径来获取class对象
//        Class<?> c3 = Class.forName("javatest.student");
//        System.out.println(c2==c3);//true 说明他们获取的是同一个class对象
//    }
//}

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//反射获取构造方法并使用练习
//class student{
//    public String name;
//    public int age;
//    public String addr;
//
//    public student() {
//    }
//
//    public student(String name, int age, String addr) {
//        this.name = name;
//        this.age = age;
//        this.addr = addr;
//    }
//    //如果要直接打印的话要重写toString方法
//    @Override
//    public String toString() {
//        return "student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", addr='" + addr + '\'' +
//                '}';
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Class<?> c1 = Class.forName("javatest.student");
//        Constructor<?> con = c1.getConstructor(String.class, int.class, String.class);//获取对象的构造方法
//        Object obj = con.newInstance("林青霞", 30, "西安");//构造方法通过反射获取构造对象
//        System.out.println(obj);//student{name='林青霞', age=30, addr='西安'}//
//        当然获取构造方法的方式有很多 这里就不列举出来了 感兴趣的话自己取了解
//
//    }
//}



//class student{
//    public String name;
//    public int age;
//    public String addr;
//
//    public student() {
//    }
//
//    public student(String name, int age, String addr) {
//        this.name = name;
//        this.age = age;
//        this.addr = addr;
//    }
//    private student(String name){//私有构造方法
//        this.name=name;
//    }
//    //如果要直接打印的话要重写toString方法
//    @Override
//    public String toString() {
//        return "student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", addr='" + addr + '\'' +
//                '}';
//    }
//}
//
//public class Test {
//    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Class<?> c1 = Class.forName("javatest.student");
//        Constructor<?> con1 = c1.getDeclaredConstructor(String.class);//如果要获取的构造方法是私有的 就要用getDeclaredConstructor(可以获取所有构造方法)
//        //void	setAccessible(boolean flag)将此反射对象的标志设置为指示的布尔值。
//        con1.setAccessible(true);//flag为true 取消访问检查  如果没有这句  则不嫩通过获取的私有构造函数创建对象
//        Object obj = con1.newInstance("林青霞");
//        System.out.println(obj);//student{name='林青霞', age=0, addr='null'}
//
//    }
//}





















