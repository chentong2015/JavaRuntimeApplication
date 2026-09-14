package demo;

public class ParentsDelegationModel {

    // ClassLoader中定义的loadClass()方法源码: 符合"双亲委派机制"
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        // synchronized (getClassLoadingLock(name)) {
        //     // First, check if the class has already been loaded
        //     检查请求类是否被加载过了
        //     Class<?> c = findLoadedClass(name);
        //     if (c == null) {
        //         long t0 = System.nanoTime();
        //         try {
        //              if (parent != null) {
        //                  c = parent.loadClass(name, false);
        //              } else {
        //                  c = findBootstrapClassOrNull(name);
        //              }
        //         } catch (ClassNotFoundException e) {
        //              抛出异常，说明父类加载器没有办法完成加载请求
        //              ClassNotFoundException thrown if class not found from the non-null parent class loader
        //         }
        //         if (c == null) {
        //             // If still not found, then invoke findClass in order to find the class
        //             // 使用本身的findClass方法来进行加载
        //             long t1 = System.nanoTime();
        //             c = findClass(name);
        //         }
        //     }
        //     if (resolve) resolveClass(c);
        //     return c;
        // }
        return null;
    }

    // TODO: 打破Parents Delegation Model机制
    // 避免向上委托，或者逆向使用(父类加载器去请求子类加载器的行为)
    // 1. JNDI服务: 对资源进行查找和集中管理
    //    使用Thread Context ClassLoader来加载指定classpath下JDBI服务提供的接口代码
    // 2. Tomcat加载机制: 借助WebAppClassLoader来加载自己目录下的class文件
    protected Class<?> loadClassPlus(String name, boolean resolve) throws ClassNotFoundException {
        // synchronized (getClassLoadingLock(name)) {
        //     // First, check if the class has already been loaded 检查请求类是否被加载过了
        //     Class<?> c = findLoadedClass(name);
        //     if (c == null) {
        //         long t0 = System.nanoTime();
        //         ** 删除"双亲向上委托"，打破加载机制 ==> 只能打破非Java核心API中的类，否则受到"沙箱安全机制"的影响 **
        //         if (c == null) {
        //             // If still not found, then invoke findClass in order to find the class
        //             // 使用本身的findClass方法来进行加载
        //             long t1 = System.nanoTime();
        //
        //             ** 规避掉由于"沙箱安全机制"的影响，导致的不能加载自定义的类型 **
        //             if(name.startWith("com.ctong.main")) {
        //                 c = findClass(name);
        //             } else {
        //                 c = this.getParent().loadClass(name);
        //             }
        //         }
        //     }
        //     if (resolve) resolveClass(c);
        //     return c;
        // }
        return null;
    }
}
