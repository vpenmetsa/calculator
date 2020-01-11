可以部署简单的 web 应用程序在 web 应用服务器上，以演示应用程序的覆盖率。
有关更多详情，请查阅 https://docs.parasoft.com/display/JTEST1042/Web+Application+Coverage+Tutorial 

Maven
-------------------------------------------------
前提条件
1. 请确保你的路径上存在已安装的 Apache Maven 以及可用的 "mvn" 。

若要使用 Maven 构建 war 文件，请使用以下命令
  mvn clean install

Web application archive location target/Calculator.war

Gradle
-------------------------------------------------

运行以下命令

Windows:
  gradlew clean war

UNIX:
  ./gradlew clean war

Web application archive location build/libs/Calculator.war

Ant
-------------------------------------------------
前提条件
1. 请确保你的路径上存在已安装的 Apache Ant 以及可用的 "ant"。

若要使用 Ant 构建 war 文件，请使用以下命令
  ant clean war

Web application archive location out/Calculator.war
