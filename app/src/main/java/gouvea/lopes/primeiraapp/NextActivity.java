package gouvea.lopes.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//classe que virá o texto que foi digitado na MainActivity
public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        //pega a intent que foi enviada pela MainActivity
        Intent intent = getIntent();
        //pega a string da intent com a chave "texto" do dicionario
        String texto = intent.getStringExtra("texto");
        //declarando textView que irá armazenar o texo enviado
        TextView tvTexto = findViewById(R.id.tvTexto);
        //escrevendo o texto que foi enviado no testview
        tvTexto.setText(texto);
    }
}