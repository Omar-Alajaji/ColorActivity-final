package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner customSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customSpinner=findViewById(R.id.customSpinner);

        ArrayList<colorsItem> customColorsList = new ArrayList<>();
        customColorsList.add(new colorsItem("red", R.drawable.ic_color_lens_black_24dp));
        customColorsList.add(new colorsItem("blue", R.drawable.ic_color_lens_black_24dp));
        customColorsList.add(new colorsItem("green", R.drawable.ic_color_lens_black_24dp));
        customColorsList.add(new colorsItem("black", R.drawable.ic_color_lens_black_24dp));
        customColorsList.add(new colorsItem("white", R.drawable.ic_color_lens_black_24dp));
        customColorsList.add(new colorsItem("purple", R.drawable.ic_color_lens_black_24dp));
        customColorsList.add(new colorsItem("pink", R.drawable.ic_color_lens_black_24dp));
        customColorsList.add(new colorsItem("violet", R.drawable.ic_color_lens_black_24dp));
        customColorsList.add(new colorsItem("dark blue", R.drawable.ic_color_lens_black_24dp));
        customColorsList.add(new colorsItem("orange", R.drawable.ic_color_lens_black_24dp));

        ColorAdapter customColors=new ColorAdapter (this, customColorsList);

        if (customSpinner!= null){
            customSpinner.setAdapter(customColors);
            customSpinner.setOnItemSelectedListener(this);

        }


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
        colorsItem items = (colorsItem) adapterView.getSelectedItem();
        /* Toast.makeText(this,items.getSpinnerText(),Toast.LENGTH_SHORT).show(); */
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
