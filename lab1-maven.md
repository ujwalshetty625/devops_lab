# LAB 1: Maven + TestNG

## Commands
mvn archetype:generate  
mvn clean compile  
java -cp target/classes pgm1.Result  
mvn test  

## Folder Structure
src/main/java/pgm1/Result.java  
src/test/java/pgm1/ResultTest.java  

## TestNG Dependency (pom.xml)
```xml
<dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>7.5.1</version>
  <scope>test</scope>
</dependency>

<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-surefire-plugin</artifactId>
      <version>3.0.0-M7</version>
    </plugin>
  </plugins>
</build>
