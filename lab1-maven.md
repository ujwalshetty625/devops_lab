# LAB 1: Maven Application

## Step 1: Create Project
mvn archetype:generate

---

## Step 2: Main Code

File: src/main/java/pgm1/Result.java

    package pgm1;

    public class Result {
        public static String display(int m) {
            if (m < 0 || m > 100)
                return "invalid";
            else if (m < 40)
                return "fail";
            else
                return "pass";
        }

        public static void main(String[] args) {
            System.out.println(display(55));
        }
    }

---

## Step 3: Test Code

File: src/test/java/pgm1/ResultTest.java

    package pgm1;

    import org.testng.Assert;
    import org.testng.annotations.Test;

    public class ResultTest {

        @Test
        public void testPass() {
            Assert.assertEquals(Result.display(55), "pass");
        }

        @Test
        public void testFail() {
            Assert.assertEquals(Result.display(35), "fail");
        }

        @Test
        public void testInvalid() {
            Assert.assertEquals(Result.display(-5), "invalid");
        }
    }

---

## Step 4: pom.xml Dependency

    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>7.5.1</version>
      <scope>test</scope>
    </dependency>

---

## Step 5: Commands

mvn clean compile  
java -cp target/classes pgm1.Result  
mvn test
