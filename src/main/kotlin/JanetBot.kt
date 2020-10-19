import com.jessecorbett.diskord.dsl.*
import com.jessecorbett.diskord.util.authorId
import com.jessecorbett.diskord.util.words
import kotlinx.coroutines.delay


var token = Config.prop.getProperty("BOT_TOKEN")


val pearlsults = listOf("You're old news","Okay boomer.","I had more screen time in season one than you did your entire series", "I could run circles around you", "No u", "So original", "Terry your bot is malfuctioning, better put it out of it's misery", "Cry more", "God you're adorable. Adorably stupid", "Check please, I don't want to catch her stupid", "I can't believe I'm related to you")
  suspend  fun main(args: Array<String>) {
      bot(token) {

            commands(".") { // "." is the default, but is provided here anyway for example purposes
                command("echo") {
                    this reply this.words.drop(1).joinToString(" ")
                }
                // Like echo, but deletes the command message
                command("say") {
                    this replyAndDelete this.words.drop(1).joinToString(" ")
                }
                command("truth") {
                    this reply ("A spectre is haunting Europe — the spectre of communism. All the powers of old Europe have entered into a holy alliance to exorcise this spectre: Pope and Tsar, Metternich and Guizot, French Radicals and German police-spies.\n" +
                            "\n" +
                            "Where is the party in opposition that has not been decried as communistic by its opponents in power? Where is the opposition that has not hurled back the branding reproach of communism, against the more advanced opposition parties, as well as against its reactionary adversaries?")
                }
                command("cat") {
                    delete()
                    reply {
                        text = "What a cute cat!"
                        image("https://64.media.tumblr.com/5abba26bb28311f4390fc30793f1c4ab/tumblr_oeuhvizsIv1v56zzqo1_1280.jpg") {
                            imageWidth = 200
                            imageHeight = 300
                        }
                    }
                }
            }
        }
    }
