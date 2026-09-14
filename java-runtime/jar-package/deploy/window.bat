# 在Windows启动jar包程序: 传递main方法参数

@echo off
java -jar ManagementAPI.jar --config.file=./conf/ManagementAPI.properties

"!JAVA_BIN!" %JAVA_LS_OPTS% -jar "!CURRENT_DIR!\!APPLICATION_NAME!.jar" %JAVA_LS_JAR_OPTS%