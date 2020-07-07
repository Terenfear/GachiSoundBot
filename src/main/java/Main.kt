import IdStorage.TOKEN
import IdStorage.USERNAME
import com.elbekD.bot.Bot

fun main() {
    val bot = Bot.createPolling(USERNAME, TOKEN)

    bot.onInlineQuery { inlineQuery ->
        val text = inlineQuery.query
        val results = DBWannabe.findByQuery(text)
        bot.answerInlineQuery(inlineQuery.id, results)
    }
    bot.start()
}