package com.Frame;

import com.Base.TestBase;

public class IframeTest extends TestBase {

    public static void main(String[] args) {

        launch_chrome();
        openURL("https://the-internet.herokuapp.com/frames");
        singleFrame();

    }
    public static void singleFrame(){
        ClickOnElementByCSS("#content > div > ul > li:nth-child(2) > a");
        switchToIFrame("mce_0_ifr");
        clearElementByID("tinymce");
        typeOnElementByID("tinymce","Test Automation By selenium");
    }
}
