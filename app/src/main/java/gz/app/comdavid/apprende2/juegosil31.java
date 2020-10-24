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
public class juegosil31 extends AppCompatActivity implements View.OnClickListener  {

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
        setContentView(R.layout.activity_juegosil31);
        //Se llama el audio
        mp4= MediaPlayer.create(this,R.raw.seleccionama);
        //Reproduce el audio
        mp4.start();
        //Mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //Se llaman las 5 silabas de la vista
        silba=(ImageView) findViewById(R.id.siljuegoma2);
        silbas=(ImageView) findViewById(R.id.siljuegome);
        silbe=(ImageView) findViewById(R.id.siljuegomi);
        err=(ImageView) findViewById(R.id.silerror31);
        //Se llaman el contenedor
        casss=(RelativeLayout) findViewById(R.id.vista31);
        //Audio Bien
        mp= MediaPlayer.create(this,R.raw.bien);
        //Audio Mal
        mp2= MediaPlayer.create(this,R.raw.mal);
        // Sonido mama
        mp3= MediaPlayer.create(this,R.raw.mama);
        // se llaman las Imagenes
        findViewById(R.id.siljuegoma2).setOnClickListener(this);
        findViewById(R.id.siljuegomi).setOnClickListener(this);
        findViewById(R.id.siljuegome).setOnClickListener(this);
        findViewById(R.id.siljuegoma).setOnClickListener(this);

        // sonido de la silaba 1
        Button sonidoa = (Button)findViewById(R.id.sonidosilabas31);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // inicia el sonido
                mp4.start();

            }
        });
        // evento botón  inicio
        Button inicio= (Button) findViewById(R.id.casa_sill31);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // abre una actividad
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                // transiciones
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                        mp4.stop();
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.siljuegoma2:


                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();

                break;
            case R.id.siljuegomi:
                err.setVisibility(View.VISIBLE);
                mp4.stop();
                mp2.start();

                break;

            case R.id.siljuegome:
                silba.setVisibility(View.GONE);
                silbas.setVisibility(View.GONE);
                silbe.setVisibility(View.GONE);
                err.setVisibility(View.GONE);
                casss.setVisibility(View.VISIBLE);
                mp4.stop();
                mp3.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent=new Intent(juegosil31.this,juegosil32.class);

                        startActivity(intent);
                        overridePendingTransition(R.anim.left_in, R.anim.left_out);

                        finish();

                    }
                },4000);




                break;

            case R.id.siljuegoma:

                break;


        }
    }
}







