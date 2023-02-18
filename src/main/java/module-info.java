module com.calc.calc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calc.calc to javafx.fxml;
    exports com.calc.calc;
}