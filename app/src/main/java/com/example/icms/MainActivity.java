package com.example.icms;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextEstado;
    private EditText mEditTextValor;
    private TextView mTextViewPorcentegem;
    private TextView mTextViewTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mEditTextEstado = findViewById(R.id.editTextEstado);
        mEditTextValor = findViewById(R.id.editTextValor);
        mTextViewPorcentegem = findViewById(R.id.textViewPorcentagem);
        mTextViewTotal = findViewById(R.id.textViewTotal);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
        public void calcular(View view){
            String estado = mEditTextEstado.getText().toString();
            String valorString = mEditTextValor.getText().toString();
            float valor = Float.parseFloat(valorString);
            float porcentagem = 0;
            switch (estado) {
                case "RO":
                    porcentagem = 17f;
                    break;
                case "SP":
                    porcentagem = 18;
                    break;
            }
            float total = valor + (valor * porcentagem/100);

            mTextViewPorcentegem.setText(String.valueOf(porcentagem) + "%");
            mTextViewTotal.setText(String.format("R$ %.2f", total));
        }

}

