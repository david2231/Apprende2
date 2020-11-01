package gz.app.comdavid.apprende2.Juegos.Silabas3;
//Librerias
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

//Clase Juegossilaba
public class juegosil4 extends AppCompatActivity implements View.OnClickListener  {
    // Se realiza la declaración de los TexView de la interfaz
    TextView puntajes;
    TextView incorrecta;
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
        setContentView(R.layout.activity_juegosil4);
        //Se llama el audio
        mp4= MediaPlayer.create(this,R.raw.seleccionaelobjeto);
        //Reproduce el audio
        mp4.start();
        //Mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Se llaman las 5 silabas de la vista
        silba=(ImageView) findViewById(R.id.siljuegoca1);
        silbas=(ImageView) findViewById(R.id.siljuegoce1);
        silbe=(ImageView) findViewById(R.id.siljuegocol1);
        err=(ImageView) findViewById(R.id.silerror4);
        //Se llaman el contenedor
        casss=(RelativeLayout) findViewById(R.id.vista4);
        //Audio Bien
        mp= MediaPlayer.create(this,R.raw.bien);
        //Audio Mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        // Sonido cocodrilo
        mp3= MediaPlayer.create(this,R.raw.cocodrilo);

        // se llaman las Imagenes
        findViewById(R.id.siljuegoco1).setOnClickListener(this);
        findViewById(R.id.siljuegoca1).setOnClickListener(this);
        findViewById(R.id.siljuegoco1).setOnClickListener(this);
        findViewById(R.id.siljuegocol1).setOnClickListener(this);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajesilabasc4);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectassilbasc4);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));

        // sonido de la silaba 4
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas4);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // inicia el sonido
                mp4.start();

            }
        });

        // evento botón  inicio
        Button inicio= (Button) findViewById(R.id.casa_sill4);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // abre una actividad
                Intent intent=new Intent(v.getContext(), silabas.class);
                startActivityForResult(intent,0);
                // transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                // detiene los sonidos
                mp4.stop();
                //Reinicia las variables globales
                Utilidades.correctas=0;
                Utilidades.incorrectas=0;
                // finaliza la actividad
                finish();
            }
        });

    }
    // Metodo onClick
    @Override
    public void onClick(View view) {
        // Switch Case dependiendo de la opción del usuario
        switch (view.getId()) {
            // caso 1
            case R.id.siljuegoce1:
                // muestra el icono de error en pantalla
                err.setVisibility(View.VISIBLE);
                // detiene el sonido principal
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                // reproduce el sonido de error
                mp2.start();

                break;
            // caso 2
            case R.id.siljuegoca1:
                //Elimina el resto de imagenes que puedan estar en pantalla
                err.setVisibility(View.VISIBLE);
                // detiene el sonido principal
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                // reproduce el sonido de error
                mp2.start();

                break;

            // caso 3
            case R.id.siljuegocol1:
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                // Trae la imagen principal
                casss.setVisibility(View.VISIBLE);
                // detiene el sonido principal
                 mp4.stop();
                // Reproduce el audio exitoso
                mp3.start();
                Utilidades.correctas++;
                //Actualiza el campo puntaje
                puntajes.setText(Integer.toString(Utilidades.correctas));
                // Cambia de actividad
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Abre una nueva actividad
                        Intent intent=new Intent(juegosil4.this,juegosil5.class);
                        // Transición
                        startActivity(intent);
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        // Finaliza la actividad
                        finish();

                    }
                },3000);

                break;

            // Caso 4
            case R.id.siljuegoco1:
                // Detine el sonido principal
                mp4.stop();
                break;
        }
    }
}


