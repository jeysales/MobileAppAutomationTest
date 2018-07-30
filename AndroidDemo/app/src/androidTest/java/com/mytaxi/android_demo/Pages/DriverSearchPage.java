package com.mytaxi.android_demo.Pages;

import android.support.test.espresso.matcher.RootMatchers;
import android.support.test.espresso.matcher.ViewMatchers;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by jsales on 7/30/2018.
 */

public class DriverSearchPage {

    public DriverSearchPage searchDriver(String textToSearch, String testUser) throws InterruptedException {
        onView(ViewMatchers.withId(R.id.textSearch))
                .perform(typeText(textToSearch));
        Thread.sleep(3000);
        onView(withText(testUser)).inRoot(RootMatchers.isPlatformPopup()).perform(click());
        onView(withId(R.id.fab)).perform(click());
        return this;
    }

}
