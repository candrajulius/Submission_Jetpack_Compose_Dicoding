package com.candra.submissionjetpackcomposebootcamp.ui.screen.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.candra.submissionjetpackcomposebootcamp.data.ProgramsRepository
import com.candra.submissionjetpackcomposebootcamp.model.Programs
import com.candra.submissionjetpackcomposebootcamp.util.Constant.TAG
import com.candra.submissionjetpackcomposebootcamp.util.UiState
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: ProgramsRepository
): ViewModel()
{
    private val _state:MutableStateFlow<UiState<List<Programs>>> =
        MutableStateFlow(UiState.Loading)

    val state = _state.asStateFlow()

    fun getAllPrograms(){
        viewModelScope.launch {
            repository.getAllPrograms()
                .catch {
                    _state.value = UiState.Error(it.message.toString())
                }
                .collect{programs ->
                    _state.value = UiState.Success(programs)
                    Log.d(TAG, "getAllPrograms: ${programs}")
                }
        }
    }
}