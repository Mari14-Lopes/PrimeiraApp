package gouvea.lopes.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//Criacao da classe referente a interface activity_main
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declarando
        Button bntEnviar = findViewById(R.id.btnEnviar);
        bntEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String texto = etDigiteAqui.getText().toString();
                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                intent.putExtra("texto",texto);
                startActivity(intent);
            }
        });
    }
}