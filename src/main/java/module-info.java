module com.example.moneymate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moneymate to javafx.fxml;
    exports com.example.moneymate;
}