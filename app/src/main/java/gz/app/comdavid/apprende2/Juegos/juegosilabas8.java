package gz.app.comdavid.apprende2.Juegos;
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
import gz.app.comdavid.apprende2.juegos;

public class juegosilabas8 extends AppCompatActivity  implements View.OnClickListener{
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
        setContentView(R.layout.activity_juegosilabas8);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Llamado a los sonidos
        mp4= MediaPlayer.create(this,R.raw.seleccionazapato);
        mp5= MediaPlayer.create(this,R.raw.sa);
        mp6= MediaPlayer.create(this,R.raw.pa);
        mp7= MediaPlayer.create(this,R.raw.to);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.zapato);
        //se inicia el sonido del avatar
        mp4.start();
        //Llamado a los botones
        silba=(Button) findViewById(R.id.juesilca57);
        silbas=(Button) findViewById(R.id.juesilca58);
        silbe=(Button) findViewById(R.id.juesilca59);
        silbi=(Button) findViewById(R.id.juesilca60);
        silbis=(Button) findViewById(R.id.juesilca61);
        silbo=(Button) findViewById(R.id.juesilca62);
        silbos=(Button) findViewById(R.id.juesilca63);
        silbu=(Button) findViewById(R.id.juesilca64);
        //Llamado a las imagenes
        err=(ImageView) findViewById(R.id.errorjuego8);
        err1=(ImageView) findViewById(R.id.imagenca8);
        err2=(ImageView) findViewById(R.id.imagenesss8);
        err3=(ImageView) findViewById(R.id.imagencasa8);
        err4=(ImageView) findViewById(R.id.imagensa8);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajesilabas8);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectassilbas8);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
        //Eventos para las imagenes de las silabas
        findViewById(R.id.juesilca57).setOnClickListener(this);
        findViewById(R.id.juesilca58).setOnClickListener(this);
        findViewById(R.id.juesilca59).setOnClickListener(this);
        findViewById(R.id.juesilca60).setOnClickListener(this);
        findViewById(R.id.juesilca61).setOnClickListener(this);
        findViewById(R.id.juesilca62).setOnClickListener(this);
        findViewById(R.id.juesilca63).setOnClickListener(this);
        findViewById(R.id.juesilca64).setOnClickListener(this);

        //sonido del avatar
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas83);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se inicia el sonido del avatar
                mp4.start();

            }
        });
        //Evento del botón inicio
        Button inicio= (Button) findViewById(R.id.casa_juegosil8);
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
            case R.id.juesilca57:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                break;
            case R.id.juesilca58:
                // muestra la silaba
                err1.setVisibility(View.VISIBLE);
                // Quita la imagen de error
                err.setVisibility(View.INVISIBLE);
                // Quita la imagen de la silaba
                silbas.setVisibility(View.INVISIBLE);
                // detiene o inicia el sonido correspondiente
                mp4.stop();
                mp5.start();


                break;

            case R.id.juesilca59:
                // muestra la imagen de la silaba
                mp4.stop();
                if(err1.getVisibility()==View.VISIBLE) {
                    mp6.start();
                    // quita el resto de silabas
                    silbas.setVisibility(View.INVISIBLE);
                    silbe.setVisibility(View.INVISIBLE);
                    // quita la silaba sa de la interfaz
                    err.setVisibility(View.INVISIBLE);
                    // muestra las imagenes ocualtas
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);

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
            case R.id.juesilca60:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;

            case R.id.juesilca61:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            case R.id.juesilca62:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp4.stop();
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            case R.id.juesilca63:
                // muestra la imagen de la silaba
                if(err1.getVisibility()==View.VISIBLE&&err2.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    // quita el resto de silabas
                    silbas.setVisibility(View.INVISIBLE);
                    silbe.setVisibility(View.INVISIBLE);
                    silbos.setVisibility(View.INVISIBLE);
                    // quita la silaba sa de la interfaz
                    err.setVisibility(View.INVISIBLE);
                    // muestra las imagenes ocualtas
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
                            Intent intent = new Intent(juegosilabas8.this,juegosilabas9.class);
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
            case R.id.juesilca64:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                //Reproduce el sonido
                mp2.start();
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
        }

    }
}




