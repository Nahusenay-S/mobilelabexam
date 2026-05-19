package com.dark.notesquote.ui.screens.add_edit_note

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddEditNoteScreen(
    viewModel: AddEditNoteViewModel,
    onBackClick: () -> Unit,
    onSaveSuccess: () -> Unit,
    isEditMode: Boolean,
    modifier: Modifier = Modifier
) {
    val title by viewModel.title.collectAsState()
    val content by viewModel.content.collectAsState()
    val isTitleError by viewModel.isTitleError.collectAsState()
    val isSaveSuccess by viewModel.isSaveSuccess.collectAsState()

    // Observe save success state and navigate back reactively
    LaunchedEffect(isSaveSuccess) {
        if (isSaveSuccess) {
            onSaveSuccess()
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = if (isEditMode) "Edit Note" else "Create Note",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold
                        )
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Cancel and Go Back",
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { viewModel.saveNote() }) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = "Save Note",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                )
            )
        },
        containerColor = MaterialTheme.colorScheme.background,
        modifier = modifier.fillMaxSize()
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(horizontal = 20.dp, vertical = 8.dp)
        ) {
            // Title Input field
            OutlinedTextField(
                value = title,
                onValueChange = { viewModel.onTitleChanged(it) },
                placeholder = {
                    Text(
                        text = "Enter title here...",
                        color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.4f),
                        fontSize = 18.sp
                    )
                },
                isError = isTitleError,
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                shape = RoundedCornerShape(12.dp),
                textStyle = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.5f),
                    errorBorderColor = MaterialTheme.colorScheme.secondary,
                    focusedContainerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.2f),
                    unfocusedContainerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.1f)
                )
            )

            // Dynamic Validation Error message
            if (isTitleError) {
                Text(
                    text = "Title cannot be empty.",
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(start = 6.dp, bottom = 12.dp)
                )
            } else {
                Spacer(modifier = Modifier.height(6.dp))
            }

            // Content Input field
            OutlinedTextField(
                value = content,
                onValueChange = { viewModel.onContentChanged(it) },
                placeholder = {
                    Text(
                        text = "Write your thoughts down...",
                        color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.4f)
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(bottom = 16.dp),
                shape = RoundedCornerShape(14.dp),
                textStyle = MaterialTheme.typography.bodyLarge.copy(
                    lineHeight = 24.sp
                ),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.6f),
                    unfocusedBorderColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.3f),
                    focusedContainerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.1f),
                    unfocusedContainerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.05f)
                )
            )
        }
    }
}
