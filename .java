import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Calculator extends Application {
// Override the start method
@Override
public void start(Stage primaryStage) {
FlowPane pane = new FlowPane();
pane.setHgap(2);
pane.setVgap(5);
pane.setAlignment(Pos.CENTER);
TextField tfNumber1 = new TextField();
TextField tfNumber2 = new TextField();
TextField tfResult = new TextField();
tfResult.setEditable(false);
tfResult.setPrefColumnCount(15);
pane.getChildren().addAll(new Label("Number 1: "), tfNumber1, new Label("Number 2: "), tfNumber2, new Label("Result: "), tfResult);
Button butAdd = new Button("Add");
Button butSubtract = new Button("Subtract");
Button butMultiply = new Button("Multiply");
Button butDivide = new Button("Divide");
pane.getChildren().addAll(butAdd, butSubtract, butMultiply, butDivide);
Scene scene = new Scene(pane, 200, 200);
primaryStage.setTitle("Calculator");
primaryStage.setScene(scene);
primaryStage.show();
butAdd.setOnAction(e -> {
tfResult.setText(Double.parseDouble(tfNumber1.getText()) +
Double.parseDouble(tfNumber2.getText()) + "");
});
butSubtract.setOnAction(e -> {
tfResult.setText(Double.parseDouble(tfNumber1.getText()) -
Double.parseDouble(tfNumber2.getText()) + "");
});
butMultiply.setOnAction(e -> {
tfResult.setText(Double.parseDouble(tfNumber1.getText()) *
Double.parseDouble(tfNumber2.getText()) + "");
});
butDivide.setOnAction(e -> {
tfResult.setText(Double.parseDouble(tfNumber1.getText()) /
Double.parseDouble(tfNumber2.getText()) + "");
});
}
public static void main(String[] args) {
launch(args);
}
}
