package com.mytaxi.android_demo.Test;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import com.mytaxi.android_demo.Pages.DriverSearchPage;
import com.mytaxi.android_demo.Pages.LoginPage;
import com.mytaxi.android_demo.Variables.SharedInstance;
import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by jsales on 7/27/2018.
 */
@RunWith(AndroidJUnit4.class)
public class EspressoTest extends ActivityInstrumentationTestCase2 {

    public EspressoTest() {
        super(MainActivity.class);
    }
    public LoginPage loginPage;
    public DriverSearchPage driverSearchPage;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        loginPage = new LoginPage();
        driverSearchPage = new DriverSearchPage();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        getActivity();
    }

    @Test
    public void loginTest() throws InterruptedException {
        loginPage.login(SharedInstance.TEST_USERNAME, SharedInstance.TEST_PASSWORD);
        driverSearchPage.searchDriver(SharedInstance.TEXT_TO_SEARCH, SharedInstance.TEST_USER);
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

}
