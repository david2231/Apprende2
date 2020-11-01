package gz.app.comdavid.apprende2.Juegos.Silabas1;
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
import android.widget.TextView;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;
import gz.app.comdavid.apprende2.Juegos.juegos;


public class juegosilabas5 extends AppCompatActivity  implements View.OnClickListener{
    // Se realiza de las imagenes
    ImageView err,err1,err2,err3;
    // Se realiza la declaración de los TexView de la interfaz
    TextView puntajes,incorrecta;
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    // Se realiza la declaración de los sonidos
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6;


    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas5);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Llamado a los sonidos
        mp4= MediaPlayer.create(this,R.raw.seleccionarana);
        mp5= MediaPlayer.create(this,R.raw.ra);
        mp6= MediaPlayer.create(this,R.raw.na);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.rana);
        //se inicia el sonido del avatar
        mp4.start();
        //Llamado a los botones
        silba=(Button) findViewById(R.id.juesilca33);
        silbas=(Button) findViewById(R.id.juesilca34);
        silbe=(Button) findViewById(R.id.juesilca35);
        silbi=(Button) findViewById(R.id.juesilca36);
        silbis=(Button) findViewById(R.id.juesilca37);
        silbo=(Button) findViewById(R.id.juesilca38);
        silbos=(Button) findViewById(R.id.juesilca39);
        silbu=(Button) findViewById(R.id.juesilca30);
        //Llamado a las imagenes
        err=(ImageView) findViewById(R.id.errorjuego5);
        err1=(ImageView) findViewById(R.id.imagenca5);
        err2=(ImageView) findViewById(R.id.imagensa5);
        err3=(ImageView) findViewById(R.id.imagencasa5);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajesilabas5);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectassilbas5);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
        //Eventos para las imagenes de las silabas
        findViewById(R.id.juesilca33).setOnClickListener(this);
        findViewById(R.id.juesilca34).setOnClickListener(this);
        findViewById(R.id.juesilca35).setOnClickListener(this);
        findViewById(R.id.juesilca36).setOnClickListener(this);
        findViewById(R.id.juesilca37).setOnClickListener(this);
        findViewById(R.id.juesilca38).setOnClickListener(this);
        findViewById(R.id.juesilca39).setOnClickListener(this);
        findViewById(R.id.juesilca40).setOnClickListener(this);

        //sonido del avatar
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas80);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se inicia el sonido del avatar
                mp4.start();

            }
        });
        //Evento del botón inicio
        Button inicio= (Button) findViewById(R.id.casa_juegosil5);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), juegos.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Detiene el video y los sonidos que puedan estar reproduciendose
                mp4.stop();
                //Reinicia las variables globales
                Utilidades.correctas=0;
                Utilidades.incorrectas=0;
                //Finaliza la actividad
                finish();
            }
        });

    }
    //Metodo onClick
    @Override
    public void onClick(View view) {

        //Switch dependiendo de la opción elegida por el usuario
        switch (view.getId()) {

            //primera opción
            case R.id.juesilca33:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                mp4.stop();
                //Se suma un punto a la opción incorrecta
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            case R.id.juesilca34:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp4.stop();
                mp2.start();
                //Se suma un punto a la opción incorrecta
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;

            case R.id.juesilca35:
                // muestra la silaba RA
                err1.setVisibility(View.VISIBLE);
                // Quita la imagen de error
                err.setVisibility(View.GONE);
                // detiene o inicia el sonido correspondiente
                mp4.stop();
                mp5.start();
                // Quita la imagen de la silaba RA
                silbe.setVisibility(View.INVISIBLE);

                break;
            case R.id.juesilca36:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                //Se suma un punto a la opción incorrecta
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;

            case R.id.juesilca37:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                mp4.stop();
                //Se suma un punto a la opción incorrecta
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            case R.id.juesilca38:
                // muestra la imagen de la silaba NA
                if(err1.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    // quita el resto de silabas
                    silbe.setVisibility(View.INVISIBLE);
                    silbo.setVisibility(View.INVISIBLE);
                    // quita la silaba sa de la interfaz
                    err.setVisibility(View.GONE);
                    // muestra las imagenes ocualtas
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);
                    //Se suma un punto a la opción correcta
                    Utilidades.correctas++;
                    //Actualiza el campo puntaje
                    puntajes.setText(Integer.toString(Utilidades.correctas));
                    mp3.start();
                    // permite abrir una actividad en un determinado periodo de tiempo
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //Abrir una nueva actividad
                            Intent intent = new Intent(juegosilabas5.this, ResultadoJuegoSilabas1.class);
                            startActivity(intent);
                            //Transiciones
                            overridePendingTransition(R.anim.left_in, R.anim.left_out);
                            //Finaliza la actividad
                            finish();


                        }
                    }, 3000);
                }else{

                    //Reproduce el sonido dado
                    mp2.start();
                    //Se suma un punto a la opción incorrecta
                    Utilidades.incorrectas++;
                    //Actualiza el campo incorrectas
                    incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                }


                break;
            case R.id.juesilca39:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                //Se suma un punto a la opción incorrecta
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            case R.id.juesilca40:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                //Se suma un punto a la opción incorrecta
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
        }

    }
}




