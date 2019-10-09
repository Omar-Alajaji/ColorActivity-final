package edu.temple.coloractivity;

public class colorsItem {

    private String spinnerText;
    private int SpinnerImage;


    public colorsItem(String spinnerText,int spinnerImage) {
        this.spinnerText = spinnerText;

        this.SpinnerImage = spinnerImage;
    }

    public String getSpinnerText() {
        return spinnerText;
    }
    public int getSpinnerImage() {
        return SpinnerImage;
    }


}
