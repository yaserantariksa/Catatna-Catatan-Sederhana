package com.yaserantariksa.note.ui.screens.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yaserantariksa.note.R
import com.yaserantariksa.note.ui.theme.MediumGray

@Composable
fun EmptyContent () {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            modifier = Modifier.size(120.dp),
            imageVector = Icons.Default.Face,
            contentDescription = stringResource(id = R.string.empty_content),
            tint = MediumGray
        )
        Text(
            text = stringResource(id = R.string.empty_content_text),
            color = MediumGray,
            style = MaterialTheme.typography.headlineSmall
        )
    }
}

@Composable
@Preview
fun EmptyContentPreview(){
    EmptyContent()
}