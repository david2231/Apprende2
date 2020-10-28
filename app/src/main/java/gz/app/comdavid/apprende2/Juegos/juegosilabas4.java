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

public class juegosilabas4 extends AppCompatActivity  implements View.OnClickListener{
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
        setContentView(R.layout.activity_juegosilabas4);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Llamado a los sonidos
        mp4= MediaPlayer.create(this,R.raw.seleccionapera);
        mp5= MediaPlayer.create(this,R.raw.pe);
        mp6= MediaPlayer.create(this,R.raw.ra);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.pera);
        //se inicia el sonido del avatar
        mp4.start();
        //Llamado a los botones
        silba=(Button) findViewById(R.id.juesilca25);
        silbas=(Button) findViewById(R.id.juesilca26);
        silbe=(Button) findViewById(R.id.juesilca27);
        silbi=(Button) findViewById(R.id.juesilca28);
        silbis=(Button) findViewById(R.id.juesilca29);
        silbo=(Button) findViewById(R.id.juesilca30);
        silbos=(Button) findViewById(R.id.juesilca31);
        silbu=(Button) findViewById(R.id.juesilca32);
        //Llamado a las imagenes
        err=(ImageView) findViewById(R.id.errorjuego4);
        err1=(ImageView) findViewById(R.id.imagenca4);
        err2=(ImageView) findViewById(R.id.imagensa4);
        err3=(ImageView) findViewById(R.id.imagencasa4);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajesilabas4);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectassilbas4);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
        //Eventos para las imagenes de las silabas
        findViewById(R.id.juesilca25).setOnClickListener(this);
        findViewById(R.id.juesilca26).setOnClickListener(this);
        findViewById(R.id.juesilca27).setOnClickListener(this);
        findViewById(R.id.juesilca28).setOnClickListener(this);
        findViewById(R.id.juesilca29).setOnClickListener(this);
        findViewById(R.id.juesilca30).setOnClickListener(this);
        findViewById(R.id.juesilca31).setOnClickListener(this);
        findViewById(R.id.juesilca32).setOnClickListener(this);

        //sonido del avatar
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas79);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se inicia el sonido del avatar
                mp4.start();

            }
        });
        //Evento del botón inicio
        Button inicio= (Button) findViewById(R.id.casa_juegosil4);
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
            case R.id.juesilca25:
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
            case R.id.juesilca26:
                // muestra la silaba pe
                err1.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp5.start();
                mp4.stop();
                // Quita la imagen de error
                err.setVisibility(View.GONE);
                // Quita la imagen de la silaba RA
                silbas.setVisibility(View.INVISIBLE);

                break;

            case R.id.juesilca27:

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
            case R.id.juesilca28:
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

            case R.id.juesilca29:
                // detiene o inicia el sonido correspondiente
                mp4.stop();
                // muestra la imagen de la silaba RA
                if(err1.getVisibility()==View.VISIBLE) {
                    // quita el resto de silabas
                    silbas.setVisibility(View.INVISIBLE);
                    silbis.setVisibility(View.INVISIBLE);
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
                            Intent intent = new Intent(juegosilabas4.this, juegosilabas5.class);
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
            case R.id.juesilca30:
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
            case R.id.juesilca31:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // se muestra el error en la pantalla
                mp4.stop();
                mp2.start();
                //Se suma un punto a la opción incorrecta
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            case R.id.juesilca32:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // se muestra el error en la pantalla
                mp4.stop();
                mp2.start();
                //Se suma un punto a la opción incorrecta
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                break;
        }

    }
}




