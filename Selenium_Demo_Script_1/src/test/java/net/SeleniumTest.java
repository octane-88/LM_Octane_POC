package net;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;

import static junit.framework.TestCase.assertTrue;

public class SeleniumTest {

    public SeleniumTest() {
    //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
   //     driver.quit();
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {


          WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        driver.findElement(By.name("q")).sendKeys("MSN");

        driver.findElement(By.name("btnK")).click();

        driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();

        String title_name = driver.getTitle();

        System.out.println("The title is    :" + title_name);

        assertTrue(driver.getTitle().contains("MSN"));

        driver.quit();

    }
}