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
import gz.app.comdavid.apprende2.Juegos.Silabas3.juegosil46;

//Clase
public class silaba_r extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silra,silras,silre,silres,silro,silros,silris,silri,silru,silrus;
    //Declaramos las variables de sonidos
    MediaPlayer mpra,mpraa,mpre,mpree,mpri,mprii,mpro,mproo,mpru,mpruu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_r);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silra=(ImageView) findViewById(R.id.ranas);
        silras=(ImageView) findViewById(R.id.ratones);
        silre=(ImageView) findViewById(R.id.recetas);
        silres=(ImageView) findViewById(R.id.remos);
        silros=(ImageView) findViewById(R.id.ropas);
        silro=(ImageView) findViewById(R.id.rosas);
        silrus=(ImageView) findViewById(R.id.rubis);
        silru=(ImageView) findViewById(R.id.ruletas);
        silris=(ImageView) findViewById(R.id.rinnons);
        silri=(ImageView) findViewById(R.id.rios);
        // evento que permite activar la silaba r
        findViewById(R.id.ras).setOnClickListener(this);
        findViewById(R.id.res).setOnClickListener(this);
        findViewById(R.id.ros).setOnClickListener(this);
        findViewById(R.id.ris).setOnClickListener(this);
        findViewById(R.id.rus).setOnClickListener(this);
        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigrr);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil46.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                // finaliza actividad
                finish();
            }
        });

        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casar);
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
            case R.id.ras:
                if(silra.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silra.setVisibility(View.VISIBLE);
                    silras.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silre.setVisibility(View.GONE);
                    silres.setVisibility(View.GONE);
                    silro.setVisibility(View.GONE);
                    silros.setVisibility(View.GONE);
                    silri.setVisibility(View.GONE);
                    silris.setVisibility(View.GONE);
                    silru.setVisibility(View.GONE);
                    silrus.setVisibility(View.GONE);
                    // si se selecciona la imagen de rana
                    ImageView sonidoba = (ImageView) findViewById(R.id.ranas);
                    mpra= MediaPlayer.create(this,R.raw.rana);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpra.start();

                        }
                    });
                    // si se selecciona la imagen de ratón
                    ImageView sonidobaa = (ImageView) findViewById(R.id.ratones);
                    mpraa= MediaPlayer.create(this,R.raw.raton);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpraa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silra.setVisibility(View.GONE);
                    silras.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la segunda opción
            case R.id.res:
                if(silre.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silre.setVisibility(View.VISIBLE);
                    silres.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silra.setVisibility(View.GONE);
                    silras.setVisibility(View.GONE);
                    silro.setVisibility(View.GONE);
                    silros.setVisibility(View.GONE);
                    silri.setVisibility(View.GONE);
                    silris.setVisibility(View.GONE);
                    silru.setVisibility(View.GONE);
                    silrus.setVisibility(View.GONE);
                    // si se selecciona la imagen de receta
                    ImageView sonidobe = (ImageView) findViewById(R.id.recetas);
                    mpre= MediaPlayer.create(this,R.raw.regla);
                    // evento cuando se presione la imagen
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpre.start();

                        }
                    });
                    // si se selecciona la imagen de remo
                    ImageView sonidobee = (ImageView) findViewById(R.id.remos);
                    mpree= MediaPlayer.create(this,R.raw.regalo);
                    // evento cuando se presione la imagen
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpree.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silre.setVisibility(View.GONE);
                    silres.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la tercera opción
            case R.id.ros:
                if(silro.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silro.setVisibility(View.VISIBLE);
                    silros.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silra.setVisibility(View.GONE);
                    silras.setVisibility(View.GONE);
                    silre.setVisibility(View.GONE);
                    silres.setVisibility(View.GONE);
                    silri.setVisibility(View.GONE);
                    silris.setVisibility(View.GONE);
                    silru.setVisibility(View.GONE);
                    silrus.setVisibility(View.GONE);
                    // si se selecciona la imagen de ropa
                    ImageView sonidobo = (ImageView) findViewById(R.id.ropas);
                    mpro= MediaPlayer.create(this,R.raw.ropa);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpro.start();

                        }
                    });
                    // si se selecciona la imagen de rosa
                    ImageView sonidoboo = (ImageView) findViewById(R.id.rosas);
                    mproo= MediaPlayer.create(this,R.raw.rosa);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mproo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silro.setVisibility(View.GONE);
                    silros.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.ris:
                if(silri.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silri.setVisibility(View.VISIBLE);
                    silris.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silro.setVisibility(View.GONE);
                    silros.setVisibility(View.GONE);
                    silra.setVisibility(View.GONE);
                    silras.setVisibility(View.GONE);
                    silre.setVisibility(View.GONE);
                    silres.setVisibility(View.GONE);
                    silru.setVisibility(View.GONE);
                    silrus.setVisibility(View.GONE);
                    // si se selecciona la imagen de risa
                    ImageView sonidobi = (ImageView) findViewById(R.id.rinnons);
                    mpri= MediaPlayer.create(this,R.raw.risa);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpri.start();

                        }
                    });
                    // si se selecciona la imagen de rio
                    ImageView sonidobii = (ImageView) findViewById(R.id.rios);
                    mprii= MediaPlayer.create(this,R.raw.rio);
                    // evento cuando se presione la imagen
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mprii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silri.setVisibility(View.GONE);
                    silris.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la quinta opción
            case R.id.rus:
                if(silru.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silru.setVisibility(View.VISIBLE);
                    silrus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silri.setVisibility(View.GONE);
                    silris.setVisibility(View.GONE);
                    silro.setVisibility(View.GONE);
                    silros.setVisibility(View.GONE);
                    silra.setVisibility(View.GONE);
                    silras.setVisibility(View.GONE);
                    silre.setVisibility(View.GONE);
                    silres.setVisibility(View.GONE);
                    // si se selecciona la imagen de rubi
                    ImageView sonidobu = (ImageView) findViewById(R.id.rubis);
                    mpru= MediaPlayer.create(this,R.raw.rubi);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpru.start();

                        }
                    });
                    // si se selecciona la imagen de pulga
                    ImageView sonidobuu = (ImageView) findViewById(R.id.ruletas);
                    mpruu= MediaPlayer.create(this,R.raw.ruleta);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpruu.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silru.setVisibility(View.GONE);
                    silrus.setVisibility(View.GONE);
                }

                break;
        }

    }
}