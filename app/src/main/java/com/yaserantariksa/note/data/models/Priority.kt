package com.yaserantariksa.note.data.models

import androidx.compose.ui.graphics.Color
import com.yaserantariksa.note.ui.theme.High
import com.yaserantariksa.note.ui.theme.Low
import com.yaserantariksa.note.ui.theme.Medium
import com.yaserantariksa.note.ui.theme.None

enum class Priority (val color: Color) {
    HIGH(High),
    MEDIUM(Medium),
    LOW(Low),
    NONE(None),
}