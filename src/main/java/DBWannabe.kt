import com.elbekD.bot.types.InlineQueryResultAudio

object DBWannabe {
    private const val baseUrl = "http://soundboard.ass-we-can.com"
    private val content = listOf(
            ResultWithSearchQuery(InlineQueryResultAudio("42837214-f6c7-4392-a0f0-a35d51ced16e", "$baseUrl/static/music/babyface/Do%20you%20like%20watching%20me.mp3", "Do you like watching me"), "do you like watching me"),
            ResultWithSearchQuery(InlineQueryResultAudio("28024ceb-466e-4dde-a04e-3d3cc56e2d14", "$baseUrl/static/music/babyface/On%20the%20house.mp3", "On the house"), "on the house"),
            ResultWithSearchQuery(InlineQueryResultAudio("5a33af6a-ed04-4704-ac33-37bcbe459b6f", "$baseUrl/static/music/babyface/Playing%20with%20fire.mp3", "Playing with fire"), "playing with fire"),
            ResultWithSearchQuery(InlineQueryResultAudio("1213cc63-a993-45dc-9915-abb000d411b5", "$baseUrl/static/music/babyface/RIP%20ears.mp3", "RIP ears"), "rip ears"),
            ResultWithSearchQuery(InlineQueryResultAudio("20727885-494a-478b-94be-9d31b5f265a5", "$baseUrl/static/music/babyface/She%20gave%20me%20quite%20a%20show.mp3", "She gave me quite a show"), "she gave me quite a show"),
            ResultWithSearchQuery(InlineQueryResultAudio("d9b6b3d7-b895-4f92-b3d7-48ce70894d6c", "$baseUrl/static/music/babyface/The%20semen%20arsonist.mp3", "The semen arsonist"), "the semen arsonist"),
            ResultWithSearchQuery(InlineQueryResultAudio("cc150ffa-41bc-438d-b740-58b1e2f3d469", "$baseUrl/static/music/babyface/Why%20don't%20you%20get%20fucked.mp3", "Why don't you get fucked"), "why dont you get fucked"),
            ResultWithSearchQuery(InlineQueryResultAudio("339ae598-81de-48f8-8607-51b4f6ee8032", "$baseUrl/static/music/babyface/You%20get%20mad.mp3", "You get mad"), "you get mad"),
            ResultWithSearchQuery(InlineQueryResultAudio("e2d47e68-b1ad-4dd3-96e8-c83219e02572", "$baseUrl/static/music/BillyH/AAAAAAAH.mp3", "AAAAAAAH"), "aaaaaaah"),
            ResultWithSearchQuery(InlineQueryResultAudio("a8ba150b-436c-42cb-805c-7b7fa1656665", "$baseUrl/static/music/BillyH/Another%20victim.mp3", "Another victim"), "another victim"),
            ResultWithSearchQuery(InlineQueryResultAudio("646eb892-98e1-414c-b501-4896cb676536", "$baseUrl/static/music/BillyH/Ass%20we%20can.mp3", "Ass we can"), "ass we can"),
            ResultWithSearchQuery(InlineQueryResultAudio("906224e4-9687-4eb4-aae2-224b15c3b0fb", "$baseUrl/static/music/BillyH/At%20least%20it%20smells%20like%20it.mp3", "At least it smells like it"), "at least it smells like it"),
            ResultWithSearchQuery(InlineQueryResultAudio("29262b4c-b90c-4943-9134-7a906e60fcb3", "$baseUrl/static/music/BillyH/ATTEEEN-TION.mp3", "ATTEEEN-TION"), "attention"),
            ResultWithSearchQuery(InlineQueryResultAudio("3e41f6a3-41de-40f3-885c-105887858c10", "$baseUrl/static/music/BillyH/Bet%20your%20ass.mp3", "Bet your ass"), "bet your ass"),
            ResultWithSearchQuery(InlineQueryResultAudio("741e624b-a78b-43cd-bf82-5377968fc5da", "$baseUrl/static/music/BillyH/Big%20surprise.mp3", "Big surprise"), "big surprise"),
            ResultWithSearchQuery(InlineQueryResultAudio("101b9e49-bf14-47bb-a374-646fa152b1a2", "$baseUrl/static/music/BillyH/Come%20on%20college%20boy.mp3", "Come on college boy"), "come on college boy"),
            ResultWithSearchQuery(InlineQueryResultAudio("9a610708-81ee-4349-8b10-cd29734097fd", "$baseUrl/static/music/BillyH/I'm%20taking%20that%20ass.mp3", "I'm taking that ass"), "im taking that ass"),
            ResultWithSearchQuery(InlineQueryResultAudio("a040e609-dd4e-47be-bfbb-10b202ce7495", "$baseUrl/static/music/BillyH/Ladies%20first.mp3", "Ladies first"), "ladies first"),
            ResultWithSearchQuery(InlineQueryResultAudio("78a934c2-2497-430f-a72e-d0a90632bef3", "$baseUrl/static/music/BillyH/Lash%20of%20the%20spanking.mp3", "Lash of the spanking"), "lash of the spanking"),
            ResultWithSearchQuery(InlineQueryResultAudio("8e79701c-b9d9-4ce7-9abd-112429116b60", "$baseUrl/static/music/BillyH/Like%20embarrassing%20me.mp3", "Like embarrassing me"), "like embarrassing me"),
            ResultWithSearchQuery(InlineQueryResultAudio("a2d759aa-8f69-4573-b284-ea70488b30a6", "$baseUrl/static/music/BillyH/Oh%20my%20shoulder.mp3", "Oh my shoulder"), "oh my shoulder"),
            ResultWithSearchQuery(InlineQueryResultAudio("214ec418-674b-49d4-8d39-61578c649819", "$baseUrl/static/music/BillyH/One%20more%20round.mp3", "One more round"), "one more round"),
            ResultWithSearchQuery(InlineQueryResultAudio("a124ca9b-595b-41e8-be97-9b50506ddb19", "$baseUrl/static/music/BillyH/Pull%20up%20our%20pants.mp3", "Pull up our pants"), "pull up our pants"),
            ResultWithSearchQuery(InlineQueryResultAudio("64cff3d6-831c-412c-9f31-0c143bc72466", "$baseUrl/static/music/BillyH/Six%20hot%20loads.mp3", "Six hot loads"), "six hot loads"),
            ResultWithSearchQuery(InlineQueryResultAudio("e4fad841-4da3-433b-be2a-f08e7d786d32", "$baseUrl/static/music/BillyH/Spank.mp3", "Spank"), "spank"),
            ResultWithSearchQuery(InlineQueryResultAudio("efdfe304-cbc3-4074-a5c4-56a0d0a468f7", "$baseUrl/static/music/BillyH/That's%20power%20son.mp3", "That's power son"), "thats power son"),
            ResultWithSearchQuery(InlineQueryResultAudio("c1ac34c8-cfea-4754-9c17-d8f0baf6b957", "$baseUrl/static/music/BillyH/The%20other%20night.mp3", "The other night"), "the other night"),
            ResultWithSearchQuery(InlineQueryResultAudio("0b8ea570-9dc7-430f-9ca8-1b688b94af95", "$baseUrl/static/music/BillyH/The%20point%20you%20wanna%20be.mp3", "The point you wanna be"), "the point you wanna be"),
            ResultWithSearchQuery(InlineQueryResultAudio("1263373c-e2d7-4dc2-9073-8598d777b2f1", "$baseUrl/static/music/BillyH/What%20the%20hell%20are%20you%20two%20doing.mp3", "What the hell are you two doing"), "what the hell are you two doing"),
            ResultWithSearchQuery(InlineQueryResultAudio("5ea342b5-9490-4761-9bbe-59ed824eba47", "$baseUrl/static/music/BillyH/Work%20that%20tool.mp3", "Work that tool"), "work that tool"),
            ResultWithSearchQuery(InlineQueryResultAudio("d7a4705e-94ac-4694-ac85-8a1fcdc298fd", "$baseUrl/static/music/BillyH/You%20can%20go%20now.mp3", "You can go now"), "you can go now"),
            ResultWithSearchQuery(InlineQueryResultAudio("f0be7958-6db6-4f44-a274-2125ba7856e0", "$baseUrl/static/music/BillyH/You%20got%20me%20mad%20now.mp3", "You got me mad now"), "you got me mad now"),
            ResultWithSearchQuery(InlineQueryResultAudio("598320e8-4e56-4192-ab92-6bab3cd9b4a5", "$baseUrl/static/music/BillyH/You%20like%20challenges.mp3", "You like challenges"), "you like challenges"),
            ResultWithSearchQuery(InlineQueryResultAudio("230ea05a-c36f-4cac-9761-aeafa838a289", "$baseUrl/static/music/BillyH/You%20like%20that.mp3", "You like that"), "you like that"),
            ResultWithSearchQuery(InlineQueryResultAudio("a46205e8-534a-4179-81ee-cd1b0aa00aa5", "$baseUrl/static/music/BillyH/You%20ripped%20my%20fucking%20pants.mp3", "You ripped my fucking pants"), "you ripped my fucking pants"),
            ResultWithSearchQuery(InlineQueryResultAudio("ec3a6327-760b-4378-a686-e385f3780113", "$baseUrl/static/music/Brother/An%20ass%20I%20wouldn't%20mind%20fucking.mp3", "An ass I wouldn't mind fucking"), "an ass i wouldnt mind fucking"),
            ResultWithSearchQuery(InlineQueryResultAudio("b50543ff-911c-4d68-9b23-c9d06460f3e4", "$baseUrl/static/music/Brother/I%20love%20fire.mp3", "I love fire"), "i love fire"),
            ResultWithSearchQuery(InlineQueryResultAudio("7f7bc78b-c997-41fe-a719-d229e61c3ae6", "$baseUrl/static/music/Brother/It%20turns%20me%20on.mp3", "It turns me on"), "it turns me on"),
            ResultWithSearchQuery(InlineQueryResultAudio("ec2fbd50-4f46-430a-b64d-7a1593255e33", "$baseUrl/static/music/Brother/It's%20a%20loan.mp3", "It's a loan"), "its a loan"),
            ResultWithSearchQuery(InlineQueryResultAudio("51b05fc4-1244-4dfe-be3f-12e8a2f74dea", "$baseUrl/static/music/Kazuya/Oh%20ho%20ho%20ganging%20up.mp3", "Oh ho ho ganging up"), "oh ho ho ganging up"),
            ResultWithSearchQuery(InlineQueryResultAudio("5622e241-bb87-40d2-8fcb-e913897b9b04", "$baseUrl/static/music/Kazuya/So%20how%20you%20feeling.mp3", "So how you feeling"), "so how you feeling"),
            ResultWithSearchQuery(InlineQueryResultAudio("777146d8-8948-420d-900c-669f8a7cbd8d", "$baseUrl/static/music/Kazuya/Two%20can%20play%20it.mp3", "Two can play it"), "two can play it"),
            ResultWithSearchQuery(InlineQueryResultAudio("2ab1a416-9c68-4df3-bf26-4d75974c13b7", "$baseUrl/static/music/MarkW/Beat%20me%201%202%203.mp3", "Beat me 1 2 3"), "beat me 1 2 3"),
            ResultWithSearchQuery(InlineQueryResultAudio("bd155859-50bd-45ca-abeb-81ee7fbaf623", "$baseUrl/static/music/MarkW/Boss%20of%20this%20gym.mp3", "Boss of this gym"), "boss of this gym"),
            ResultWithSearchQuery(InlineQueryResultAudio("5a852b2b-19b3-46f3-863f-e70387e1cfef", "$baseUrl/static/music/MarkW/Come%20on.mp3", "Come on"), "come on"),
            ResultWithSearchQuery(InlineQueryResultAudio("312f5884-dbe9-46bf-a1e4-5c2dc30eb4eb", "$baseUrl/static/music/MarkW/Fuck%20you%20leather%20man.mp3", "Fuck you leather man"), "fuck you leather man"),
            ResultWithSearchQuery(InlineQueryResultAudio("76573f90-d198-4f1b-a872-080806501020", "$baseUrl/static/music/MarkW/Go%20another%20round.mp3", "Go another round"), "go another round"),
            ResultWithSearchQuery(InlineQueryResultAudio("b5d74810-f730-4621-91b4-1605eae85f8f", "$baseUrl/static/music/MarkW/Jabroni%20outfit.mp3", "Jabroni outfit"), "jabroni outfit"),
            ResultWithSearchQuery(InlineQueryResultAudio("e151814f-c2e0-4a23-b1c4-a21f4256856f", "$baseUrl/static/music/MarkW/Knocked%20out%20some%20jabroni.mp3", "Knocked out some jabroni"), "knocked out some jabroni"),
            ResultWithSearchQuery(InlineQueryResultAudio("8d8d7509-a9b1-4bc2-9d5f-e30488c74cee", "$baseUrl/static/music/MarkW/Let's%20give%20it%20a%20go.mp3", "Let's give it a go"), "lets give it a go"),
            ResultWithSearchQuery(InlineQueryResultAudio("a7cd2767-e26c-4a2d-8d95-109529f095cc", "$baseUrl/static/music/MarkW/Settle%20it.mp3", "Settle it"), "settle it"),
            ResultWithSearchQuery(InlineQueryResultAudio("eeac34f1-39f6-407b-a979-f8da56b3ce57", "$baseUrl/static/music/MarkW/Wrong%20door.mp3", "Wrong door"), "hey buddy i think youve got the wrong door"),
            ResultWithSearchQuery(InlineQueryResultAudio("c4f54b23-2a47-47b1-ad5f-cab6051e1cff", "$baseUrl/static/music/Ripped/It%20gets%20bigger%20when%20I%20pull.mp3", "It gets bigger when I pull"), "it gets bigger when i pull"),
            ResultWithSearchQuery(InlineQueryResultAudio("b31f35b7-6273-441e-83b1-ee4384045a3d", "$baseUrl/static/music/Ripped/Our%20daddy%20told%20us.mp3", "Our daddy told us"), "our daddy told us not to be ashamed of our dicks"),
            ResultWithSearchQuery(InlineQueryResultAudio("38fe8453-5b4e-491c-b927-830c83437101", "$baseUrl/static/music/Ripped/Rip%20the%20skin.mp3", "Rip the skin"), "rip the skin"),
            ResultWithSearchQuery(InlineQueryResultAudio("fb8abf57-3826-47d9-883a-bb72db8ad90a", "$baseUrl/static/music/Ripped/Sorry%20for%20what.mp3", "Sorry for what"), "sorry for what"),
            ResultWithSearchQuery(InlineQueryResultAudio("b0ef7aa5-c7f7-4591-8cf5-80526e26ecc1", "$baseUrl/static/music/Slave/Oh%20Oh%20Aaah%20Ah.mp3", "Oh Oh Aaah Ah"), "oh oh aaah ah"),
            ResultWithSearchQuery(InlineQueryResultAudio("0cf52e5b-95dc-4b96-935c-20ad6a3ed285", "$baseUrl/static/music/Slave/Thank%20you%20sir.mp3", "Thank you sir"), "thank you sir"),
            ResultWithSearchQuery(InlineQueryResultAudio("64280417-deec-4e30-bb2a-3d76f0f863fe", "$baseUrl/static/music/Slave/Yes%20sir.mp3", "Yes sir"), "yes sir"),
            ResultWithSearchQuery(InlineQueryResultAudio("9b6c1530-beda-4232-99e0-a59994f32ac2", "$baseUrl/static/music/Unripped/It's%20macabre!.mp3", "It's macabre!"), "its macabre"),
            ResultWithSearchQuery(InlineQueryResultAudio("11dcde0c-0b4b-4d1c-9cef-8ba10caced50", "$baseUrl/static/music/Unripped/Mmmmh.mp3", "Mmmmh"), "mmmmh"),
            ResultWithSearchQuery(InlineQueryResultAudio("3f99f6c8-d1e2-4310-b4df-b55fad5475f9", "$baseUrl/static/music/Unripped/Right%20happy%20to.mp3", "Right happy to"), "right happy to"),
            ResultWithSearchQuery(InlineQueryResultAudio("098af13d-82be-4134-9331-8a7fad8cc421", "$baseUrl/static/music/Unripped/Sorry.mp3", "Sorry"), "oh shit im sorry"),
            ResultWithSearchQuery(InlineQueryResultAudio("8a67ee65-8ecf-49f5-b37f-30ef86ea9b2c", "$baseUrl/static/music/Unripped/Without%20further%20interruption.mp3", "Without further interruption"), "without further interruption lets celebrate and suck some dick"),
            ResultWithSearchQuery(InlineQueryResultAudio("55856340-a72c-48ce-adc5-e11f0be65817", "$baseUrl/static/music/VanD/Boy%20next%20door.mp3", "Boy next door"), "boy next door"),
            ResultWithSearchQuery(InlineQueryResultAudio("8d5335de-bfa5-4d03-9afd-765d2f9e0b2c", "$baseUrl/static/music/VanD/Deep%20dark%20fantasies.mp3", "Deep dark fantasies"), "deep dark fantasies"),
            ResultWithSearchQuery(InlineQueryResultAudio("534ec713-73eb-4ed6-be72-56e73772d3a5", "$baseUrl/static/music/VanD/Do%20you%20like%20what%20you%20see.mp3", "Do you like what you see"), "do you like what you see"),
            ResultWithSearchQuery(InlineQueryResultAudio("5889dba1-d8dd-4b0d-8adc-1bdf9b66ac6b", "$baseUrl/static/music/VanD/Dungeon%20master.mp3", "Dungeon master"), "dungeon master"),
            ResultWithSearchQuery(InlineQueryResultAudio("61d819c6-7803-41cb-a5e3-324aaaa3a7ed", "$baseUrl/static/music/VanD/Fisting%20is%20300.mp3", "Fisting is 300"), "fisting is 300"),
            ResultWithSearchQuery(InlineQueryResultAudio("3015e671-1883-41ff-b50d-ce74f7ebe69c", "$baseUrl/static/music/VanD/Fuck%20you.mp3", "Fuck you"), "fuck you"),
            ResultWithSearchQuery(InlineQueryResultAudio("d07dd76e-454e-4a4d-b176-bb175891c8c3", "$baseUrl/static/music/VanD/Fucking%20cumming.mp3", "Fucking cumming"), "fucking cumming"),
            ResultWithSearchQuery(InlineQueryResultAudio("7057bcca-fb81-4f9f-b99d-5bf09e5577d7", "$baseUrl/static/music/VanD/FUCKYOU.mp3", "FUCKYOU"), "fuck you"),
            ResultWithSearchQuery(InlineQueryResultAudio("12a398c3-e014-49d7-b105-dce54d8f474b", "$baseUrl/static/music/VanD/Full%20master.mp3", "Full master"), "full master"),
            ResultWithSearchQuery(InlineQueryResultAudio("e5e72998-11e1-4442-8f57-2961c1ce4264", "$baseUrl/static/music/VanD/I%20don't%20do%20anal.mp3", "I don't do anal"), "i dont do anal"),
            ResultWithSearchQuery(InlineQueryResultAudio("4ce5802a-dc36-4385-8861-5a31c1382ed0", "$baseUrl/static/music/VanD/It's%20bondage,%20gay%20website.mp3", "It's bondage, gay website"), "its bondage gay website"),
            ResultWithSearchQuery(InlineQueryResultAudio("72a4a19a-236b-48a4-bb86-808264aad127", "$baseUrl/static/music/VanD/It's%20so%20fucking%20deep.mp3", "It's so fucking deep"), "its so fucking deep"),
            ResultWithSearchQuery(InlineQueryResultAudio("4c41903f-103a-4b4f-9bc3-63c543ba0118", "$baseUrl/static/music/VanD/Lube%20it%20up.mp3", "Lube it up"), "lube it up"),
            ResultWithSearchQuery(InlineQueryResultAudio("867d69d4-9c90-4b67-bb9b-8ef390bbddc8", "$baseUrl/static/music/VanD/Penetration%201.mp3", "Penetration 1"), "penetration 1"),
            ResultWithSearchQuery(InlineQueryResultAudio("218cd9c6-820f-47b2-a47d-e80f77b69744", "$baseUrl/static/music/VanD/Penetration%202.mp3", "Penetration 2"), "penetration 2"),
            ResultWithSearchQuery(InlineQueryResultAudio("0540ad1c-303a-416a-9d2a-0b614d4bb891", "$baseUrl/static/music/VanD/Penetration%203.mp3", "Penetration 3"), "penetration 3"),
            ResultWithSearchQuery(InlineQueryResultAudio("069d91c0-9899-4ea1-a174-27b5e49d8da8", "$baseUrl/static/music/VanD/Penetration%204.mp3", "Penetration 4"), "penetration 4"),
            ResultWithSearchQuery(InlineQueryResultAudio("94d89e82-da47-425f-931e-ad1ed2c724b4", "$baseUrl/static/music/VanD/Performance%20artist.mp3", "Performance artist"), "performance artist"),
            ResultWithSearchQuery(InlineQueryResultAudio("f90bcb0c-a61e-4ed4-bc6a-a21ede013b98", "$baseUrl/static/music/VanD/Shut%20the%20fuck%20up%20boy.mp3", "Shut the fuck up boy"), "shut the fuck up boy"),
            ResultWithSearchQuery(InlineQueryResultAudio("95f5062e-2045-471c-8e1f-2b2ab701125d", "$baseUrl/static/music/VanD/Slaves%20get%20your%20ass%20back%20here.mp3", "Slaves get your ass back here"), "fucking slaves get your asses back here"),
            ResultWithSearchQuery(InlineQueryResultAudio("0421c228-8001-4fa6-835c-376cfae80d93", "$baseUrl/static/music/VanD/Spit%20-%20YEAAAH.mp3", "Spit - YEAAAH"), "spit yeaaah"),
            ResultWithSearchQuery(InlineQueryResultAudio("b77cb49b-4096-41f5-bd88-eb8a0d0e52e2", "$baseUrl/static/music/VanD/Stick%20your%20finger.mp3", "Stick your finger"), "stick your finger"),
            ResultWithSearchQuery(InlineQueryResultAudio("07dd3e2c-138d-4246-8278-3288c665d55d", "$baseUrl/static/music/VanD/Suction.mp3", "Suction"), "suction"),
            ResultWithSearchQuery(InlineQueryResultAudio("8a8ded2f-f7e9-46df-bcd2-bac9511ba12c", "$baseUrl/static/music/VanD/Swallow%20my%20cum.mp3", "Swallow my cum"), "swallow my cum"),
            ResultWithSearchQuery(InlineQueryResultAudio("a1823947-2de5-452b-8371-0900d5eb28e9", "$baseUrl/static/music/VanD/Take%20it%20boy.mp3", "Take it boy"), "take it boy"),
            ResultWithSearchQuery(InlineQueryResultAudio("467634a3-1d9d-481e-b141-0e8ea463c63b", "$baseUrl/static/music/VanD/That%20turns%20me%20on.mp3", "That turns me on"), "that turns me on"),
            ResultWithSearchQuery(InlineQueryResultAudio("56b5531b-43ad-47ef-ba05-5e21dc2594b3", "$baseUrl/static/music/VanD/That's%20amazing.mp3", "That's amazing"), "thats amazing"),
            ResultWithSearchQuery(InlineQueryResultAudio("19b5cacf-dfac-46f8-9f5a-7d9ee6b73d89", "$baseUrl/static/music/VanD/WOO.mp3", "WOO"), "woo")
    )

    private val alphaNumRegex = Regex("[^A-Za-z0-9 ]")
    private val spaceRegex = Regex("\\s+")

    fun findByQuery(query: String): List<InlineQueryResultAudio> {
        val processedQuery = query
                .replace(spaceRegex, " ")
                .replace(alphaNumRegex, "")
        return content.filter { it.searchQuery.contains(processedQuery) }.map { it.resultAudio }
    }
    
    private data class ResultWithSearchQuery(
            val resultAudio: InlineQueryResultAudio,
            val searchQuery: String
    )
}
