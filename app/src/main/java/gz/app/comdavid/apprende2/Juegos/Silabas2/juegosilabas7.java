package gz.app.comdavid.apprende2.Juegos.Silabas2;
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


public class juegosilabas7 extends AppCompatActivity  implements View.OnClickListener{
    // Se realiza de las imagenes
    ImageView err,err1,err2,err3,err4;
    // Se realiza la declaración de los TexView de la interfaz
    TextView puntajes,incorrecta;
    //Se realiza la declaración de los botones
    Button silba,silbas,silbe,silbi,silbis,silbo,silbos,silbu;
    // Se realiza la declaración de los sonidos
    MediaPlayer mp,mp2,mp3,mp4,mp5,mp6,mp7;

    //Metodo onCreate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegosilabas7);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        mp4= MediaPlayer.create(this,R.raw.seleccionatomate);
        //Llamado a los sonidos
        mp5= MediaPlayer.create(this,R.raw.to);
        mp6= MediaPlayer.create(this,R.raw.ma);
        mp7= MediaPlayer.create(this,R.raw.te);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.tomate);
        //se inicia el sonido del avatar
        mp4.start();
        //Llamado a los botones
        silba=(Button) findViewById(R.id.juesilca49);
        silbas=(Button) findViewById(R.id.juesilca50);
        silbe=(Button) findViewById(R.id.juesilca51);
        silbi=(Button) findViewById(R.id.juesilca52);
        silbis=(Button) findViewById(R.id.juesilca53);
        silbo=(Button) findViewById(R.id.juesilca54);
        silbos=(Button) findViewById(R.id.juesilca55);
        silbu=(Button) findViewById(R.id.juesilca56);
        //Llamado a las imagenes
        err=(ImageView) findViewById(R.id.errorjuego7);
        err1=(ImageView) findViewById(R.id.imagenca7);
        err2=(ImageView) findViewById(R.id.imagenesss7);
        err3=(ImageView) findViewById(R.id.imagencasa7);
        err4=(ImageView) findViewById(R.id.imagensa7);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajesilabas7);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectassilbas7);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
        //Eventos para las imagenes de las silabas
        findViewById(R.id.juesilca49).setOnClickListener(this);
        findViewById(R.id.juesilca50).setOnClickListener(this);
        findViewById(R.id.juesilca51).setOnClickListener(this);
        findViewById(R.id.juesilca52).setOnClickListener(this);
        findViewById(R.id.juesilca53).setOnClickListener(this);
        findViewById(R.id.juesilca54).setOnClickListener(this);
        findViewById(R.id.juesilca55).setOnClickListener(this);
        findViewById(R.id.juesilca56).setOnClickListener(this);

        //sonido del avatar
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas82);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se inicia el sonido del avatar
                mp4.start();

            }
        });

        //Evento del botón inicio
        Button inicio= (Button) findViewById(R.id.casa_juegosil7);
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
            case R.id.juesilca49:
                // muestra la silaba
                err.setVisibility(View.INVISIBLE);
                // Quita la imagen de error
                err1.setVisibility(View.VISIBLE);
                // Quita la imagen de la silaba
                silba.setVisibility(View.INVISIBLE);
                // detiene o inicia el sonido correspondiente
                mp4.stop();
                mp5.start();


                break;
            case R.id.juesilca50:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;

            case R.id.juesilca51:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            case R.id.juesilca52:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;

            case R.id.juesilca53:
                // muestra la imagen de la silaba
                if(err1.getVisibility()==View.VISIBLE&&err2.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    // quita el resto de silabas
                    silba.setVisibility(View.INVISIBLE);
                    silbu.setVisibility(View.INVISIBLE);
                    // quita la silaba sa de la interfaz
                    silbis.setVisibility(View.INVISIBLE);
                    // muestra las imagenes ocualtas
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);
                    err4.setVisibility(View.VISIBLE);
                    mp3.start();
                    Utilidades.correctas++;
                    //Actualiza el campo puntaje
                    puntajes.setText(Integer.toString(Utilidades.correctas));
                    // permite abrir una actividad en un determinado periodo de tiempo
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //Abrir una nueva actividad
                            Intent intent = new Intent(juegosilabas7.this, juegosilabas8.class);
                            startActivity(intent);
                            //Transiciones
                            overridePendingTransition(R.anim.left_in, R.anim.left_out);
                            //Finaliza la actividad
                            finish();

                        }
                    }, 3000);
                }else{
                    //Se suma un punto a la opción incorrecta
                    mp2.start();
                    // se muestra el error en la pantalla
                    err.setVisibility(View.VISIBLE);
                    Utilidades.incorrectas++;
                    //Actualiza el campo incorrectas
                    incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                }

                break;
            case R.id.juesilca54:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp4.stop();
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            case R.id.juesilca55:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                break;
            case R.id.juesilca56:
                // muestra la imagen de la silaba
                mp4.stop();
                if(err1.getVisibility()==View.VISIBLE) {
                    mp6.start();
                    // quita el resto de silabas
                    silba.setVisibility(View.INVISIBLE);
                    silbu.setVisibility(View.INVISIBLE);
                    // quita la silaba sa de la interfaz
                    err.setVisibility(View.INVISIBLE);
                    // muestra las imagenes ocualtas
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);

                }else{
                    // se muestra el error en la pantalla
                    mp2.start();
                    //Reproduce el sonido
                    err.setVisibility(View.VISIBLE);
                    Utilidades.incorrectas++;
                    //Actualiza el campo incorrectas
                    incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                }
                break;
        }

    }
}




