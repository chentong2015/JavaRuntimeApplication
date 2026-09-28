package system_property;

import java.nio.charset.Charset;

// TODO. 系统属性的本质
// 1. Java程序运行依赖不同的系统环境变量, 必要的信息
// 2. Java程序受到系统属性值影响, 根据参数定制化运行(交互作用)
public class JavaSystemProperties {

    public static void main(String[] args) {
        // TODO. 自定义传递系统属性
        // Edit Configuration > VM Options > -Dproperty1=test -Dproperty2="chen"
        System.out.println(System.getProperty("property1"));
        System.out.println(System.getProperty("property2"));

        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.class.path"));

        // -Dfile.encoding="UTF-8" 修改编码格式, 设置到OS系统的环境变量
        System.out.println(System.getProperty("file.encoding"));
        if (Charset.defaultCharset().toString().equals("UTF-8")) {
            System.out.println("Set encoding UTF-8");
        }
    }
}
