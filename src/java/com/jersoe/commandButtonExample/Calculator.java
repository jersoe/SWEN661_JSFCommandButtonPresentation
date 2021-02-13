package com.jersoe.commandButtonExample;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("calculator")
@SessionScoped
public class Calculator implements Serializable {

    private String value1;
    private String value2;
    private String sum;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public void calculate() {
        try {
            this.sum = Double.toString(Double.parseDouble(value1) + Double.parseDouble(value2));
        } catch (Exception e) {
            this.sum = "Error";
        }
    }

}
