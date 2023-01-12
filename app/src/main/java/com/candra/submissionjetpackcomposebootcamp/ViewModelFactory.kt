package com.candra.submissionjetpackcomposebootcamp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.candra.submissionjetpackcomposebootcamp.data.ProgramsRepository
import com.candra.submissionjetpackcomposebootcamp.ui.screen.detail.DetailViewModel
import com.candra.submissionjetpackcomposebootcamp.ui.screen.home.HomeViewModel

class ViewModelFactory(
    private val repository: ProgramsRepository
): ViewModelProvider.NewInstanceFactory()
{
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        }else if (modelClass.isAssignableFrom(DetailViewModel::class.java)){
            return DetailViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}