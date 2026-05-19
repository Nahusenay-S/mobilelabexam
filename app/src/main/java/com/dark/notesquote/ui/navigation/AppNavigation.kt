package com.dark.notesquote.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.dark.notesquote.NotesQuoteApp
import com.dark.notesquote.ui.screens.add_edit_note.AddEditNoteScreen
import com.dark.notesquote.ui.screens.add_edit_note.AddEditNoteViewModel
import com.dark.notesquote.ui.screens.dashboard.DashboardScreen
import com.dark.notesquote.ui.screens.dashboard.DashboardViewModel
import com.dark.notesquote.ui.screens.note_detail.NoteDetailScreen
import com.dark.notesquote.ui.screens.note_detail.NoteDetailViewModel
import com.dark.notesquote.ui.screens.settings.SettingsScreen
import com.dark.notesquote.ui.screens.settings.SettingsViewModel

object AppScreens {
    const val DASHBOARD = "dashboard"
    const val NOTE_DETAIL = "note_detail/{noteId}"
    const val ADD_EDIT_NOTE = "add_edit_note?noteId={noteId}"
    const val SETTINGS = "settings"

    fun noteDetailRoute(noteId: Int) = "note_detail/$noteId"
    fun addEditNoteRoute(noteId: Int? = null) = 
        if (noteId != null) "add_edit_note?noteId=$noteId" else "add_edit_note?noteId=-1"
}

@Composable
fun AppNavigation(
    appContainer: NotesQuoteApp,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = AppScreens.DASHBOARD,
        modifier = modifier
    ) {
        // 1. Dashboard Screen Route
        composable(AppScreens.DASHBOARD) {
            val dashboardViewModel: DashboardViewModel = viewModel(
                factory = object : ViewModelProvider.Factory {
                    @Suppress("UNCHECKED_CAST")
                    override fun <T : ViewModel> create(modelClass: Class<T>): T {
                        return DashboardViewModel(
                            noteRepository = appContainer.noteRepository,
                            quoteRepository = appContainer.quoteRepository
                        ) as T
                    }
                }
            )

            DashboardScreen(
                viewModel = dashboardViewModel,
                onNoteClick = { noteId ->
                    navController.navigate(AppScreens.noteDetailRoute(noteId))
                },
                onAddNoteClick = {
                    navController.navigate(AppScreens.addEditNoteRoute())
                },
                onSettingsClick = {
                    navController.navigate(AppScreens.SETTINGS)
                }
            )
        }

        // 2. Note Detail Screen Route
        composable(
            route = AppScreens.NOTE_DETAIL,
            arguments = listOf(navArgument("noteId") { type = NavType.IntType })
        ) { backStackEntry ->
            val noteId = backStackEntry.arguments?.getInt("noteId") ?: -1
            val noteDetailViewModel: NoteDetailViewModel = viewModel(
                key = "note_detail_$noteId",
                factory = object : ViewModelProvider.Factory {
                    @Suppress("UNCHECKED_CAST")
                    override fun <T : ViewModel> create(modelClass: Class<T>): T {
                        return NoteDetailViewModel(
                            noteRepository = appContainer.noteRepository,
                            noteId = noteId
                        ) as T
                    }
                }
            )

            NoteDetailScreen(
                viewModel = noteDetailViewModel,
                onBackClick = { navController.popBackStack() },
                onEditClick = { id ->
                    navController.navigate(AppScreens.addEditNoteRoute(id))
                }
            )
        }

        // 3. Add/Edit Note Screen Route
        composable(
            route = AppScreens.ADD_EDIT_NOTE,
            arguments = listOf(navArgument("noteId") { 
                type = NavType.IntType
                defaultValue = -1 
            })
        ) { backStackEntry ->
            val noteId = backStackEntry.arguments?.getInt("noteId") ?: -1
            val resolvedId = if (noteId == -1) null else noteId
            
            val addEditNoteViewModel: AddEditNoteViewModel = viewModel(
                key = "add_edit_note_$noteId",
                factory = object : ViewModelProvider.Factory {
                    @Suppress("UNCHECKED_CAST")
                    override fun <T : ViewModel> create(modelClass: Class<T>): T {
                        return AddEditNoteViewModel(
                            noteRepository = appContainer.noteRepository,
                            noteId = resolvedId
                        ) as T
                    }
                }
            )

            AddEditNoteScreen(
                viewModel = addEditNoteViewModel,
                onBackClick = { navController.popBackStack() },
                onSaveSuccess = {
                    navController.popBackStack(AppScreens.DASHBOARD, inclusive = false)
                },
                isEditMode = resolvedId != null
            )
        }

        // 4. Settings Screen Route
        composable(AppScreens.SETTINGS) {
            val settingsViewModel: SettingsViewModel = viewModel(
                factory = object : ViewModelProvider.Factory {
                    @Suppress("UNCHECKED_CAST")
                    override fun <T : ViewModel> create(modelClass: Class<T>): T {
                        return SettingsViewModel(
                            settingsRepository = appContainer.settingsRepository
                        ) as T
                    }
                }
            )

            SettingsScreen(
                viewModel = settingsViewModel,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
