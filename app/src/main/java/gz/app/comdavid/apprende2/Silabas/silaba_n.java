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
import gz.app.comdavid.apprende2.juegosil36;
import gz.app.comdavid.apprende2.silabas;
//Clase
public class silaba_n extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silna,silnas,silne,silnes,silno,silnos,silnis,silni,silnu,silnus;
    //Declaramos las variables de sonidos
    MediaPlayer mpna,mpnaa,mpne,mpnee,mpni,mpnii,mpno,mpnoo,mpnu,mpnuu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_n);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silna=(ImageView) findViewById(R.id.narices);
        silnas=(ImageView) findViewById(R.id.navidades);
        silne=(ImageView) findViewById(R.id.negativos);
        silnes=(ImageView) findViewById(R.id.neveras);
        silnos=(ImageView) findViewById(R.id.noticias);
        silno=(ImageView) findViewById(R.id.noches);
        silnus=(ImageView) findViewById(R.id.nubes);
        silnu=(ImageView) findViewById(R.id.numeros);
        silnis=(ImageView) findViewById(R.id.ninnos);
        silni=(ImageView) findViewById(R.id.nieves);
        // evento que permite activar la silaba n
        findViewById(R.id.nas).setOnClickListener(this);
        findViewById(R.id.nes).setOnClickListener(this);
        findViewById(R.id.nos).setOnClickListener(this);
        findViewById(R.id.nis).setOnClickListener(this);
        findViewById(R.id.nus).setOnClickListener(this);

        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sign);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil36.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                // finaliza actividad
                finish();
            }
        });
        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casan);
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
            case R.id.nas:
                if(silna.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silna.setVisibility(View.VISIBLE);
                    silnas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silne.setVisibility(View.GONE);
                    silnes.setVisibility(View.GONE);
                    silno.setVisibility(View.GONE);
                    silnos.setVisibility(View.GONE);
                    silni.setVisibility(View.GONE);
                    silnis.setVisibility(View.GONE);
                    silnu.setVisibility(View.GONE);
                    silnus.setVisibility(View.GONE);
                    // si se selecciona la imagen de nariz
                    ImageView sonidoba = (ImageView) findViewById(R.id.narices);
                    mpna= MediaPlayer.create(this,R.raw.nariz);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpna.start();

                        }
                    });
                    // si se selecciona la imagen de navidad
                    ImageView sonidobaa = (ImageView) findViewById(R.id.navidades);
                    mpnaa= MediaPlayer.create(this,R.raw.navidad);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpnaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silna.setVisibility(View.GONE);
                    silnas.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la segunda opción
            case R.id.nes:
                if(silne.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silne.setVisibility(View.VISIBLE);
                    silnes.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silna.setVisibility(View.GONE);
                    silnas.setVisibility(View.GONE);
                    silno.setVisibility(View.GONE);
                    silnos.setVisibility(View.GONE);
                    silni.setVisibility(View.GONE);
                    silnis.setVisibility(View.GONE);
                    silnu.setVisibility(View.GONE);
                    silnus.setVisibility(View.GONE);
                    // si se selecciona la imagen de negativo
                    ImageView sonidobe = (ImageView) findViewById(R.id.negativos);
                    // evento cuando se presione la imagen
                    mpne= MediaPlayer.create(this,R.raw.negativo);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpne.start();

                        }
                    });
                    // si se selecciona la imagen de neveras
                    ImageView sonidobee = (ImageView) findViewById(R.id.neveras);
                    // evento cuando se presione la imagen
                    mpnee= MediaPlayer.create(this,R.raw.nevera);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpnee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silne.setVisibility(View.GONE);
                    silnes.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la tercera opción
            case R.id.nos:
                if(silno.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silno.setVisibility(View.VISIBLE);
                    silnos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silna.setVisibility(View.GONE);
                    silnas.setVisibility(View.GONE);
                    silne.setVisibility(View.GONE);
                    silnes.setVisibility(View.GONE);
                    silni.setVisibility(View.GONE);
                    silnis.setVisibility(View.GONE);
                    silnu.setVisibility(View.GONE);
                    silnus.setVisibility(View.GONE);
                    // si se selecciona la imagen de noche
                    ImageView sonidobo = (ImageView) findViewById(R.id.noches);
                    mpno= MediaPlayer.create(this,R.raw.noche);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpno.start();

                        }
                    });
                    // si se selecciona la imagen de montaña
                    ImageView sonidoboo = (ImageView) findViewById(R.id.noticias);
                    mpnoo= MediaPlayer.create(this,R.raw.noticia);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpnoo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silno.setVisibility(View.GONE);
                    silnos.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.nis:
                if(silni.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silni.setVisibility(View.VISIBLE);
                    silnis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silno.setVisibility(View.GONE);
                    silnos.setVisibility(View.GONE);
                    silna.setVisibility(View.GONE);
                    silnas.setVisibility(View.GONE);
                    silne.setVisibility(View.GONE);
                    silnes.setVisibility(View.GONE);
                    silnu.setVisibility(View.GONE);
                    silnus.setVisibility(View.GONE);
                    // si se selecciona la imagen de nieve
                    ImageView sonidobi = (ImageView) findViewById(R.id.nieves);
                    mpni= MediaPlayer.create(this,R.raw.nieve);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpni.start();

                        }
                    });
                    // si se selecciona la imagen de niña
                    ImageView sonidobii = (ImageView) findViewById(R.id.ninnos);
                    mpnii= MediaPlayer.create(this,R.raw.ninno);
                    // evento cuando se presione la imagen
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpnii.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silni.setVisibility(View.GONE);
                    silnis.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la quinta opción
            case R.id.nus:
                if(silnu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silnu.setVisibility(View.VISIBLE);
                    silnus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silni.setVisibility(View.GONE);
                    silnis.setVisibility(View.GONE);
                    silno.setVisibility(View.GONE);
                    silnos.setVisibility(View.GONE);
                    silna.setVisibility(View.GONE);
                    silnas.setVisibility(View.GONE);
                    silne.setVisibility(View.GONE);
                    silnes.setVisibility(View.GONE);
                    // si se selecciona la imagen de nube
                    ImageView sonidobu = (ImageView) findViewById(R.id.nubes);
                    mpnu= MediaPlayer.create(this,R.raw.nube);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpnu.start();

                        }
                    });
                    // si se selecciona la imagen de número
                    ImageView sonidobuu = (ImageView) findViewById(R.id.numeros);
                    mpnuu= MediaPlayer.create(this,R.raw.numero);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpnuu.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silnu.setVisibility(View.GONE);
                    silnus.setVisibility(View.GONE);
                }

                break;
        }

    }
}