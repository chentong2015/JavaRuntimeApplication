package demo;

public class ClassloaderBase {

    public static void main(String[] args) {
        // 拿到指定类型的类加载器，String类型默认由BootStrap类加载器加载
        System.out.println(String.class.getClassLoader());

        // classLoader.getClass().getName();
        // sum.misc.Launcher$AppClassLoader
        // AppClassLoader是声明在启动器Launcher类中的静态内部类

        // 获取系统默认的类加载器$AppClassLoader
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        // 返回上级类加载器
        classLoader.getParent();

        // 通过类加载器获取加载的资源, 返回的资源可能是文件或者目录
        classLoader.getResource("com/example/service");
    }

    public void testClassLoader() throws Exception {
        ClassloaderCustom myClassLoader = new ClassloaderCustom();
        // 加载同一路径下面的(同一个)Class文件
        String classPath = "jvm_basics.chapter07_Jvm_ClassLoader.classloader.MyClassLoader";
        Object obj = myClassLoader.loadClass(classPath).newInstance();
        System.out.println(obj.getClass());

        // instanceof 判定对象所属类型关系: false
        // JVM中存在两个MyClassLoader类，一个是由JVM应用程序类加载器所加载的，另一个是由自定义的类加载器所加载 !!
        System.out.println(obj instanceof ClassloaderCustom);
    }
}
