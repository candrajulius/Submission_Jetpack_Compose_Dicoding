package com.candra.submissionjetpackcomposebootcamp.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.candra.submissionjetpackcomposebootcamp.data.ProgramsRepository
import com.candra.submissionjetpackcomposebootcamp.model.Programs
import com.candra.submissionjetpackcomposebootcamp.util.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class DetailViewModel(
    private val repository: ProgramsRepository
): ViewModel()
{
    private val _uiState: MutableStateFlow<UiState<Programs>> =
        MutableStateFlow(UiState.Loading)

    val uiState = _uiState.asStateFlow()

    fun getProgramsById(programsId: Int){
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            repository.getProgramLanguageById(programsId)
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect{
                    _uiState.value = UiState.Success(it)
                }
        }
    }
}