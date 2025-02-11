package com.atiurin.sampleapp.tests.espresso

import com.atiurin.sampleapp.data.Constants
import com.atiurin.sampleapp.steps.MainpageSteps
import com.atiurin.sampleapp.steps.MenuSteps
import com.atiurin.sampleapp.steps.UIElementPageSteps
import com.atiurin.sampleapp.tests.MyBaseTest
import org.junit.Test


class UIElementsTest : MyBaseTest() {

    @Test
    fun test1() {
        with(Constants) {
            with(MainpageSteps) {
                dashboardIsLoaded()
                openMenu()
            }
            with(MenuSteps) {
                clickCustomClick(UI_ELEMENTS)
            }
            with(UIElementPageSteps) {
                pageIsLoaded()
                unmarkEnableButton()
                unmarkClickableButton()
                validateEnableButton()
                validateClickableButton()
                clickOnInvisibleButton()
                validateButton1IsInvisible()
            }
        }
    }

    @Test
    fun test2() {
        with(Constants) {
            with(MainpageSteps) {
                dashboardIsLoaded()
                openMenu()
            }
            with(MenuSteps) {
                clickCustomClick(UI_ELEMENTS)
            }
            with(UIElementPageSteps) {
                pageIsLoaded()
                validateSimpleButtonOpened()
                clickOnSimpleButton(CLICK)
                validateCount(CLICK)
                clickOnRadioGone()
                validateSimpleButtonGone()
            }
        }
    }


}