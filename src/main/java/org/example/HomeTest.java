package org.example;

import org.example.model.HomePage;
import org.example.runner.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test
    public void testClickTypingTutorLinkInHeader() {
        String pageTitle = new HomePage(getDriver())
                .clickTypingTutorLinkInHeader()
                .getTitleText();

        Assert.assertEquals( pageTitle, "Ratatype — Online Touch Typing Tutor and Typing Lessons");
    }

    @Test
    public void testClickTypingTestLinkInHeader() {
        String pageTitle = new HomePage(getDriver())
                .clickTypingTestLinkInHeader()
                .getTitleText();

        Assert.assertEquals(pageTitle, "Typing test online ✔\uFE0F Get your certificate for free — Ratatype");
    }

}
