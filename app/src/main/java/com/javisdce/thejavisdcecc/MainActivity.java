package com.javisdce.thejavisdcecc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.javisdce.thejavisdcecc.to_binary_algorythm.ConvertAlgorythm;
import com.javisdce.thejavisdcecc.to_char_algorythm.ReconvertAlgorythm;
import com.javisdce.thejavisdcecc.to_hex_algorythm.DecToHex;
import com.javisdce.thejavisdcecc.to_dec_algorythm.HexToDec;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = findViewById(R.id.input);
        final TextView output = findViewById(R.id.output);
        //final RadioGroup radio_group = findViewById(R.id.radioGroup);
        final RadioButton char_to_bin = findViewById(R.id.char_to_bin);
        final RadioButton bin_to_char = findViewById(R.id.bin_to_char);
        final RadioButton dec_to_hex = findViewById(R.id.dec_to_hex);
        final RadioButton hex_to_dec = findViewById(R.id.hex_to_dec);
        final Button convert_button = findViewById(R.id.convert);

        convert_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(char_to_bin.isChecked()){
                    output.setText(ConvertAlgorythm.convert(input.getText().toString()));
                }else if (bin_to_char.isChecked()){
                    output.setText(ReconvertAlgorythm.convert(input.getText().toString()));
                }else if (dec_to_hex.isChecked()){
                    output.setText(DecToHex.convert(Integer.parseInt(input.getText().toString())));
                }else if (hex_to_dec.isChecked()){
                    output.setText(HexToDec.convert(input.getText().toString()));
                }
            }
        });
    }
}
