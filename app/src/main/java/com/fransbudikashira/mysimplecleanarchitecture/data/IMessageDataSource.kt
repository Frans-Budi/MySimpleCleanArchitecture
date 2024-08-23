package com.fransbudikashira.mysimplecleanarchitecture.data

import com.fransbudikashira.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}