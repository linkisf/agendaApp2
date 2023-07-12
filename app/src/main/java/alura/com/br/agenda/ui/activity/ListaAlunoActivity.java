package alura.com.br.agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

import alura.com.br.agenda.R;

public class ListaAlunoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        setTitle("Lista de Alunos");

        ArrayList<String> alunos = new ArrayList<String>(Arrays.asList("Alexa", "Jose", "Fran"));


        ListView listaDeAlunos = findViewById(R.id.activity_lista_de_alunos_listview);;

        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));



//        TextView primeiroAluno = findViewById(R.id.textView);
//        TextView segundoAluno = findViewById(R.id.textView4);
//        TextView terceitoAluno = findViewById(R.id.textView5);
//
//        primeiroAluno.setText(alunos.get(0));
//        segundoAluno.setText(alunos.get(1));
//        terceitoAluno.setText(alunos.get(2));

        //Toast.makeText(this, "Primeiro App", Toast.LENGTH_SHORT).show();

    }
}
