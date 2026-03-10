
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TemperatureConverterController {
    @FXML
    private TextField celsiusField;

    @FXML
    private Label resultLabel;

    @FXML
    public void convertTemperature() {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = celsius * 9 / 5 + 32;
            resultLabel.setText(String.format("Kết quả: %.2f °F", fahrenheit));
        } catch (NumberFormatException e) {
            resultLabel.setText("Lỗi: Vui lòng nhập số hợp lệ!");
        }
    }
}