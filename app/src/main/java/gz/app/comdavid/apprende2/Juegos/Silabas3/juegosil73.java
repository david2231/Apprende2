package gz.app.comdavid.apprende2.Juegos.Silabas3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.Silabas.silabas;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;

public class juegosil73 extends AppCompatActivity implements View.OnClickListener  {

    // Se realiza la declaración de los TexView de la interfaz
    TextView puntajes,incorrecta;
    //Se declaran los image view
    ImageView silba,silbas,silbe,err;
    //Se declaran los sonidos
    MediaPlayer mp,mp2,mp3,mp4;
    //Se declara la vista principal
    RelativeLayout casss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosil73);
        mp4= MediaPlayer.create(this,R.raw.seleccionazi);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(ImageView) findViewById(R.id.siljuegozi3);
        silbas=(ImageView) findViewById(R.id.siljuegoza3);
        silbe=(ImageView) findViewById(R.id.siljuegozu2);
        err=(ImageView) findViewById(R.id.silerror73);
        casss=(RelativeLayout) findViewById(R.id.vista73);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.zinc);

        findViewById(R.id.siljuegozi3).setOnClickListener(this);
        findViewById(R.id.siljuegozi2).setOnClickListener(this);
        findViewById(R.id.siljuegoza3).setOnClickListener(this);
        findViewById(R.id.siljuegozu2).setOnClickListener(this);

        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajesilabasz3);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectassilbasz3);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));

        Button sonidoa = (Button)findViewById(R.id.sonidosilabas73);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });
        Button inicio= (Button) findViewById(R.id.casa_sill73);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp4.stop();
                Utilidades.correctas=0;
                Utilidades.incorrectas=0;
                // finaliza la actividad
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.siljuegozi3:


                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            case R.id.siljuegozu2:
                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                break;

            case R.id.siljuegoza3:
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                casss.setVisibility(View.VISIBLE);
                mp3.start();
                Utilidades.correctas++;
                //Actualiza el campo puntaje
                puntajes.setText(Integer.toString(Utilidades.correctas));
                // Cambia de actividad
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent=new Intent(juegosil73.this,juegosil74.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        finish();

                    }
                },3000);


                break;

            case R.id.siljuegozi2:

                break;

        }
    }
}



