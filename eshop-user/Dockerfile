FROM openjdk:17.0.2

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /opt/projects/eshop

WORKDIR /opt/projects/eshop

EXPOSE 10001

ADD ./target/eshop-user-1.0-SNAPSHOT.jar ./

CMD java -jar -Xms1024m -Xmx1024m -Xmn256m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC -Dspring.profiles.active=docker eshop-user-1.0-SNAPSHOT.jar