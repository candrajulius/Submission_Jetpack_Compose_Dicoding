package com.candra.submissionjetpackcomposebootcamp.ui.screen.detail

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.candra.submissionjetpackcomposebootcamp.ViewModelFactory
import com.candra.submissionjetpackcomposebootcamp.di.Injection
import com.candra.submissionjetpackcomposebootcamp.ui.components.DetailItems
import com.candra.submissionjetpackcomposebootcamp.util.UiState

@Composable
fun DetailProgram(
    programId: Int,
    viewModel: DetailViewModel = viewModel(
        factory = ViewModelFactory(
            Injection.provideRepository()
        )
    ),
    navigateToBack: () -> Unit,
    modifier: Modifier = Modifier
){
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let {
        when(it){
            is UiState.Loading -> {
                viewModel.getProgramsById(programId)
            }
            is UiState.Success -> {
                val dataProgram = it.data
                DetailContent(
                    dataProgram.image,
                    dataProgram.title,
                    dataProgram.description,
                    onBackClick = navigateToBack,
                    modifier = modifier
                )
            }
            is UiState.Error -> {}
        }
    }
}

@Composable
fun DetailContent(
    @DrawableRes image: Int,
    title: String,
    description: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
){
    DetailItems(image = image, title = title, description = description, onBackClick = onBackClick, modifier = modifier)
}