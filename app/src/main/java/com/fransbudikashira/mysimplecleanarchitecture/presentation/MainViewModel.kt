package com.fransbudikashira.mysimplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fransbudikashira.mysimplecleanarchitecture.domain.MessageEntity
import com.fransbudikashira.mysimplecleanarchitecture.domain.MessageUseCase

class MainViewModel(
    private val messageUseCase: MessageUseCase
): ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity> get() = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}