package com.uiresource.cookit.Telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.uiresource.cookit.R;

public class Cadastro_Geral_Manter_TL extends AppCompatActivity {

    private Button _btn_Cadastro;
    private EditText _txt_Nome;
    private EditText _txt_Email;
    private EditText _txt_Senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_geral_manter_tl);

        _btn_Cadastro = (Button) findViewById(R.id.btn_Salvar);
        _txt_Nome = (EditText) findViewById(R.id.txt_Nome);
        _txt_Email = (EditText) findViewById(R.id.txt_Email);
        _txt_Senha = (EditText) findViewById(R.id.txt_Senha);

        Carregar_Nomes();

        _btn_Cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    Intent intent = getIntent();
                    Bundle oPerfil = intent.getExtras();
                    String nome = oPerfil.getString("perfil_nome").toString();
                    nome = _txt_Nome.getText().toString();




                } catch (Exception ex) {
                    Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void Carregar_Nomes(){
        Intent intent = getIntent();
        Bundle oPerfil = intent.getExtras();
        String nome = oPerfil.getString("perfil_nome").toString();
        if (nome.equals("Distribuidora")){
            _txt_Nome.setHint("Nome ou Razão Social");
        }else {
            _txt_Nome.setHint("Nome Completo");
        }
    }
}
