package io.ctdev.signup;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    @BeforeSuite
    public void setup2(){
        System.out.println("This is super before suite");
    }
  @BeforeClass
    public void beforeEachClass(){
      System.out.println("Before each class");

  }

    @AfterSuite
    public void teardown(){
        System.out.println("This is after suite");

    }
}
