package com.DatePicker;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CalenderTest extends TestBase {
    public static void main(String[] args) {
         launch_chrome();
         CalenderTest obj=new CalenderTest();
         obj.trips();

    }
    public void selectDate(String month,String select_day){
        List<WebElement> elements= driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span"));
        for (WebElement element : elements) {
            System.out.println(element.getText());

            if (element.getText().equals(month)) {
                List<WebElement> days = driver.findElements(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span"));
                for (WebElement d : days) {
                    System.out.println(d.getText());
                    if (d.getText().equals(select_day)) {
                        d.click();
                        return;
                    }
                }
            }
        }
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span"));
        selectDate(month, select_day);
    }
    public void trips(){
        openURL("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span"));
        Date d=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd-MMMM-yyyy");

        String date= formatter.format(d);
        String[] splitter =date.split("-");
        String month=splitter[1];
        String day=splitter[0];
        System.out.println(month);
        System.out.println(day);
        selectDate(month,day);
    }
}
