import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Comp1050Calculator extends Application implements Initializable {
	@FXML
	Button button1;
	@FXML
	Button button2;
	@FXML
	Button button3;
	@FXML
	Button button4;
	@FXML
	Button button5;
	@FXML
	Button buttonAdd;
	@FXML
	Button buttonEquals;

	@FXML
	TextField numberId;
	
	private String currentNumber=new String();
	private ArrayList<Integer>numbers = new ArrayList<Integer>();
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("/resource/Comp1050Calculator.fxml"));
		final Pane p = loader.load();

		primaryStage.setScene(new Scene(p));
		primaryStage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				currentNumber+="1";
				numberId.setText(currentNumber);
			}
		});
		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				currentNumber+="2";
				numberId.setText(currentNumber);
			}
		});
		button3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				currentNumber+="3";
				numberId.setText(currentNumber);
			}
		});
		button4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				currentNumber+="4";
				numberId.setText(currentNumber);
			}
		});
		button5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				currentNumber+="5";
				numberId.setText(currentNumber);
			}
		});
		buttonAdd.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				numbers.add(Integer.parseInt(currentNumber));
				currentNumber="";
				numberId.setText(currentNumber);
			}
		});
		buttonEquals.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				numbers.add(Integer.parseInt(currentNumber));
				currentNumber="";
				numberId.setText(currentNumber);
				int answer = numbers.get(0) + numbers.get(1);
				currentNumber += answer;
				numberId.setText(currentNumber);
			}
		});
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
