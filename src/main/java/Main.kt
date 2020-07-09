import com.elbekD.bot.Bot
import com.elbekD.bot.http.await
import java.util.logging.Level
import java.util.logging.Logger

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val logger = Logger.getLogger("Main")
            val bot = Bot.createPolling(args[0], args[1])

            bot.onInlineQuery { inlineQuery ->
                val text = inlineQuery.query
                val results = DBWannabe.findByQuery(text).take(50)
                try {
                    bot.answerInlineQuery(inlineQuery.id, results, cacheTime = 0).await()
                } catch (e: Exception) {
                    logger.log(Level.SEVERE, "User input: $text", e)
                }
            }
            bot.start()
        }
    }
}