module HackathonManagementSystem {
    
    // This line grants access to the Swing GUI classes (JFrame, JButton, etc.)
    requires java.desktop; 

    // Optional: If your GUI or application code needs to use JavaFX 
    // (though you are currently using Swing, so this is unlikely but good to know)
    // requires javafx.controls; 
    // requires javafx.fxml; 
    
    // You may also need to open packages if you use Reflection (advanced MVC/Spring)
    // opens application to javafx.fxml;
}