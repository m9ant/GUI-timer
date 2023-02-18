module com.calc.calc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calc to javafx.fxml;
    exports com.calc;
}