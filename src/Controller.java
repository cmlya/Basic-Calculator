import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML Button zeroButton = new Button();
    @FXML Button oneButton = new Button();
    @FXML Button twoButton = new Button();
    @FXML Button threeButton = new Button();
    @FXML Button fourButton = new Button();
    @FXML Button fiveButton = new Button();
    @FXML Button sixButton = new Button();
    @FXML Button sevenButton = new Button();
    @FXML Button eightButton = new Button();
    @FXML Button nineButton = new Button();
    @FXML Button signButton = new Button();
    @FXML Button decimalButton = new Button();
    @FXML Button equalsButton = new Button();
    @FXML Button plusButton = new Button();
    @FXML Button minusButton = new Button();
    @FXML Button multiplyButton = new Button();
    @FXML Button divideButton = new Button();
    @FXML Button backspaceButton = new Button();
    @FXML Button sqrtButton = new Button();
    @FXML Button squareButton = new Button();
    @FXML Button inverseButton = new Button();
    @FXML Button CButton = new Button();
    @FXML Button CEButton = new Button();
    @FXML Button percentButton = new Button();
    @FXML Label text = new Label();
    @FXML Label previousInput = new Label();

    String firstInput = "0";
    String secondInput = "0";
    String operation = "";

    private boolean onFirstInput = true;

    @FXML
    private void plusPressed() {
        operation = "addition";
        onFirstInput = false;
    }

    @FXML
    private void minusPressed() {
        operation = "subtraction";
        onFirstInput = false;
    }

    @FXML
    private void multiplyPressed() {
        operation = "multiplication";
        onFirstInput = false;
    }

    @FXML
    private void dividePressed() {
        operation = "division";
        onFirstInput = false;
    }

    @FXML
    private void zeroPressed() {
        if (onFirstInput) {
            if (!firstInput.equals("0")) {
                firstInput += 0;
            }
        }
        else {
            if (!secondInput.equals("0")) {
                secondInput += 0;
            }
        }
        updateText();
        printInputs();
    }

    @FXML
    private void onePressed() {
        if (onFirstInput) {
            if (firstInput.equals("0"))
                firstInput = "1";
            else firstInput += "1";
        }
        else {
            if (secondInput.equals("0"))
                secondInput = "1";
            else secondInput += "1";
        }
        updateText();
        printInputs();
    }

    @FXML
    private void twoPressed() {
        if (onFirstInput) {
            if (firstInput.equals("0"))
                firstInput = "2";
            else firstInput += "2";
        }
        else {
            if (secondInput.equals("0"))
                secondInput = "2";
            else secondInput += "2";
        }
        updateText();
        printInputs();
    }

    @FXML
    private void threePressed() {
        if (onFirstInput) {
            if (firstInput.equals("0"))
                firstInput = "3";
            else firstInput += "3";
        }
        else {
            if (secondInput.equals("0"))
                secondInput = "3";
            else secondInput += "3";
        }
        updateText();
        printInputs();
    }

    @FXML
    private void fourPressed() {
        if (onFirstInput) {
            if (firstInput.equals("0"))
                firstInput = "4";
            else firstInput += "4";
        }
        else {
            if (secondInput.equals("0"))
                secondInput = "4";
            else secondInput += "4";
        }
        updateText();
        printInputs();
    }

    @FXML
    private void fivePressed() {
        if (onFirstInput) {
            if (firstInput.equals("0"))
                firstInput = "5";
            else firstInput += "5";
        }
        else {
            if (secondInput.equals("0"))
                secondInput = "5";
            else secondInput += "5";
        }
        updateText();
        printInputs();
    }

    @FXML
    private void sixPressed() {
        if (onFirstInput) {
            if (firstInput.equals("0"))
                firstInput = "6";
            else firstInput += "6";
        }
        else {
            if (secondInput.equals("0"))
                secondInput = "6";
            else secondInput += "6";
        }
        updateText();
        printInputs();
    }

    @FXML
    private void sevenPressed() {
        if (onFirstInput) {
            if (firstInput.equals("0"))
                firstInput = "7";
            else firstInput += "7";
        }
        else {
            if (secondInput.equals("0"))
                secondInput = "7";
            else secondInput += "7";
        }
        updateText();
        printInputs();
    }

    @FXML
    private void eightPressed() {
        if (onFirstInput) {
            if (firstInput.equals("0"))
                firstInput = "8";
            else firstInput += "8";
        }
        else {
            if (secondInput.equals("0"))
                secondInput = "8";
            else secondInput += "8";
        }
        updateText();
        printInputs();
    }

    @FXML
    private void ninePressed() {
        if (onFirstInput) {
            if (firstInput.equals("0"))
                firstInput = "9";
            else firstInput += "9";
        }
        else {
            if (secondInput.equals("0"))
                secondInput = "9";
            else secondInput += "9";
        }
        updateText();
        printInputs();
    }

    @FXML
    private void decimalPressed() {
        if (onFirstInput) {
            firstInput += ".";
        }
        else secondInput += ".";
        updateText();
    }

    @FXML
    private void CPressed() {
        onFirstInput = true;
        firstInput = "0";
        secondInput = "0";
        updateText();
        printInputs();
    }

    @FXML
    private void CEPressed() {
        if (onFirstInput)
            firstInput = "0";
        else secondInput = "0";
        updateText();
        printInputs();
    }

    @FXML
    private void equalsPressed() {
        String result = "0";
        switch (operation) {
            case "addition" -> result = String.valueOf(Float.parseFloat(firstInput) + Float.parseFloat(secondInput));
            case "subtraction" -> result = String.valueOf(Float.parseFloat(firstInput) - Float.parseFloat(secondInput));
            case "multiplication" -> result = String.valueOf(Float.parseFloat(firstInput) * Float.parseFloat(secondInput));
            case "division" -> result = String.valueOf(Float.parseFloat(firstInput) / Float.parseFloat(secondInput));
        }
        text.setText(result);
        System.out.println(result);
        previousInput.setText("");
        firstInput = result;
        secondInput = "0";
        printInputs();
    }

    @FXML
    private void backspacePressed() {
        if (onFirstInput) {
            try {
                firstInput = firstInput.substring(0, firstInput.length() - 1);
            } catch (Exception ignored){ }
            if (firstInput.equals(""))
                firstInput = "0";
        }
        else {
            try {
                secondInput = secondInput.substring(0, secondInput.length() - 1);
            } catch (Exception ignored) { }
            if (secondInput.equals(""))
                secondInput = "0";
        }
        updateText();
        printInputs();
    }

    private void updateText() {
        if (onFirstInput) {
            text.setText(firstInput);
            previousInput.setText("");
        }
        else {
            String symbol = "";
            text.setText(secondInput);
            switch (operation) {
                case "addition" -> symbol = "+";
                case "subtraction" -> symbol = "-";
                case "multiplication" -> symbol = "×";
                case "division" -> symbol = "÷";
            }
            previousInput.setText(firstInput + " " + symbol);
        }
    }

    private void printInputs() {
        System.out.println("First input: " + firstInput);
        System.out.println("Second input: " + secondInput);
    }
}
