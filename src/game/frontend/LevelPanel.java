package game.frontend;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class LevelPanel extends BorderPane{
    private Label scoreLabel;
    private Label levelLabel;
    private Label movesLabel;
    private long movesLeft;

    public LevelPanel(String level,long score, long movesLeft ) {
        setStyle("-fx-background-color: #ff5bdd");
        levelLabel = new Label(level);
        levelLabel.setAlignment(Pos.CENTER_LEFT);
        levelLabel.setStyle("-fx-font-size: 18");
        setTop(levelLabel);
        scoreLabel = new Label(String.format("Required Score: %d",score));
        scoreLabel.setAlignment(Pos.CENTER_LEFT);
        scoreLabel.setStyle("-fx-font-size: 18");
        setLeft(scoreLabel);
        this.movesLeft = movesLeft;
        movesLabel = new Label(String.format("Moves Left: %d",movesLeft));
        movesLabel.setAlignment(Pos.CENTER_LEFT);
        movesLabel.setStyle("-fx-font-size: 18");
        setBottom(movesLabel);
    }
    public void updateMoves(){movesLabel.setText(String.format("Moves Left: %d",--movesLeft));
    }

}
