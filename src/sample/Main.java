package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main extends Application {

    Button selectFile;
    Text currentStates;
    Text statesChain;
    Text correctNumbers;

    Controller controller;
    private File[] files;
    private String[] numbers;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        controller = new Controller();

        selectFile = (Button) root.lookup("#select_file");
        currentStates = (Text) root.lookup("#current_states");
        statesChain = (Text) root.lookup("#states_chain");
        correctNumbers = (Text) root.lookup("#correct_numbers");

        selectFile.setOnAction(event -> {
            selectFile.setDisable(true);
            FileDialog dialog = new FileDialog((Frame) null, "Select File to Open");
            dialog.setMode(FileDialog.LOAD);
            dialog.setVisible(true);
            files = dialog.getFiles();
            readFile();
            selectFile.setDisable(false);
        });


        primaryStage.setTitle("NFA");
        primaryStage.setScene(new Scene(root, 650, 500));
        primaryStage.show();
    }

    private void readFile() {
        String line;
        String wholeFile = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(files[0]));
            while ((line = br.readLine()) != null)
                wholeFile += line;

            numbers = wholeFile.split(Pattern.quote(":"));
            checkLoadedNumbers();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void checkLoadedNumbers() {
        for (String number : numbers) {
            statesChain.setText(statesChain.getText() + "[ " + number + ": ");
            for (int i = 0; i < number.length(); i++) {
                controller.updateCurrentStates(Sign.valueOfSign(number.charAt(i) + ""));
                currentStates.setText(controller.getCurrentStates());
                String chain = statesChain.getText();
                chain += " -> (" + controller.getCurrentStates() + ")";
                statesChain.setText(chain);
            }

            if (controller.isPassed()) {
                String correctNumbersText = correctNumbers.getText();
                if (!correctNumbersText.isEmpty())
                    correctNumbersText += "\n";
                correctNumbersText += number;
                correctNumbers.setText(correctNumbersText);
            }
            controller.reset();
            resetView();
        }

    }

    private void resetView() {
        currentStates.setText("");
        statesChain.setText(statesChain.getText() + " ]\n");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
