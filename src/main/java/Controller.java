import com.pi4j.io.gpio.*;
import javafx.fxml.FXML;

/**
 * Created by Vlad on 07/09/2017.
 */
public class Controller {
    private GpioController pinController;
    private GpioPinDigitalOutput LEDpin;

    public Controller() {
        pinController = GpioFactory.getInstance();
        LEDpin = pinController.provisionDigitalOutputPin(RaspiPin.GPIO_08, PinState.LOW);
    }

    @FXML
    private void ledButtonClicked(){
        LEDpin.toggle();
    }

    @FXML
    private void exitButtonClicked(){
        System.exit(1);
    }
}
