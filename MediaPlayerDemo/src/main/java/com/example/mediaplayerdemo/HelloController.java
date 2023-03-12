package com.example.mediaplayerdemo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    private Label welcomeText1;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello! I'm Deniz, and I have a great solution for people to be way more " +
                "focused on their work while attending educational purposes.");
    }
    @FXML
    protected void button2() {
        welcomeText.setText("Especially after covid, our attention spans have decreased exponentially and \n" +
                "it just is very hard to focus on things like classes on a daily basis.");
    }
    @FXML
    protected void button3() {
        welcomeText.setText("Personally, I start losing my mind if I have to stand still for more than 5 seconds! \n" +
"I easily lose interest in my studies, also get bored veery easily on anything. \n" +
"Yesterday, my girlfriend was talking about how much problems we had in our relationship, but all I could think about \n" +
"was how much I wanted to play valorant! \n" +
                " So, to fix this, I have a GREAT solution!!:");
    }
    @FXML
    protected void sceneChange() {
        welcomeText.setText("https://www.youtube.com/watch?v=FXckmIoiIBs \n" +
                "\n" +
                "\n" +
                "(what do you call a fish with no eyes? a fsh!! Entertainment is the key to uninterrupted focus.");
    }

    @FXML
    protected void okdone() throws Exception {
        //Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=FXckmIoiIBs"));
        Hyperlink link = new Hyperlink("https://www.youtube.com/watch?v=FXckmIoiIBs");
        TilePane root = new TilePane();
        root.getChildren().add(link);
        ImageView image = new ImageView("https://newsroom.unsw.edu.au/sites/default/files/thumbnails/image/3500028168_c85a03256a_b_2.jpg");
        welcomeText.setText("https://www.youtube.com/watch?v=FXckmIoiIBs");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}