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
        //Variavel btnEnviar armazena o botão da activity_main com o id = btnEnviar
        Button bntEnviar = findViewById(R.id.btnEnviar);
        //metodo setOnClickListener ouvidor de cliques
        bntEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //metodo OnClick vai realizar os proximos comandos assim que o usuário clicar no botão
            public void onClick(View view) {
                //variavel etDigiteAqui armazena o editor de texto com id = etDigiteAqui
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                //varivel texto armazena o que foi digitado no EditText etDigiteAqui
                String texto = etDigiteAqui.getText().toString();
                //criacao da intenção de navegar desta MainActivity para a NextActivity
                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                //dicionario com a chave "texo" e com o valor sendo a variavel texto(possui o que foi digitado pelo usuario)
                intent.putExtra("texto",texto);
                //realiza a intencao(leva para a NextAtivity)
                startActivity(intent);
            }
        });
    }
}