package com.candra.submissionjetpackcomposebootcamp.ui.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.candra.submissionjetpackcomposebootcamp.ViewModelFactory
import com.candra.submissionjetpackcomposebootcamp.di.Injection
import com.candra.submissionjetpackcomposebootcamp.model.Programs
import com.candra.submissionjetpackcomposebootcamp.ui.components.ProgramItem
import com.candra.submissionjetpackcomposebootcamp.util.UiState

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateToDetail: (Int) -> Unit,
)
{
    viewModel.state.collectAsState(initial = UiState.Loading).value.let { 
        when(it){
            is UiState.Loading -> {
                viewModel.getAllPrograms()
            }
            is UiState.Success -> {
                HomeContent(
                    listProgram = it.data,
                    modifier = modifier,
                    navigateToDetail = navigateToDetail )
            }
            is UiState.Error -> {}
        }
    }
}

@Composable
fun HomeContent(
    listProgram: List<Programs>,
    modifier: Modifier = Modifier,
    navigateToDetail: (Int) -> Unit
)
{
    LazyColumn(modifier = modifier){
        items(listProgram){data ->
            ProgramItem(movieId = data.id,
                title = data.title ,
                image = data.image,
            modifier = Modifier.clickable {
                navigateToDetail(data.id)
            })
        }
    }
}

