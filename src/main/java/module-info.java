module com.oop.mahadi.demo3choisbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demo3choisbox to javafx.fxml;
    exports com.oop.mahadi.demo3choisbox;
}