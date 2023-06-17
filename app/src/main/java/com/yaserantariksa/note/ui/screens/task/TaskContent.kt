package com.yaserantariksa.note.ui.screens.task

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.yaserantariksa.note.R
import com.yaserantariksa.note.components.PriorityDropDown
import com.yaserantariksa.note.data.models.Priority
import com.yaserantariksa.note.ui.theme.LARGE_PADDING
import com.yaserantariksa.note.ui.theme.MEDIUM_PADDING

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskContent(
    paddingValues: PaddingValues,
    title: String,
    onTitleChange: (String) -> Unit,
    description: String,
    onDescriptionChange: (String) -> Unit,
    priority: Priority,
    onPrioritySelected: (Priority) -> Unit
) {
    Surface(
        modifier = Modifier.padding(paddingValues),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(LARGE_PADDING)
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = title,
                onValueChange = { onTitleChange(it) },
                label = {
                    Text(
                        text = stringResource(id = R.string.label_title)

                    )
                },
                textStyle = MaterialTheme.typography.bodyMedium,
                singleLine = true
            )
            Divider(
                modifier = Modifier.height(LARGE_PADDING),
                color = Color.Transparent
            )
            PriorityDropDown(priority = priority, onPrioritySelected = onPrioritySelected)
            Divider(
                modifier = Modifier.height(MEDIUM_PADDING),
                color = Color.Transparent
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxSize(),
                value = description,
                onValueChange = { onDescriptionChange(it) },
                label = {
                    Text(
                        text = stringResource(id = R.string.label_description)

                    )
                },
                textStyle = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
@Preview
private fun TaskContentPreview() {
    TaskContent(
        paddingValues = PaddingValues(LARGE_PADDING),
        title = "",
        onTitleChange = {},
        description = "",
        onDescriptionChange = {},
        priority = Priority.LOW,
        onPrioritySelected = {}
    )
}