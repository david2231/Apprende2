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
public class juegosil34 extends AppCompatActivity implements View.OnClickListener  {
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
        setContentView(R.layout.activity_juegosil34);
        //Se llama el audio
        mp4= MediaPlayer.create(this,R.raw.seleccionaelobjeto);
        //Reproduce el audio
        mp4.start();
        //Mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Se llaman las 5 silabas de la vista
        silba=(ImageView) findViewById(R.id.siljuegomo2);
        silbas=(ImageView) findViewById(R.id.siljuegomi4);
        silbe=(ImageView) findViewById(R.id.siljuegomi5);
        err=(ImageView) findViewById(R.id.silerror34);
        //Se llaman el contenedor
        casss=(RelativeLayout) findViewById(R.id.vista34);
        //Audio Bien
        mp= MediaPlayer.create(this,R.raw.bien);
        //Audio Mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        // Sonido Casa
        mp3= MediaPlayer.create(this,R.raw.montanna);
        // se llaman las Imagenes
        findViewById(R.id.siljuegomo).setOnClickListener(this);
        findViewById(R.id.siljuegomo2).setOnClickListener(this);
        findViewById(R.id.siljuegomi4).setOnClickListener(this);
        findViewById(R.id.siljuegomi5).setOnClickListener(this);

        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajesilabasm4);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectassilbasm4);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));

        // sonido de la silaba 34
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas34);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // inicia el sonido
                mp4.start();
            }
        });
        // evento botón  inicio
        Button inicio= (Button) findViewById(R.id.casa_sill34);
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
            case R.id.siljuegomi4:
                // muestra el icono de error en pantalla
                err.setVisibility(View.VISIBLE);
                // detiene el sonido principal
                mp4.stop();
                // reproduce el sonido de error
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                break;

            // caso 2
            case R.id.siljuegomi5:
                // Muestra error en la pantalla
                err.setVisibility(View.VISIBLE);
                // Dertine el sonido principal
                mp4.stop();
                // Reproduce el sonido mal
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            // Caso 3
            case R.id.siljuegomo2:
                // Elimina el resto de imagenes que puedan estar en pantalla
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
                        Intent intent=new Intent(juegosil34.this,juegosil35.class);
                        startActivity(intent);
                        // Transición
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        // Finaliza la actividad
                        finish();
                    }
                },3000);
                break;

            // Caso 4
            case R.id.siljuegomo:
                break;
        }
    }
}




