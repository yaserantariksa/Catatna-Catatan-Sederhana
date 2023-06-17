package com.yaserantariksa.note.navigation.destinations

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideOutHorizontally
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import com.yaserantariksa.note.ui.screens.splash.SplashScreen
import com.yaserantariksa.note.utils.Constants.SPLASH_SCREEN

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit
) {
    composable(
        route = SPLASH_SCREEN,
        exitTransition = {
            slideOutHorizontally (
                targetOffsetX = { it },
                animationSpec = tween(500)
                    )
        }
    ) {
        SplashScreen(navigateToListScreen = navigateToListScreen )
    }
}