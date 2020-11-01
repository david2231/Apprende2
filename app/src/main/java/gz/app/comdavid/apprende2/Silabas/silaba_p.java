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
import gz.app.comdavid.apprende2.Juegos.Silabas3.juegosil41;

//Clase
public class silaba_p extends AppCompatActivity  implements View.OnClickListener{
    //Declaramos las variables de imagenes
    ImageView silpa,silpas,silpe,silpes,silpo,silpos,silpis,silpi,silpu,silpus;
    //Declaramos las variables de sonidos
    MediaPlayer mppa,mppaa,mppe,mppee,mppi,mppii,mppo,mppoo,mppu,mppuu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_p);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        // se realiza el llamado de todas las imagenes de la interfaz
        silpa=(ImageView) findViewById(R.id.papas);
        silpas=(ImageView) findViewById(R.id.payasos);
        silpe=(ImageView) findViewById(R.id.peras);
        silpes=(ImageView) findViewById(R.id.perros);
        silpos=(ImageView) findViewById(R.id.policias);
        silpo=(ImageView) findViewById(R.id.pollos);
        silpus=(ImageView) findViewById(R.id.puertas);
        silpu=(ImageView) findViewById(R.id.pulgas);
        silpis=(ImageView) findViewById(R.id.pianos);
        silpi=(ImageView) findViewById(R.id.pinnas);
        // evento que permite activar la silaba p
        findViewById(R.id.pas).setOnClickListener(this);
        findViewById(R.id.pes).setOnClickListener(this);
        findViewById(R.id.pos).setOnClickListener(this);
        findViewById(R.id.pis).setOnClickListener(this);
        findViewById(R.id.pus).setOnClickListener(this);

        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigp);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil41.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                // finaliza actividad
                finish();
            }
        });

        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casap);
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
            case R.id.pas:
                if(silpa.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silpa.setVisibility(View.VISIBLE);
                    silpas.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silpe.setVisibility(View.GONE);
                    silpes.setVisibility(View.GONE);
                    silpo.setVisibility(View.GONE);
                    silpos.setVisibility(View.GONE);
                    silpi.setVisibility(View.GONE);
                    silpis.setVisibility(View.GONE);
                    silpu.setVisibility(View.GONE);
                    silpus.setVisibility(View.GONE);
                    // si se selecciona la imagen de papá
                    ImageView sonidoba = (ImageView) findViewById(R.id.papas);
                    mppa= MediaPlayer.create(this,R.raw.papa);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mppa.start();

                        }
                    });
                    // si se selecciona la imagen de payasos
                    ImageView sonidobaa = (ImageView) findViewById(R.id.payasos);
                    // evento cuando se presione la imagen
                    mppaa= MediaPlayer.create(this,R.raw.payaso);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mppaa.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silpa.setVisibility(View.GONE);
                    silpas.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la segunda opción
            case R.id.pes:
                if(silpe.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silpe.setVisibility(View.VISIBLE);
                    silpes.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silpa.setVisibility(View.GONE);
                    silpas.setVisibility(View.GONE);
                    silpo.setVisibility(View.GONE);
                    silpos.setVisibility(View.GONE);
                    silpi.setVisibility(View.GONE);
                    silpis.setVisibility(View.GONE);
                    silpu.setVisibility(View.GONE);
                    silpus.setVisibility(View.GONE);
                    // si se selecciona la imagen de negativo
                    ImageView sonidobe = (ImageView) findViewById(R.id.peras);
                    // evento cuando se presione la imagen
                    mppe= MediaPlayer.create(this,R.raw.pera);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mppe.start();

                        }
                    });
                    // si se selecciona la imagen de perro
                    ImageView sonidobee = (ImageView) findViewById(R.id.perros);
                    mppee= MediaPlayer.create(this,R.raw.perro);
                    // evento cuando se presione la imagen
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mppee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silpe.setVisibility(View.GONE);
                    silpes.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la tercera opción
            case R.id.pos:
                if(silpo.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silpo.setVisibility(View.VISIBLE);
                    silpos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silpa.setVisibility(View.GONE);
                    silpas.setVisibility(View.GONE);
                    silpe.setVisibility(View.GONE);
                    silpes.setVisibility(View.GONE);
                    silpi.setVisibility(View.GONE);
                    silpis.setVisibility(View.GONE);
                    silpu.setVisibility(View.GONE);
                    silpus.setVisibility(View.GONE);
                    // si se selecciona la imagen de policia
                    ImageView sonidobo = (ImageView) findViewById(R.id.policias);
                    mppo= MediaPlayer.create(this,R.raw.policia);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mppo.start();

                        }
                    });
                    // si se selecciona la imagen de pollo
                    ImageView sonidoboo = (ImageView) findViewById(R.id.pollos);
                    mppoo= MediaPlayer.create(this,R.raw.pollo);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mppoo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silpo.setVisibility(View.GONE);
                    silpos.setVisibility(View.GONE);
                }
                break;
            // si se selecciona la cuarta opción
            case R.id.pis:
                if(silpi.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silpi.setVisibility(View.VISIBLE);
                    silpis.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silpo.setVisibility(View.GONE);
                    silpos.setVisibility(View.GONE);
                    silpa.setVisibility(View.GONE);
                    silpas.setVisibility(View.GONE);
                    silpe.setVisibility(View.GONE);
                    silpes.setVisibility(View.GONE);
                    silpu.setVisibility(View.GONE);
                    silpus.setVisibility(View.GONE);
                    // si se selecciona la imagen de piña
                    ImageView sonidobi = (ImageView) findViewById(R.id.pinnas);
                    mppi= MediaPlayer.create(this,R.raw.pinna);
                     // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mppi.start();

                        }
                    });
                    // si se selecciona la imagen de piano
                    ImageView sonidobii = (ImageView) findViewById(R.id.pianos);
                    mppii= MediaPlayer.create(this,R.raw.piano);
                    // evento cuando se presione la imagen
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mppii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silpi.setVisibility(View.GONE);
                    silpis.setVisibility(View.GONE);
                }

                break;
            // si se selecciona la quinta opción
            case R.id.pus:

                if(silpu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silpu.setVisibility(View.VISIBLE);
                    silpus.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silpi.setVisibility(View.GONE);
                    silpis.setVisibility(View.GONE);
                    silpo.setVisibility(View.GONE);
                    silpos.setVisibility(View.GONE);
                    silpa.setVisibility(View.GONE);
                    silpas.setVisibility(View.GONE);
                    silpe.setVisibility(View.GONE);
                    silpes.setVisibility(View.GONE);
                    // si se selecciona la imagen de puerta
                    ImageView sonidobu = (ImageView) findViewById(R.id.puertas);
                    mppu= MediaPlayer.create(this,R.raw.puerta);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mppu.start();

                        }
                    });
                    // si se selecciona la imagen de pulga
                    ImageView sonidobuu = (ImageView) findViewById(R.id.pulgas);
                    mppuu= MediaPlayer.create(this,R.raw.pulga);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mppuu.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silpu.setVisibility(View.GONE);
                    silpus.setVisibility(View.GONE);
                }

                break;
        }

    }
}