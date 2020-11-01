package gz.app.comdavid.apprende2.Silabas;
//Librerias
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.Juegos.Silabas3.juegosil66;

//Clase
public class silaba_y extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silya,silyas,silye,silyes,silyo,silyos,silyis,silyi,silyu,silyus;
    //Declaramos las variables de sonidos
    MediaPlayer mpya,mpyaa,mpye,mpyee,mpyi,mpyii,mpyo,mpyoo,mpyu,mpyuu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_y);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silya=(ImageView) findViewById(R.id.yacimientos);
        silyas=(ImageView) findViewById(R.id.yates);
        silye=(ImageView) findViewById(R.id.yeguas);
        silyes=(ImageView) findViewById(R.id.yemas);
        silyos=(ImageView) findViewById(R.id.yogures);
        silyo=(ImageView) findViewById(R.id.yoyos);
        silyus=(ImageView) findViewById(R.id.yucas);
        silyu=(ImageView) findViewById(R.id.yunques);
        silyi=(ImageView) findViewById(R.id.yins);
        // evento que permite activar la silaba y
        findViewById(R.id.yas).setOnClickListener(this);
        findViewById(R.id.yes).setOnClickListener(this);
        findViewById(R.id.yos).setOnClickListener(this);
        findViewById(R.id.yis).setOnClickListener(this);
        findViewById(R.id.yus).setOnClickListener(this);

        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigy);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil66.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                // finaliza actividad
                finish();
            }
        });

        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casay);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), silabas.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                // finaliza actividad
                finish();
            }
        });

    }
    // Método OnClick
    @Override
    public void onClick(View view) {
        // Switch Case
        switch (view.getId()) {
        // si se selecciona la primera opción
            case R.id.yas:
                if(silya.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silya.setVisibility(View.VISIBLE);
                    silyas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silye.setVisibility(View.GONE);
                    silyes.setVisibility(View.GONE);
                    silyo.setVisibility(View.GONE);
                    silyos.setVisibility(View.GONE);
                    silyi.setVisibility(View.GONE);
                    silyu.setVisibility(View.GONE);
                    silyus.setVisibility(View.GONE);

                    // si se selecciona la imagen de yacimiento
                    ImageView sonidoba = (ImageView) findViewById(R.id.yacimientos);
                    mpya= MediaPlayer.create(this,R.raw.yacimiento);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpya.start();

                        }
                    });
                    // si se selecciona la imagen de yate
                    ImageView sonidobaa = (ImageView) findViewById(R.id.yates);
                    mpyaa= MediaPlayer.create(this,R.raw.yate);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpyaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silya.setVisibility(View.GONE);
                    silyas.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la segunda opción
            case R.id.yes:
                if(silye.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silye.setVisibility(View.VISIBLE);
                    silyes.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silya.setVisibility(View.GONE);
                    silyas.setVisibility(View.GONE);
                    silyo.setVisibility(View.GONE);
                    silyos.setVisibility(View.GONE);
                    silyi.setVisibility(View.GONE);
                    silyu.setVisibility(View.GONE);
                    silyus.setVisibility(View.GONE);

                    // si se selecciona la imagen de yegua
                    ImageView sonidobe = (ImageView) findViewById(R.id.yeguas);
                    mpye= MediaPlayer.create(this,R.raw.yegua);
                    // evento cuando se presione la imagen
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpye.start();

                        }
                    });
                    // si se selecciona la imagen de yema
                    ImageView sonidobee = (ImageView) findViewById(R.id.yemas);
                    mpyee= MediaPlayer.create(this,R.raw.yema);
                    // evento cuando se presione la imagen
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpyee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silye.setVisibility(View.GONE);
                    silyes.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la tercera opción
            case R.id.yos:
                if(silyo.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silyo.setVisibility(View.VISIBLE);
                    silyos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silya.setVisibility(View.GONE);
                    silyas.setVisibility(View.GONE);
                    silye.setVisibility(View.GONE);
                    silyes.setVisibility(View.GONE);
                    silyi.setVisibility(View.GONE);
                    silyu.setVisibility(View.GONE);
                    silyus.setVisibility(View.GONE);

                    // si se selecciona la imagen de vocal
                    ImageView sonidobo = (ImageView) findViewById(R.id.yoyos);
                    // evento cuando se presione la imagen
                    mpyo= MediaPlayer.create(this,R.raw.yoyo);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpyo.start();

                        }
                    });
                    // si se selecciona la imagen de yogurt
                    ImageView sonidoboo = (ImageView) findViewById(R.id.yogures);
                    mpyoo= MediaPlayer.create(this,R.raw.yogurt);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpyoo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silyo.setVisibility(View.GONE);
                    silyos.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.yis:
                if(silyi.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silyi.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silyo.setVisibility(View.GONE);
                    silyos.setVisibility(View.GONE);
                    silya.setVisibility(View.GONE);
                    silyas.setVisibility(View.GONE);
                    silye.setVisibility(View.GONE);
                    silyes.setVisibility(View.GONE);
                    silyu.setVisibility(View.GONE);
                    silyus.setVisibility(View.GONE);

                    // si se selecciona la imagen de yin
                    ImageView sonidobi = (ImageView) findViewById(R.id.yins);
                    mpyi= MediaPlayer.create(this,R.raw.yin);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpyi.start();

                        }
                    });
                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silyi.setVisibility(View.GONE);

                }

                break;
            // si se selecciona la quinta opción
            case R.id.yus:
                if(silyu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silyu.setVisibility(View.VISIBLE);
                    silyus.setVisibility(View.VISIBLE);
                    silyi.setVisibility(View.GONE);
                    // se  quitan el resto de imagenes
                    silyo.setVisibility(View.GONE);
                    silyos.setVisibility(View.GONE);
                    silya.setVisibility(View.GONE);
                    silyas.setVisibility(View.GONE);
                    silye.setVisibility(View.GONE);
                    silyes.setVisibility(View.GONE);
                    // si se selecciona la imagen de yuca
                    ImageView sonidobu = (ImageView) findViewById(R.id.yucas);
                    mpyu= MediaPlayer.create(this,R.raw.yuca);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpyu.start();

                        }
                    });
                    // si se selecciona la imagen de vuelta
                    ImageView sonidobuu = (ImageView) findViewById(R.id.yunques);
                    mpyuu= MediaPlayer.create(this,R.raw.yunque);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpyuu.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silyu.setVisibility(View.GONE);
                    silyus.setVisibility(View.GONE);
                }

                break;
        }

    }
}
