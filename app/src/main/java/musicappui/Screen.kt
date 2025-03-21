package musicappui

import androidx.annotation.DrawableRes
import eu.tutorials.musicappui.R

sealed class Screen(val title: String, val route: String) {

    sealed class BottomScreen(val bTitle: String, val bRoute: String, @DrawableRes val icon: Int) : Screen(bTitle,bRoute){
        data object Home: BottomScreen(
            "Home",
            "home",
            R.drawable.baseline_home_24
        )
        data object Browse: BottomScreen(
            "Browse",
            "browse",
            R.drawable.baseline_apps_24
        )

        data object Library: BottomScreen(
            "Library",
            "library",
            R.drawable.baseline_library_music_24
        )
    }
    sealed class  DrawerScreen(val dTitle: String, val dRoute: String, @DrawableRes val icon: Int) : Screen(dTitle, dRoute){
        data object Account: DrawerScreen(
                "Account",
                "account",
            R.drawable.ic_account
        )
        data object Subscription: DrawerScreen(
                "Subscription",
                "subscribe",
            R.drawable.ic_subscribe
        )

        data object AddAccount: DrawerScreen(
                "Add Account",
                "add_account",
            R.drawable.baseline_person_add_alt_1_24
        )
    }
}

val screensInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)