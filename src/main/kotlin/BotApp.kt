package dev

import bot.InstagramBot
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import java.io.FileInputStream
import java.util.*

const val FILENAME_WITH_SETTINGS: String = "settings.txt"


@InternalCoroutinesApi
@ExperimentalCoroutinesApi
fun main() = runBlocking {
    println("Hello, i'm an 1nstagr@m b0t!")

    val props = Properties()
    val fis = FileInputStream("settings.txt")
    fis.use {
        props.load(fis)
    }

    val username = props.getProperty("username")
    val password = props.getProperty("password")

    println(username)
    println(password)

    val bot = InstagramBot()
    //bot.prepare(username)
    //bot.login(username, password)

}