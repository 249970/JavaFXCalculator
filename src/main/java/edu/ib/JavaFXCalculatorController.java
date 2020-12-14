package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JavaFXCalculatorController {

    private String string;
    private String operator;
    private double number;
    private double wynik;
    private int index;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getWynik() {
        return wynik;
    }

    public void setWynik(double wynik) {
        this.wynik = wynik;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField display;

    @FXML
    private Button clear;

    @FXML
    private Button positiveNegative;

    @FXML
    private Button percent;

    @FXML
    private Button divide;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button multiply;

    @FXML
    private Button subtract;

    @FXML
    private Button add;

    @FXML
    private Button six;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button equals;

    private void clear(){
        setString("");
        setIndex(0);
        setNumber(0);
        setOperator("");
        setWynik(0);
    }

    @FXML
    void onClickEquals(ActionEvent event) {
        number = Double.parseDouble(string.substring(index,string.length()));
        if (operator == "+"){
            wynik +=number;
        }else if (operator == "-"){
            wynik = wynik - number;
        }else if (operator == "*"){
            wynik = wynik * number;
        }else if (operator == "/"){
            if (number == 0){
                display.setText("Dzilenie przez zero!");
                return;
            }else wynik = wynik/number;
        }
        display.setText(String.valueOf(getWynik()));
        clear();
    }

    @FXML
    void OnClickChangePosNeg(ActionEvent event) {   //!!!!
        if (!display.getText().equals("0")){
            number = -1 * Double.parseDouble(string.substring(index,string.length()));
            setString(String.valueOf(number));
            display.setText(getString());
            setWynik(0);
        }
    }

    @FXML
    void onClickClear(ActionEvent event) {
        display.setText("0");
        clear();
    }

    @FXML
    void onClickAdd(ActionEvent event) {
        operator = "+";
        number = Double.parseDouble(string.substring(index,string.length()));
        wynik += number;
        string += "+";
        display.setText(string);
        index = string.length();

    }

    @FXML
    void onClickSubtract(ActionEvent event) {
        operator = "-";
        number = Double.parseDouble(string.substring(index,string.length()));
        wynik += number;
        string += "-";
        display.setText(string);
        index = string.length();
    }

    @FXML
    void onClickDivide(ActionEvent event) {
        operator = "/";
        number = Double.parseDouble(string.substring(index,string.length()));
        wynik += number;
        string += "/";
        display.setText(string);
        index = string.length();
    }

    @FXML
    void onClickmultiply(ActionEvent event) {
        operator = "*";
        number = Double.parseDouble(string.substring(index,string.length()));
        wynik += number;
        string += "*";
        display.setText(string);
        index = string.length();
    }

    @FXML
    void onClickDot(ActionEvent event) {
        string += ".";
        display.setText(string);
    }

    @FXML
    void onClickPercent(ActionEvent event) {
        number = Double.parseDouble(string.substring(index,string.length()));
        setString(String.valueOf(number/100));
        display.setText(getString());
        setWynik(0);
    }


    @FXML
    void onClickNine(ActionEvent event) {
        if (display.getText().equals("0")) {
            setString("9");
            display.setText(string);
        } else {
            string += "9";
            display.setText(string);
        }
    }

    @FXML
    void onClickEight(ActionEvent event) {
        if (display.getText().equals("0")) {
            setString("8");
            display.setText(string);
        } else {
            string += "8";
            display.setText(string);
        }
    }

    @FXML
    void onClickSeven(ActionEvent event) {
        if (display.getText().equals("0")) {
            setString("7");
            display.setText(string);
        } else {
            string += "7";
            display.setText(string);
        }
    }

    @FXML
    void onClickSix(ActionEvent event) {
        if (display.getText().equals("0")) {
            setString("6");
            display.setText(string);
        } else {
            string += "6";
            display.setText(string);
        }
    }

    @FXML
    void onClickFive(ActionEvent event) {
        if (display.getText().equals("0")) {
            setString("5");
            display.setText(string);
        } else {
            string += "5";
            display.setText(string);
        }
    }

    @FXML
    void onClickFour(ActionEvent event) {
        if (display.getText().equals("0")) {
            setString("4");
            display.setText(string);
        } else {
            string += "4";
            display.setText(string);
        }
    }

    @FXML
    void onClickThree(ActionEvent event) {
        if (display.getText().equals("0")) {
            setString("3");
            display.setText(string);
        } else {
            string += "3";
            display.setText(string);
        }
    }

    @FXML
    void onClickTwo(ActionEvent event) {
        if (display.getText().equals("0")) {
            setString("2");
            display.setText(string);
        } else {
            string += "2";
            display.setText(string);
        }
    }

    @FXML
    void onClickOne(ActionEvent event) {
        if (display.getText().equals("0")) {
            setString("1");
            display.setText(string);
        } else {
            string += "1";
            display.setText(getString());
        }
    }

    @FXML
    void onClickZero(ActionEvent event) {
        if (display.getText().equals("0")) {
            setString("0");
            display.setText(string);
        } else {
            string += "0";
            display.setText(getString());
        }
    }


    @FXML
    void initialize() {
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'calculator.fxml'.";
        assert clear != null : "fx:id=\"clear\" was not injected: check your FXML file 'calculator.fxml'.";
        assert positiveNegative != null : "fx:id=\"positiveNegative\" was not injected: check your FXML file 'calculator.fxml'.";
        assert percent != null : "fx:id=\"percent\" was not injected: check your FXML file 'calculator.fxml'.";
        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'calculator.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'calculator.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'calculator.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'calculator.fxml'.";
        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'calculator.fxml'.";
        assert subtract != null : "fx:id=\"subtract\" was not injected: check your FXML file 'calculator.fxml'.";
        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'calculator.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'calculator.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'calculator.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'calculator.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'calculator.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'calculator.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'calculator.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'calculator.fxml'.";
        assert dot != null : "fx:id=\"dot\" was not injected: check your FXML file 'calculator.fxml'.";
        assert equals != null : "fx:id=\"equals\" was not injected: check your FXML file 'calculator.fxml'.";

    }
}

