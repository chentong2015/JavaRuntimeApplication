FROM eclipse-temurin:21-jre

WORKDIR /app
COPY app.jar .

EXPOSE 8080 5005

# 通过Option动态配置Debug
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]