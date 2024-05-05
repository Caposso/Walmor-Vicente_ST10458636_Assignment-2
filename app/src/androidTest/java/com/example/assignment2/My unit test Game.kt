package com.example.assignment2

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class GameActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(Game::class.java)

    @Test
    fun feedButton_click_opensImageAndIncreasesHunger() {
        // Click the feed button
        onView(withId(R.id.feedButton)).perform(click())

        // Check if image is displayed
        onView(withId(R.id.imageView2)).check(matches(isDisplayed()))

        // Check if textHunger is increased
        onView(withId(R.id.textHunger)).check(matches(withText("1")))
    }

    @Test
    fun cleanButton_click_opensImageAndIncreasesClean() {
        // Click the clean button
        onView(withId(R.id.cleanButton)).perform(click())

        // Check if image is displayed
        onView(withId(R.id.imageView2)).check(matches(isDisplayed()))

        // Check if textClean is increased
        onView(withId(R.id.textClean)).check(matches(withText("1")))
    }

    @Test
    fun playButton_click_opensImageAndIncreasesHappy() {
        // Click the play button
        onView(withId(R.id.playButton)).perform(click())

        // Check if image is displayed
        onView(withId(R.id.imageView2)).check(matches(isDisplayed()))

        // Check if textHappy is increased
        onView(withId(R.id.textHappy)).check(matches(withText("1")))
    }
}


