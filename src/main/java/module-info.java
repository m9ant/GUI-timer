module com.calc.calc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.timer to javafx.fxml;
    exports com.timer;
}