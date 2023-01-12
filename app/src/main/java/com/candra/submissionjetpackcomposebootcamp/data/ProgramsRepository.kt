package com.candra.submissionjetpackcomposebootcamp.data

import com.candra.submissionjetpackcomposebootcamp.model.Programs
import com.candra.submissionjetpackcomposebootcamp.model.ProgramsData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProgramsRepository {
    private val programs = mutableListOf<Programs>()

    init {
        if (programs.isEmpty()){
            ProgramsData.programsData.forEach {
                programs.add(it)
            }
        }
    }

    fun getAllPrograms(): Flow<List<Programs>>{
        return flowOf(programs)
    }

    fun getProgramLanguageById(programsId: Int):Flow<Programs>{
        return flowOf(programs.first {
            it.id == programsId
        })
    }

    companion object {
        @Volatile
        private var instance: ProgramsRepository? = null

        fun getInstance(): ProgramsRepository =
            instance ?: synchronized(this){
                ProgramsRepository().apply {
                    instance = this
                }
            }
    }
}