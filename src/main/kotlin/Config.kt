import java.io.File
import java.io.FileInputStream
import java.util.*

class Config {

    companion object {
        private val file = File("botconfig.properties")

        val prop = Properties()
        init {
            prop.load(FileInputStream(file))
        }
    }

}