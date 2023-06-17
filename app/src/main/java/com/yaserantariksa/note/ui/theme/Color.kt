package com.yaserantariksa.note.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val Purple500 = Color(0xFF7830DF)

val LightGray = Color(0xFFFCFCFCF)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)
val BlackColor = Color.Black
val WhiteColor = Color.White

val Low = Color(0xFF00C980)
val Medium = Color(0xFFFFC114)
val High = Color(0xFFFF4646)
val None = MediumGray

val ColorScheme.topAppBarContentColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) WhiteColor else LightGray

val ColorScheme.topAppBarBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Purple500 else BlackColor

val ColorScheme.taskItemBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) LightGray else DarkGray

val ColorScheme.taskItemTextColor: Color
@Composable
get() = if (!isSystemInDarkTheme()) DarkGray else LightGray