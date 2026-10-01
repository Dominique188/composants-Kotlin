import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.scene.layout.Pane

class Main : Application() {
    override fun start(stage: Stage) {

        val panneau = Pane()
        val scene = Scene(panneau, 600.0, 400.0)

        stage.scene = scene
        stage.title = "Composants graphiques"
        stage.show()

    }
}

fun main() {
    Application.launch(Main::class.java)
}