# 在Linux启动jar包程序: 传递main方法参数

#!/bin/sh
java -jar ManagementAPI.jar --config.file=./conf/ManagementAPI.properties

cd "${CURRENT_DIR}"
${JAVA_BIN} ${JAVA_LS_OPTS} -jar ${CURRENT_DIR}/${APPLICATION_NAME}.jar ${JAVA_LS_JAR_OPTS}
