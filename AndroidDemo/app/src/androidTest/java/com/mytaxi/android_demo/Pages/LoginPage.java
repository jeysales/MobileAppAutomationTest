package com.mytaxi.android_demo.Pages;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by jsales on 7/30/2018.
 */

public class LoginPage {

    public void login(String userName, String password) throws InterruptedException {
        onView(ViewMatchers.withId(R.id.edt_username))
                .perform(ViewActions.typeText(userName));
        onView(withId(R.id.edt_password))
                .perform(ViewActions.typeText(password));
        onView(withId(R.id.btn_login))
                .perform(click());
        Thread.sleep(3000);
    }
}
