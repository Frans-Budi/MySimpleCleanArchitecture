package com.fransbudikashira.mysimplecleanarchitecture.di

import com.fransbudikashira.mysimplecleanarchitecture.data.IMessageDataSource
import com.fransbudikashira.mysimplecleanarchitecture.data.MessageDataSource
import com.fransbudikashira.mysimplecleanarchitecture.data.MessageRepository
import com.fransbudikashira.mysimplecleanarchitecture.domain.IMessageRepository
import com.fransbudikashira.mysimplecleanarchitecture.domain.MessageInteractor
import com.fransbudikashira.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}