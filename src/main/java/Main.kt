import com.elbekD.bot.Bot

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val bot = Bot.createPolling(args[0], args[1])

            bot.onInlineQuery { inlineQuery ->
                val text = inlineQuery.query
                val results = DBWannabe.findByQuery(text)
                bot.answerInlineQuery(inlineQuery.id, results)
            }
            bot.start()
        }
    }
}