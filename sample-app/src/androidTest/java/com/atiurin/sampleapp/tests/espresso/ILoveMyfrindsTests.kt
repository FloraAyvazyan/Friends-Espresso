package com.atiurin.sampleapp.tests.espresso

import com.atiurin.sampleapp.data.Constants
import com.atiurin.sampleapp.pages.ChatPage.clearHistory
import com.atiurin.sampleapp.steps.ChatPageSteps
import com.atiurin.sampleapp.steps.MainpageSteps
import com.atiurin.sampleapp.tests.MyBaseTest
import org.junit.Test

class ILoveMyFriendsTests : MyBaseTest() {

    @Test
    fun findFriendTest() {
        with(Constants) {
            with(MainpageSteps) {
                friendScroll(EMMET_BROWN)
                openChat(EMMET_BROWN)
            }
            with(ChatPageSteps) {
                checkChatIsCorrect(EMMET_BROWN)
                inputMessage(LETS_GOR_FOR_DRINK)
                sendMessage()
                assertMessageIsSent(LETS_GOR_FOR_DRINK)
            }
        }
    }

    @Test
    fun findFriendTest2() {
        with(Constants) {
            with(MainpageSteps) {
                dashboardIsLoaded()
                friendScroll(FRIEND17)
                openChat(FRIEND17)
            }
            with(ChatPageSteps) {
                checkChatIsCorrect(FRIEND17)
                clearHistory()
                inputMessage(PLEASE_CHANGE_YOU_NAME)
                sendMessage()
                assertMessageIsSent(PLEASE_CHANGE_YOU_NAME)
            }
        }
    }

//    @Test
//    fun findFriendTest3() {
//        with(Constants) {
//            with(MainpageSteps) {
//                dashboardIsLoaded()
//                friendScroll(FRIEND25)
//                openChat(FRIEND25)
//            }
//            with(ChatPageSteps) {
//                checkChatIsCorrect(FRIEND25)
//                clearHistory()
//                inputMessage(YOU_ARE_MY_HERO)
//                sendMessage()
//                assertMessageIsSent(YOU_ARE_MY_HERO)
//            }
//        }
//    }
}
