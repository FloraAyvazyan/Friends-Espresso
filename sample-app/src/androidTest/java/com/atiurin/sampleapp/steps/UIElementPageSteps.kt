package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.sampleapp.pages.UIElementPage.button1
import com.atiurin.sampleapp.pages.UiElementsPage
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.isNotDisplayed
import com.atiurin.ultron.extensions.isNotSelected
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.textContains
import org.junit.Assert.assertTrue

object UIElementPageSteps {
    fun pageIsLoaded() {
        with(UIElementPage) {
            assertTrue(baseTitle.isViewDisplayed())
        }
    }
    fun unmarkEnableButton() {
        with(UIElementPage) {
            unmarkCheckboxEnable.tap()
        }
    }
    fun unmarkClickableButton() {
        with(UIElementPage) {
            checkboxClickableButton.tap()
        }
    }
    fun validateEnableButton() {
        with(UIElementPage) {
            unmarkCheckboxEnable.isNotSelected()
        }
    }

    fun validateClickableButton() {
        with(UIElementPage) {
            checkboxClickableButton.isNotSelected()
        }
    }

    fun clickOnInvisibleButton() {
        with(UIElementPage) {
            invisible_button.tap()
        }
    }

    fun validateButton1IsInvisible() {
        with(UIElementPage) {
            button1.isNotDisplayed()
        }
    }

    fun validateSimpleButtonOpened() {
        with(UiElementsPage) {
            button1.isDisplayed()
        }
    }

    fun clickOnSimpleButton(int: Int) {
        with(UIElementPage) {
            for (i in 0 until int) {
                button1.tap()
            }
        }
    }

    fun validateCount(int: Int) {
        with(UIElementPage) {
            lastEventStatus.textContains("Click " + int)
        }
    }

    fun clickOnRadioGone() {
        with(UIElementPage) {
            radioGone.tap()
        }
    }

    fun validateSimpleButtonGone() {
        with(UiElementsPage) {
            button1.isNotDisplayed()
        }
    }
}
