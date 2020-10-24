package gz.app.comdavid.apprende2;
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

//Clase Juegossilaba
public class juegosil25 extends AppCompatActivity implements View.OnClickListener  {
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
        setContentView(R.layout.activity_juegosil25);
        //Se llama el audio
        mp4= MediaPlayer.create(this,R.raw.seleccionaelobjeto);
        //Reproduce el audio
        mp4.start();
        //Mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Se llaman las 5 silabas de la vista
        silba=(ImageView) findViewById(R.id.siljuegogu5);
        silbas=(ImageView) findViewById(R.id.siljuegogo4);
        silbe=(ImageView) findViewById(R.id.siljuegoga4);
        err=(ImageView) findViewById(R.id.silerror25);
        //Se llaman el contenedor
        casss=(RelativeLayout) findViewById(R.id.vista25);
        //Audio Bien
        mp= MediaPlayer.create(this,R.raw.bien);
        //Audio Mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        // Sonido Casa
        mp3= MediaPlayer.create(this,R.raw.gusano);
        // se llaman las Imagenes
        findViewById(R.id.siljuegogu1).setOnClickListener(this);
        findViewById(R.id.siljuegogu5).setOnClickListener(this);
        findViewById(R.id.siljuegogo4).setOnClickListener(this);
        findViewById(R.id.siljuegoga4).setOnClickListener(this);

        // sonido de la silaba 25
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas25);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // inicia el sonido
                mp4.start();

            }
        });
        // evento botón  inicio
        Button inicio= (Button) findViewById(R.id.casa_sill25);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // abre una actividad
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                // transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                // detiene los sonidos
                mp4.stop();
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
            case R.id.siljuegogo4:
                // muestra el icono de error en pantalla
                err.setVisibility(View.VISIBLE);
                // detiene el sonido principal
                mp4.stop();
                // reproduce el sonido de error
                mp2.start();

                break;
            // caso 2
            case R.id.siljuegoga4:
                // Muestra error en la pantalla
                err.setVisibility(View.VISIBLE);
                // Dertine el sonido principal
                mp4.stop();
                // Reproduce el sonido mal
                mp2.start();

                break;

                // Caso 3
            case R.id.siljuegogu5:
                // Elimina el resto de imagenes que puedan estar en pantalla
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                // Trae la imagen principal
                casss.setVisibility(View.VISIBLE);
                mp4.stop();
                // Reproduce el audio exitoso
                mp3.start();
                // Cambia de actividad
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Abre una nueva actividad
                        Intent intent=new Intent(juegosil25.this,silabas.class);
                        startActivity(intent);
                        // Transición
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);
                        // Finaliza la actividad
                        finish();
                    }
                },4000);
                break;

            // Caso 4
            case R.id.siljuegogu1:

                break;


        }
    }
}
