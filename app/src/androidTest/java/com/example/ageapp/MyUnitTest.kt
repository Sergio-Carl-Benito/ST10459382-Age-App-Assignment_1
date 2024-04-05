package com.example.ageapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4

@RunWith(AndroidJUnit4::class)
class MyUnitTest{

    @Test
    fun testAgeMatching() {
        // Start the activity scenario
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        // Test age matching for age 20
        onView(withId(R.id.enterAge)).perform(replaceText("20"), closeSoftKeyboard())
        onView(withId(R.id.submitButton)).perform(click())
        onView(withId(R.id.textOutput)).check(matches(withText("You are 20. James Dean died at 20, he was an iconic actor known for his role in 'Rebel Without a Cause.'")))

        // Test age matching for age 30
        onView(withId(R.id.enterAge)).perform(replaceText("30"), closeSoftKeyboard())
        onView(withId(R.id.submitButton)).perform(click())
        onView(withId(R.id.textOutput)).check(matches(withText("You are 30. Freddie Mercury died at 30, he was the lead singer of Queen.")))

        // Test age out of range (101)
        onView(withId(R.id.enterAge)).perform(replaceText("101"), closeSoftKeyboard())
        onView(withId(R.id.submitButton)).perform(click())
        onView(withId(R.id.textOutput)).check(matches(withText("Your age is not within 20 to 100 years old")))

        // Finish the activity scenario
        activityScenario.close()
    }
}
