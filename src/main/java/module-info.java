module com.example.mathiasfunnycam {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.media;

    //requires jmf;

    opens com.example.mathiasfunnycam to javafx.fxml;
    exports com.example.mathiasfunnycam;
}