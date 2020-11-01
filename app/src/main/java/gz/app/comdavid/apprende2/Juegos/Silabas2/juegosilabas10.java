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

public class juegosilabas10 extends AppCompatActivity  implements View.OnClickListener{
    // Se realiza de las imagenes
    ImageView err,err1,err2,err3,err4,err5;
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
        setContentView(R.layout.activity_juegosilabas10);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        mp4= MediaPlayer.create(this,R.raw.seleccionagasolina);
        mp5= MediaPlayer.create(this,R.raw.ga);
        mp6= MediaPlayer.create(this,R.raw.so);
        mp7= MediaPlayer.create(this,R.raw.li);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        mp3= MediaPlayer.create(this,R.raw.gasolina);
        //se inicia el sonido del avatar
        mp4.start();
        //Llamado a los botones
        silba=(Button) findViewById(R.id.juesilca73);
        silbas=(Button) findViewById(R.id.juesilca74);
        silbe=(Button) findViewById(R.id.juesilca75);
        silbi=(Button) findViewById(R.id.juesilca76);
        silbis=(Button) findViewById(R.id.juesilca77);
        silbo=(Button) findViewById(R.id.juesilca78);
        silbos=(Button) findViewById(R.id.juesilca79);
        silbu=(Button) findViewById(R.id.juesilca80);
        //Llamado a las imagenes
        err=(ImageView) findViewById(R.id.errorjuego10);
        err1=(ImageView) findViewById(R.id.imagenca10);
        err2=(ImageView) findViewById(R.id.imagenesss10);
        err3=(ImageView) findViewById(R.id.imagencasa10);
        err4=(ImageView) findViewById(R.id.imagensa10);
        err5=(ImageView) findViewById(R.id.imageneses10);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajesilabas10);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectassilbas10);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
        //Eventos para las imagenes de las silabas
        findViewById(R.id.juesilca73).setOnClickListener(this);
        findViewById(R.id.juesilca74).setOnClickListener(this);
        findViewById(R.id.juesilca75).setOnClickListener(this);
        findViewById(R.id.juesilca76).setOnClickListener(this);
        findViewById(R.id.juesilca77).setOnClickListener(this);
        findViewById(R.id.juesilca78).setOnClickListener(this);
        findViewById(R.id.juesilca79).setOnClickListener(this);
        findViewById(R.id.juesilca80).setOnClickListener(this);

        //sonido del avatar
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas85);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se inicia el sonido del avatar
                mp4.start();

            }
        });
        //Evento del botón inicio
        Button inicio= (Button) findViewById(R.id.casa_juegosil10);
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

            case R.id.juesilca73:
                // Quita la imagen de error
                err.setVisibility(View.INVISIBLE);
                // muestra la silaba
                err1.setVisibility(View.VISIBLE);
                // Quita la imagen de la silaba
                silba.setVisibility(View.INVISIBLE);
                // detiene o inicia el sonido correspondiente
                mp4.stop();
                mp5.start();


                break;
            case R.id.juesilca74:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                break;

            case R.id.juesilca75:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp4.stop();
                mp2.start();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));

                break;
            case R.id.juesilca76:
                // se muestra el error en la pantalla
                err.setVisibility(View.VISIBLE);
                // detiene o inicia el sonido correspondiente
                mp2.start();
                mp4.stop();
                Utilidades.incorrectas++;
                //Actualiza el campo incorrectas
                incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                break;

            case R.id.juesilca77:
                mp4.stop();
                // muestra la imagen de la silaba
                if(err1.getVisibility()==View.VISIBLE) {
                    mp6.start();
                    // quita el resto de silabas
                    silbis.setVisibility(View.INVISIBLE);
                    silba.setVisibility(View.INVISIBLE);
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
            case R.id.juesilca78:
                // muestra la imagen de la silaba
                if(err1.getVisibility()==View.VISIBLE&&err2.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    // quita el resto de silabas
                    silba.setVisibility(View.INVISIBLE);
                    silbo.setVisibility(View.INVISIBLE);
                    // quita la silaba sa de la interfaz
                    silbis.setVisibility(View.INVISIBLE);
                    // muestra las imagenes ocualtas
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err4.setVisibility(View.VISIBLE);
                    mp7.start();

                }else{
                    //Reproduce el sonido
                    mp2.start();
                    // se muestra el error en la pantalla
                    err.setVisibility(View.VISIBLE);
                    Utilidades.incorrectas++;
                    //Actualiza el campo incorrectas
                    incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                }

                break;
            case R.id.juesilca79:
                // muestra la imagen de la silaba
                if(err1.getVisibility()==View.VISIBLE&&err2.getVisibility()==View.VISIBLE&&err4.getVisibility()==View.VISIBLE) {
                    mp4.stop();
                    // quita el resto de silabas
                    silba.setVisibility(View.INVISIBLE);
                    silbo.setVisibility(View.INVISIBLE);
                    // quita la silaba sa de la interfaz
                    silbis.setVisibility(View.INVISIBLE);
                    silbos.setVisibility(View.INVISIBLE);
                    // muestra las imagenes ocualtas
                    err.setVisibility(View.INVISIBLE);
                    err1.setVisibility(View.VISIBLE);
                    err2.setVisibility(View.VISIBLE);
                    err3.setVisibility(View.VISIBLE);
                    err4.setVisibility(View.VISIBLE);
                    err5.setVisibility(View.VISIBLE);
                    mp3.start();
                    Utilidades.correctas++;
                    //Actualiza el campo puntaje
                    puntajes.setText(Integer.toString(Utilidades.correctas));
                    // permite abrir una actividad en un determinado periodo de tiempo
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //Abrir una nueva actividad
                            Intent intent = new Intent(juegosilabas10.this, ResultadoJuegoSilabas2.class);
                            //Transiciones
                            startActivity(intent);
                            overridePendingTransition(R.anim.left_in, R.anim.left_out);
                            //Finaliza la actividad
                            finish();

                        }
                    }, 3000);
                }else{

                    mp2.start();
                    // se muestra el error en la pantalla
                    err.setVisibility(View.VISIBLE);
                    err.setVisibility(View.VISIBLE);
                    Utilidades.incorrectas++;
                    //Actualiza el campo incorrectas
                    incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                }
                break;
            case R.id.juesilca80:
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





