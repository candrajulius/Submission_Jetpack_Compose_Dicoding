package com.candra.submissionjetpackcomposebootcamp.di

import com.candra.submissionjetpackcomposebootcamp.data.ProgramsRepository

object Injection {
    fun provideRepository(): ProgramsRepository{
        return ProgramsRepository.getInstance()
    }
}