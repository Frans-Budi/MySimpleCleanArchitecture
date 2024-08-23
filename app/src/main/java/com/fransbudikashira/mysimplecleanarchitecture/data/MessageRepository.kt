package com.fransbudikashira.mysimplecleanarchitecture.data

import com.fransbudikashira.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(
    private val messageDataSource: IMessageDataSource
): IMessageRepository {
    override fun getWelcomeMessage(name: String) =
        messageDataSource.getMessageFromSource(name)
}