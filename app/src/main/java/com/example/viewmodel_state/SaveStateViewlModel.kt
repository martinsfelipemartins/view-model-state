package com.example.viewmodel_state

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class SaveStateViewlModel(state: SavedStateHandle) : ViewModel() {

    val counterLiveData = state.getLiveData<Int>("Counter")

    fun increment() {
        counterLiveData.value = (counterLiveData.value ?: 0) + 1
    }

}