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
import gz.app.comdavid.apprende2.juegosil16;
import gz.app.comdavid.apprende2.silabas;

//Clase
public class silaba_f extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silfa,silfas,silfe,silfes,silfo,silfos,silfis,silfi,silfu,silfus;
    //Declaramos las variables de sonidos
    MediaPlayer mpfa,mpfaa,mpfe,mpfee,mpfi,mpfii,mpfo,mpfoo,mpfu,mpfuu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_f);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silfa=(ImageView) findViewById(R.id.familias);
        silfas=(ImageView) findViewById(R.id.faros);
        silfe=(ImageView) findViewById(R.id.felices);
        silfes=(ImageView) findViewById(R.id.ferrocarriles);
        silfos=(ImageView) findViewById(R.id.fotografias);
        silfo=(ImageView) findViewById(R.id.focas);
        silfus=(ImageView) findViewById(R.id.fuentes);
        silfu=(ImageView) findViewById(R.id.fuegos);
        silfis=(ImageView) findViewById(R.id.filetes);
        silfi=(ImageView) findViewById(R.id.fichas);
        // evento que permite activar la silaba f
        findViewById(R.id.fas).setOnClickListener(this);
        findViewById(R.id.fes).setOnClickListener(this);
        findViewById(R.id.fos).setOnClickListener(this);
        findViewById(R.id.fis).setOnClickListener(this);
        findViewById(R.id.fus).setOnClickListener(this);
        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigf);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil16.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                // finaliza actividad
                finish();
            }
        });

        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casaf);
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
            // caso FA
            case R.id.fas:
                // si se selecciona la primera opción
                if(silfa.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silfa.setVisibility(View.VISIBLE);
                    silfas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silfe.setVisibility(View.GONE);
                    silfes.setVisibility(View.GONE);
                    silfo.setVisibility(View.GONE);
                    silfos.setVisibility(View.GONE);
                    silfi.setVisibility(View.GONE);
                    silfis.setVisibility(View.GONE);
                    silfu.setVisibility(View.GONE);
                    silfus.setVisibility(View.GONE);

                    // si se selecciona la imagen de familia
                    ImageView sonidoba = (ImageView) findViewById(R.id.familias);
                    // evento cuando se presione la imagen
                    mpfa= MediaPlayer.create(this,R.raw.familia);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpfa.start();

                        }
                    });
                    // si se selecciona la imagen de faros
                    ImageView sonidobaa = (ImageView) findViewById(R.id.faros);
                    mpfaa= MediaPlayer.create(this,R.raw.faro);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpfaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silfa.setVisibility(View.GONE);
                    silfas.setVisibility(View.GONE);
                }

                break;
            // caso FE
            case R.id.fes:
                // si se selecciona la segunda opción
                if(silfe.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silfe.setVisibility(View.VISIBLE);
                    silfes.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silfa.setVisibility(View.GONE);
                    silfas.setVisibility(View.GONE);
                    silfo.setVisibility(View.GONE);
                    silfos.setVisibility(View.GONE);
                    silfi.setVisibility(View.GONE);
                    silfis.setVisibility(View.GONE);
                    silfu.setVisibility(View.GONE);
                    silfus.setVisibility(View.GONE);

                    // si se selecciona la imagen de feliz
                    ImageView sonidobe = (ImageView) findViewById(R.id.felices);
                    mpfe= MediaPlayer.create(this,R.raw.feliz);
                    // evento cuando se presione la imagen
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpfe.start();

                        }
                    });
                    // si se selecciona la imagen de ferrocarril
                    ImageView sonidobee = (ImageView) findViewById(R.id.ferrocarriles);
                    mpfee= MediaPlayer.create(this,R.raw.ferrocarril);
                    // evento cuando se presione la imagen
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpfee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silfe.setVisibility(View.GONE);
                    silfes.setVisibility(View.GONE);
                }

                break;
            // caso FO
            case R.id.fos:
                // si se selecciona la tercera
                if(silfo.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silfo.setVisibility(View.VISIBLE);
                    silfos.setVisibility(View.VISIBLE);
                    // se pone quitan el resto de imagenes
                    silfa.setVisibility(View.GONE);
                    silfas.setVisibility(View.GONE);
                    silfe.setVisibility(View.GONE);
                    silfes.setVisibility(View.GONE);
                    silfi.setVisibility(View.GONE);
                    silfis.setVisibility(View.GONE);
                    silfu.setVisibility(View.GONE);
                    silfus.setVisibility(View.GONE);

                    // si se selecciona la imagen de foca
                    ImageView sonidobo = (ImageView) findViewById(R.id.focas);
                    mpfo= MediaPlayer.create(this,R.raw.foca);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpfo.start();

                        }
                    });
                    // si se selecciona la imagen de foto
                    ImageView sonidoboo = (ImageView) findViewById(R.id.fotografias);
                    mpfoo= MediaPlayer.create(this,R.raw.foto);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpfoo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silfo.setVisibility(View.GONE);
                    silfos.setVisibility(View.GONE);
                }
                break;
            // caso FI
            case R.id.fis:
                // si se selecciona la cuarta opción
                if(silfi.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silfi.setVisibility(View.VISIBLE);
                    silfis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silfo.setVisibility(View.GONE);
                    silfos.setVisibility(View.GONE);
                    silfa.setVisibility(View.GONE);
                    silfas.setVisibility(View.GONE);
                    silfe.setVisibility(View.GONE);
                    silfes.setVisibility(View.GONE);
                    silfu.setVisibility(View.GONE);
                    silfus.setVisibility(View.GONE);

                    // si se selecciona la imagen de ficha
                    ImageView sonidobi = (ImageView) findViewById(R.id.fichas);
                    mpfi= MediaPlayer.create(this,R.raw.ficha);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpfi.start();

                        }
                    });
                    // si se selecciona la imagen de filete
                    ImageView sonidobii = (ImageView) findViewById(R.id.filetes);
                    mpfii= MediaPlayer.create(this,R.raw.filete);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpfii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silfi.setVisibility(View.GONE);
                    silfis.setVisibility(View.GONE);
                }

                break;
            // caso FU
            case R.id.fus:
                // si se selecciona la quinta opción
                if(silfu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silfu.setVisibility(View.VISIBLE);
                    silfus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silfi.setVisibility(View.GONE);
                    silfis.setVisibility(View.GONE);
                    silfo.setVisibility(View.GONE);
                    silfos.setVisibility(View.GONE);
                    silfa.setVisibility(View.GONE);
                    silfas.setVisibility(View.GONE);
                    silfe.setVisibility(View.GONE);
                    silfes.setVisibility(View.GONE);
                    // si se selecciona la imagen de fuente
                    ImageView sonidobu = (ImageView) findViewById(R.id.fuentes);
                    mpfu= MediaPlayer.create(this,R.raw.fuente);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpfu.start();

                        }
                    });
                    // si se selecciona la imagen de fuegos
                    ImageView sonidobuu = (ImageView) findViewById(R.id.fuegos);
                    mpfuu= MediaPlayer.create(this,R.raw.fuego);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpfuu.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silfu.setVisibility(View.GONE);
                    silfus.setVisibility(View.GONE);
                }

                break;
        }

    }
}