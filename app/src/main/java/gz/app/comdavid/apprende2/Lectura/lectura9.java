package gz.app.comdavid.apprende2.Lectura;
//Librerias

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.speech.RecognizerIntent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import java.util.ArrayList;

import gz.app.comdavid.apprende2.MainActivity;
import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.clases.vo.Utilidades;

// Clase de la actividad lectura9
public class lectura9 extends AppCompatActivity  implements View.OnClickListener{

    // Se realiza la declaración de los TexView de la interfaz
    TextView grabar,bien,puntajes,incorrecta;
    // Se realiza la declaración de los sonidos
    MediaPlayer mp,mp2;
    // Se realiza la declaración de la vista del video
    private VideoView azul;


    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;
    //Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Super clase onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura9);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Llamado del videoview
        azul=(VideoView) findViewById(R.id.remoroto) ;
        //LLamado a la ubicadión del video en el paquete raw
        String path=("android.resource://"+getPackageName()+"/"+R.raw.remo);
        //Obtención del video
        azul.setVideoURI(Uri.parse(path));
        //Se inicia el video automaticamente
        azul.start();
        //Llamado al sonido exitoso
        mp= MediaPlayer.create(this,R.raw.bien);
        //Llamado al sonido mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        //Salida de texto en pantalla
        findViewById(R.id.remoroto).setOnClickListener(this);
        //Permite presionar en cualquier lugar del video para volver a reproducirlo
        bien=(TextView) findViewById(R.id.textoo9);
        //Permite presionar en cualquier lugar del video para volver a reproducirlo
        grabar = (TextView) findViewById(R.id.txtGrabarVoz9);
        //Se declara una variable local para almacenar las palabras correctas
        puntajes=(TextView) findViewById(R.id.puntajeLectura9);
        //Se declara una variable local para almacenar las palabras incorrectas
        incorrecta=(TextView) findViewById(R.id.incorrectasLectura9);
        //Se actualizan los campos de correctas  e incorrectas con las variables globales de utilidades
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));

        //Evento del botón inicio
        Button inicio= (Button) findViewById(R.id.casa_lectura9);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                //Detiene el video y los sonidos que puedan estar reproduciendose
                azul.stopPlayback();
                azul.seekTo(0);
                //Reinicia las variables globales
                Utilidades.correctas=0;
                Utilidades.incorrectas=0;
                //Finaliza la actividad
                finish();
            }
        });
        //Evento del botón siguiente
        Button sig= (Button) findViewById(R.id.siguiente_lectura9);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir una nueva actividad
                Intent intent=new Intent(v.getContext(),lectura10.class);
                startActivityForResult(intent,0);
                //Transiciones
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                //Detiene el video y los sonidos que puedan estar reproduciendose
                azul.stopPlayback();
                azul.seekTo(0);
                //Finaliza la actividad
                finish();
            }
        });
        //Evento del botón anterior
        Button anterior= (Button) findViewById(R.id.anterior_lectura9);
        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),lectura8.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                azul.stopPlayback();
                azul.seekTo(0);
                //Finaliza la actividad
                finish();
            }
        });
        //Evento del botón play
        Button azull= (Button) findViewById(R.id.botonazul9);
        azull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reproduce nuevamente el video
                azul.start();

            }
        });

        Button omitirr= (Button) findViewById(R.id.omitir9);
        omitirr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reproduce nuevamente el video
                azul.start();

            }
        });
    }
    //Se implementa el evento llamado en la clase
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.remoroto:
                azul.start();
                break;

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case RECOGNIZE_SPEECH_ACTIVITY:
                //  Si se presiona en el botón que permite grabar
                if (resultCode == RESULT_OK && null != data) {
                    //  el Speech en un ArrayList
                    ArrayList<String> speech = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    // Obtiene el reconociento de voz de la Posción 0 siendo el más Preciso
                    String strSpeech2Text = speech.get(0);
                    // Actualiza el valor del campo con la conversión voz a texto
                    grabar.setText(strSpeech2Text);

                }
                // Validación de los 2 texto iguales
                if(bien.getText().toString().equals(grabar.getText().toString())){
                    //Se suma un punto a la opción correcta
                    Utilidades.correctas++;
                    //Actualiza el campo puntaje
                    puntajes.setText(Integer.toString(Utilidades.correctas));
                    // Toast que indica que fue exitosa la frase
                Toast.makeText(this,"Bien Hecho",Toast.LENGTH_LONG).show();
                    // Reproduce el sonido Bien
                mp.start();

            }
            else{
                // Toast que indica que no fue bien leida la frase
                Toast.makeText(this,"Inténtalo de Nuevo",Toast.LENGTH_LONG).show();
                    //Se suma un punto a la opción incorrecta
                    Utilidades.incorrectas++;
                    //Actualiza el campo incorrectas
                    incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                    // Reproduce el sonido Mal
                mp2.start();
            }
                break;
            default:

                break;
        }
    }

    public void onClickImgBtnHablar9(View v) {
        // Intent del Reconocimiento de Voz
        Intent intentActionRecognizeSpeech = new Intent(
                RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

        // Se selecciona  el Lenguaje  (Español)
        intentActionRecognizeSpeech.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL, "es-419");
        // Se crea un try catch que permite validar si el dispositivo soporta el reconocimiento por voz
        try {
            startActivityForResult(intentActionRecognizeSpeech,
                    RECOGNIZE_SPEECH_ACTIVITY);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    "Tú dispositivo no soporta el reconocimiento por voz",
                    Toast.LENGTH_SHORT).show();
        }

    }

}



