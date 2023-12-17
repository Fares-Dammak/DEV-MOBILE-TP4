package com.example.fares_dammak_tp1.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fares_dammak_tp1.R;
import com.example.fares_dammak_tp1.model.Patient;

public class MainActivity extends AppCompatActivity {

    private EditText etValeur;
    private Button button;
    private SeekBar seekBar;
    private RadioButton radioButtonNon;
    private RadioButton radioButtonOui;
    private TextView textView,tvResultat;
    Patient p = new Patient(21,20,false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Liaison bin el .xml w el .java | "R" t3ayet lel dossier "res"

        init();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                // kol ma tet7arrek el SeekBar ysirelha appel
                Log.i("Information", "onPressChanged " + progress); // log.i = s.o.p
                textView.setText("votre Age : "+progress); // Example : votre Age: 21
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TrackingTouch => Ka3boura mtaa el SeekBar
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valeur = etValeur.getText().length() == 0 ? 0.0 : Double.parseDouble(etValeur.getText().toString());
                int age = seekBar.getProgress();
                if(age == 0 || valeur == 0.0){
                    Toast.makeText(MainActivity.this, "Verifez vous information", Toast.LENGTH_SHORT).show();
                }else{
                    tvResultat.setText(p.calculer(valeur, age));
                }

            }
        });
    }
    private void init(){
        etValeur = findViewById(R.id.editTxt);
        textView = findViewById(R.id.tvAge);
        tvResultat = findViewById(R.id.etResult);
        seekBar = findViewById(R.id.sbAge);
        radioButtonOui = findViewById(R.id.rbtOui);
        radioButtonNon = findViewById(R.id.rbtNon);
        button = findViewById(R.id.btnConsulter);

    }
}