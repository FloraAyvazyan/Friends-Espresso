package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher


object UIElementPage {
    val baseTitle: Matcher<View> by lazy { ViewMatchers.withId(R.id.webview) }
    val unmarkCheckboxEnable: Matcher<View> by lazy { ViewMatchers.withId(R.id.checkbox_enable) }
    val checkboxClickableButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.checkbox_clickable) }
    val invisible_button: Matcher<View> by lazy { ViewMatchers.withId(R.id.radio_invisible) }
    val button1: Matcher<View> by lazy { ViewMatchers.withId(R.id.button1) }
    val lastEventStatus: Matcher<View> by lazy { ViewMatchers.withId(R.id.last_event_status) }


}
