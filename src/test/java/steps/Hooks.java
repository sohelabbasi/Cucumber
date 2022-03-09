package steps;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utilities.CommonMethods;

public class Hooks extends CommonMethods {

  @Before
  public void start(){
      openBrowser();
  }

    @After
    public void end(){
      closeBrowser();
    }
}
