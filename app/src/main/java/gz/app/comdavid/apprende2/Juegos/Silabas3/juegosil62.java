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

public class juegosil62 extends AppCompatActivity implements View.OnClickListener  {

    // Se realiza la declaración de los TexView de la interfaz
    TextView puntajes,incorrecta;
    //Se declaran los image view
    ImageView silba,silbas,silbe,err;
    //Se declaran los sonidos
    MediaPlayer mp,mp2,mp3,mp4;
    //Se declara la vista principal
    RelativeLayout casss;

    //Metodo onCreate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosil62);
        mp4= MediaPlayer.create(this,R.raw.seleccionave);
        mp4.start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        silba=(ImageView) findViewById(R.id.siljuegove3);
        silbas=(ImageView) findViewById(R.id.siljuegovu);
        silbe=(ImageView) findViewById(R.id.siljuegovo);
        err=(ImageView) findViewById(R.id.silerror62);
        casss=(RelativeLayout) findViewById(R.id.vista62);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.ventana);

        findViewById(R.id.siljuegove3).setOnClickListener(this);
        findViewById(R.id.siljuegove2).setOnClickListener(this);
        findViewById(R.id.siljuegovu).setOnClickListener(this);
        findViewById(R.id.siljuegovo).setOnClickListener(this);

        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajesilabasv2);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectassilbasv2);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));

        Button sonidoa = (Button)findViewById(R.id.sonidosilabas62);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();

            }
        });


        Button inicio= (Button) findViewById(R.id.casa_sill62);
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
            case R.id.siljuegove3:


                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                break;
            case R.id.siljuegovo:
                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                break;

            case R.id.siljuegovu:
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                casss.setVisibility(View.VISIBLE);
                mp4.stop();
                mp3.start();
                Utilidades.correctas++;
                //Actualiza el campo puntaje
                puntajes.setText(Integer.toString(Utilidades.correctas));
                // Cambia de actividad
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent=new Intent(juegosil62.this,juegosil63.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        finish();

                    }
                },3000);

                break;

            case R.id.siljuegove2:

                break;
        }
    }
}



