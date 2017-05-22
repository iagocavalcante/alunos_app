package br.com.iago.voltando;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_alunos);

        Button btnSalvar = (Button) findViewById(R.id.formulario_btnSalvar);

        btnSalvar.setOnClickListener(v ->
            Toast.makeText(this, "Texto", Toast.LENGTH_LONG).show()
        );
    }
}
