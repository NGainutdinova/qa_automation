package lv.acodemy.hooks;

import io.cucumber.java.After;
import lv.acodemy.utils.DriverManager;

public class hooks {

    @After
    public void tearDown(){
        DriverManager.closeDriver();
    }
}
