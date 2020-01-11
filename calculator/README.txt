Simple web application which can be deployed on web application server for demonstration of application coverage.
For more information please check https://docs.parasoft.com/display/JTEST1042/Web+Application+Coverage+Tutorial 

Maven
-------------------------------------------------
Prerequisites
1. Make sure that you have Apache Maven installed and "mvn" available on your path.

To build war file with Maven please use following command
  mvn clean install

Web application archive location target/Calculator.war

Gradle
-------------------------------------------------

Run following command

Windows:
  gradlew clean war

UNIX:
  ./gradlew clean war

Web application archive location build/libs/Calculator.war

Ant
-------------------------------------------------
Prerequisites
1. Make sure that you have Apache Ant installed and "ant" available on your path.

To build war file with Ant please use following command
  ant clean war

Web application archive location out/Calculator.war
