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
import gz.app.comdavid.apprende2.Juegos.Silabas3.juegosil51;

//Clase
public class silaba_s extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silsa,silsas,silse,silses,silso,silsos,silsis,silsi,silsu,silsus;
    //Declaramos las variables de sonidos
    MediaPlayer mpsa,mpsaa,mpse,mpsee,mpsi,mpsii,mpso,mpsoo,mpsuu,mpsu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_s);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silsa=(ImageView) findViewById(R.id.sapos);
        silsas=(ImageView) findViewById(R.id.sacos);
        silse=(ImageView) findViewById(R.id.semillas);
        silses=(ImageView) findViewById(R.id.sedas);
        silsos=(ImageView) findViewById(R.id.soles);
        silso=(ImageView) findViewById(R.id.sombreros);
        silsus=(ImageView) findViewById(R.id.suelos);
        silsu=(ImageView) findViewById(R.id.sures);
        silsis=(ImageView) findViewById(R.id.silabas);
        silsi=(ImageView) findViewById(R.id.sillas);
        // evento que permite activar la silaba s
        findViewById(R.id.sas).setOnClickListener(this);
        findViewById(R.id.ses).setOnClickListener(this);
        findViewById(R.id.sos).setOnClickListener(this);
        findViewById(R.id.sis).setOnClickListener(this);
        findViewById(R.id.sus).setOnClickListener(this);

        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigs);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil51.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                // finaliza actividad
                finish();
            }
        });

        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casas);
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
            case R.id.sas:
                if(silsa.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silsa.setVisibility(View.VISIBLE);
                    silsas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silse.setVisibility(View.GONE);
                    silses.setVisibility(View.GONE);
                    silso.setVisibility(View.GONE);
                    silsos.setVisibility(View.GONE);
                    silsi.setVisibility(View.GONE);
                    silsis.setVisibility(View.GONE);
                    silsu.setVisibility(View.GONE);
                    silsus.setVisibility(View.GONE);
                    // si se selecciona la imagen de saco
                    ImageView sonidoba = (ImageView) findViewById(R.id.sacos);
                    mpsa= MediaPlayer.create(this,R.raw.saco);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpsa.start();

                        }
                    });
                    // si se selecciona la imagen de sapo
                    ImageView sonidobaa = (ImageView) findViewById(R.id.sapos);
                    mpsaa= MediaPlayer.create(this,R.raw.sapo);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpsaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silsa.setVisibility(View.GONE);
                    silsas.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la segunda opción
            case R.id.ses:
                if(silse.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silse.setVisibility(View.VISIBLE);
                    silses.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silsa.setVisibility(View.GONE);
                    silsas.setVisibility(View.GONE);
                    silso.setVisibility(View.GONE);
                    silsos.setVisibility(View.GONE);
                    silsi.setVisibility(View.GONE);
                    silsis.setVisibility(View.GONE);
                    silsu.setVisibility(View.GONE);
                    silsus.setVisibility(View.GONE);

                    // si se selecciona la imagen de seda
                    ImageView sonidobe = (ImageView) findViewById(R.id.sedas);
                    mpse= MediaPlayer.create(this,R.raw.secador);
                    // evento cuando se presione la imagen
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpse.start();

                        }
                    });

                    // si se selecciona la imagen de semilla
                    ImageView sonidobee = (ImageView) findViewById(R.id.semillas);
                    // evento cuando se presione la imagen
                    mpsee= MediaPlayer.create(this,R.raw.semilla);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpsee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silse.setVisibility(View.GONE);
                    silses.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la tercera opción
            case R.id.sos:
                if(silso.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silso.setVisibility(View.VISIBLE);
                    silsos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silsa.setVisibility(View.GONE);
                    silsas.setVisibility(View.GONE);
                    silse.setVisibility(View.GONE);
                    silses.setVisibility(View.GONE);
                    silsi.setVisibility(View.GONE);
                    silsis.setVisibility(View.GONE);
                    silsu.setVisibility(View.GONE);
                    silsus.setVisibility(View.GONE);

                    // si se selecciona la imagen de sol
                    ImageView sonidobo = (ImageView) findViewById(R.id.soles);
                    mpso= MediaPlayer.create(this,R.raw.sol);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpso.start();

                        }
                    });

                    // si se selecciona la imagen de sombrero
                    ImageView sonidoboo = (ImageView) findViewById(R.id.sombreros);
                    mpsoo= MediaPlayer.create(this,R.raw.sombrero);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpsoo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silso.setVisibility(View.GONE);
                    silsos.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.sis:
                if(silsi.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silsi.setVisibility(View.VISIBLE);
                    silsis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silso.setVisibility(View.GONE);
                    silsos.setVisibility(View.GONE);
                    silsa.setVisibility(View.GONE);
                    silsas.setVisibility(View.GONE);
                    silse.setVisibility(View.GONE);
                    silses.setVisibility(View.GONE);
                    silsu.setVisibility(View.GONE);
                    silsus.setVisibility(View.GONE);
                    // si se selecciona la imagen de silla
                    ImageView sonidobi = (ImageView) findViewById(R.id.sillas);
                    mpsi= MediaPlayer.create(this,R.raw.silla);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpsi.start();

                        }
                    });
                    // si se selecciona la imagen de silaba
                    ImageView sonidobii = (ImageView) findViewById(R.id.silabas);
                    mpsii= MediaPlayer.create(this,R.raw.silabar);
                    // evento cuando se presione la imagen
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpsii.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silsi.setVisibility(View.GONE);
                    silsis.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la quinta opción
            case R.id.sus:
                if(silsu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silsu.setVisibility(View.VISIBLE);
                    silsus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silsi.setVisibility(View.GONE);
                    silsis.setVisibility(View.GONE);
                    silso.setVisibility(View.GONE);
                    silsos.setVisibility(View.GONE);
                    silsa.setVisibility(View.GONE);
                    silsas.setVisibility(View.GONE);
                    silse.setVisibility(View.GONE);
                    silses.setVisibility(View.GONE);
                    // si se selecciona la imagen de suelo
                    ImageView sonidobu = (ImageView) findViewById(R.id.suelos);
                    mpsu= MediaPlayer.create(this,R.raw.suelo);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpsu.start();

                        }
                    });
                    // si se selecciona la imagen de sur
                    ImageView sonidobuu = (ImageView) findViewById(R.id.sures);
                    mpsuu= MediaPlayer.create(this,R.raw.suenoo);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpsuu.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silsu.setVisibility(View.GONE);
                    silsus.setVisibility(View.GONE);
                }

                break;
        }

    }
}