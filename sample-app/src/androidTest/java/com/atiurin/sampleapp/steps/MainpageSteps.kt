package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.swiper
import com.atiurin.sampleapp.pages.MainPage
import com.atiurin.sampleapp.pages.MainPage.returnFriendChat
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.withTimeout
import org.junit.Assert

object MainpageSteps {
    fun dashboardIsLoaded() {
        with(MainPage) {
            Assert.assertTrue(dashboard.isViewDisplayed())
        }
    }

    fun openChat(friendName: String) {
        with(MainPage) {
            returnFriendChat(friendName).withTimeout(2000).click()
        }
    }

    fun openMenu() {
        with(MainPage) {
            menuButton.tap()
        }
    }

    fun friendScroll(friendName: String) {
        with(MainPage) {
            returnFriend(friendName).scrollToItem()
        }
    }

    // es ar imushava ar vici rato, nu davalebashic ar iyo mocemuli ro ami gamoyeneaa sachiro....
    fun swipeToFriend(friendName: String) {
        for (i in 1..5) {
            if (returnFriendChat(friendName).isViewDisplayed()) {
                swiper(400, 250, 20)
            }
        }
        returnFriendChat(friendName).tap()
    }
}
