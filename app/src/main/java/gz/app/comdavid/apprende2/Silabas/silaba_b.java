
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
import gz.app.comdavid.apprende2.Juegos.Silabas3.juegosil6;

//Clase
public class silaba_b extends  AppCompatActivity implements View.OnClickListener  {
    //Declaramos las variables de imagenes
    ImageView silba,silbas,silbe,silbes,silbo,silbos,silbis,silbi,silbu,silbus;
    //Declaramos las variables de sonidos
    MediaPlayer mpba,mpbaa,mpbe,mpbee,mpbi,mpbii,mpbo,mpboo,mpbu,mpbuu;

    //Metodo OnClick
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Se mantiene la pantalla activa
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_silaba_b);
        // se realiza el llamado de todas las imagenes de la interfaz
        silba=(ImageView) findViewById(R.id.balones);
        silbas=(ImageView) findViewById(R.id.barcos);
        silbe=(ImageView) findViewById(R.id.bebes);
        silbes=(ImageView) findViewById(R.id.bebidas);
        silbos=(ImageView) findViewById(R.id.bocas);
        silbo=(ImageView) findViewById(R.id.bolsas);
        silbus=(ImageView) findViewById(R.id.buhos);
        silbu=(ImageView) findViewById(R.id.burros);
        silbis=(ImageView) findViewById(R.id.bicis);
        silbi=(ImageView) findViewById(R.id.billetes);
        // evento que permite activar la silaba b
        findViewById(R.id.bas).setOnClickListener(this);
        findViewById(R.id.bes).setOnClickListener(this);
        findViewById(R.id.bos).setOnClickListener(this);
        findViewById(R.id.bi).setOnClickListener(this);
        findViewById(R.id.bus).setOnClickListener(this);

        // evento del botón inicio
        Button inicio= (Button) findViewById(R.id.sil_casab);
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
        // Botón siguiente
        Button sig= (Button) findViewById(R.id.sigb);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se abre una nueva actividad
                Intent intent=new Intent(v.getContext(), juegosil6.class);
                startActivityForResult(intent,0);
                // transición
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
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
            // caso BA
            case R.id.bas:
                // si se selecciona la primera opción
                if(silba.getVisibility()==View.GONE){

                    // se pone visible las 2 imagenes
                    silba.setVisibility(View.VISIBLE);
                    silbas.setVisibility(View.VISIBLE);
                    // se pone quitan el resto de imagenes
                    silbe.setVisibility(View.GONE);
                    silbes.setVisibility(View.GONE);
                    silbo.setVisibility(View.GONE);
                    silbos.setVisibility(View.GONE);
                    silbi.setVisibility(View.GONE);
                    silbis.setVisibility(View.GONE);
                    silbu.setVisibility(View.GONE);
                    silbus.setVisibility(View.GONE);

                    // si se selecciona la imagen de balon
                    ImageView sonidoba = (ImageView) findViewById(R.id.balones);
                    mpba= MediaPlayer.create(this,R.raw.balon);
                    // evento cuando se presione la imagen
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                        // inicia el sonido
                            mpba.start();

                        }
                    });
                    // si se selecciona la imagen de barco
                    ImageView sonidobaa = (ImageView) findViewById(R.id.barcos);
                    mpbaa= MediaPlayer.create(this,R.raw.barco);
                    // evento cuando se presione la imagen
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpbaa.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silba.setVisibility(View.GONE);
                    silbas.setVisibility(View.GONE);
                }

                break;
            // caso BE
            case R.id.bes:
                // si se selecciona la primera opción
                if(silbe.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silbe.setVisibility(View.VISIBLE);
                    silbes.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silba.setVisibility(View.GONE);
                    silbas.setVisibility(View.GONE);
                    silbo.setVisibility(View.GONE);
                    silbos.setVisibility(View.GONE);
                    silbi.setVisibility(View.GONE);
                    silbis.setVisibility(View.GONE);
                    silbu.setVisibility(View.GONE);
                    silbus.setVisibility(View.GONE);
                    // si se selecciona la imagen de bebida
                    ImageView sonidobe = (ImageView) findViewById(R.id.bebidas);
                    mpbe= MediaPlayer.create(this,R.raw.bebida);
                    // evento cuando se presione la imagen
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpbe.start();

                        }
                    });
                    // si se selecciona la imagen de bebe
                    ImageView sonidobee = (ImageView) findViewById(R.id.bebes);
                    mpbee= MediaPlayer.create(this,R.raw.bebe);
                    // evento cuando se presione la imagen
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpbee.start();

                        }
                    });


                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silbe.setVisibility(View.GONE);
                    silbes.setVisibility(View.GONE);
                }

                break;
            // caso BO
            case R.id.bos:
                // si se selecciona la segunda opción
                if(silbo.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silbo.setVisibility(View.VISIBLE);
                    silbos.setVisibility(View.VISIBLE);
                    // se  quitan el resto de imagenes
                    silba.setVisibility(View.GONE);
                    silbas.setVisibility(View.GONE);
                    silbe.setVisibility(View.GONE);
                    silbes.setVisibility(View.GONE);
                    silbi.setVisibility(View.GONE);
                    silbis.setVisibility(View.GONE);
                    silbu.setVisibility(View.GONE);
                    silbus.setVisibility(View.GONE);
                    // si se selecciona la imagen de boca
                    ImageView sonidobo = (ImageView) findViewById(R.id.bocas);
                    mpbo= MediaPlayer.create(this,R.raw.boca);
                    // evento cuando se presione la imagen
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpbo.start();

                        }
                    });
                    // si se selecciona la imagen de bolsa
                    ImageView sonidoboo = (ImageView) findViewById(R.id.bolsas);
                    mpboo= MediaPlayer.create(this,R.raw.bolsa);
                    // evento cuando se presione la imagen
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpboo.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silbo.setVisibility(View.GONE);
                    silbos.setVisibility(View.GONE);
                }
                break;
            // caso BI
            case R.id.bi:
                // si se selecciona la tercera opción
                if(silbi.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silbi.setVisibility(View.VISIBLE);
                    silbis.setVisibility(View.VISIBLE);
                    // se quitan el resto de imagenes
                    silbo.setVisibility(View.GONE);
                    silbos.setVisibility(View.GONE);
                    silba.setVisibility(View.GONE);
                    silbas.setVisibility(View.GONE);
                    silbe.setVisibility(View.GONE);
                    silbes.setVisibility(View.GONE);
                    silbu.setVisibility(View.GONE);
                    silbus.setVisibility(View.GONE);
                    // si se selecciona la imagen de billete
                    ImageView sonidobi = (ImageView) findViewById(R.id.billetes);
                    mpbi= MediaPlayer.create(this,R.raw.billete);
                    // evento cuando se presione la imagen
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpbi.start();

                        }
                    });
                    // si se selecciona la imagen de bicicleta
                    ImageView sonidobii = (ImageView) findViewById(R.id.bicis);
                    mpbii= MediaPlayer.create(this,R.raw.bicicleta);
                    // evento cuando se presione la imagen
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpbii.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silbi.setVisibility(View.GONE);
                    silbis.setVisibility(View.GONE);
                }

                break;
            // caso BU
            case R.id.bus:
                // si se selecciona la tercera opción
                if(silbu.getVisibility()==View.GONE){
                    // se pone visible las 2 imagenes
                    silbu.setVisibility(View.VISIBLE);
                    silbus.setVisibility(View.VISIBLE);
                    // se quitan el resto de imagenes
                    silbi.setVisibility(View.GONE);
                    silbis.setVisibility(View.GONE);
                    silbo.setVisibility(View.GONE);
                    silbos.setVisibility(View.GONE);
                    silba.setVisibility(View.GONE);
                    silbas.setVisibility(View.GONE);
                    silbe.setVisibility(View.GONE);
                    silbes.setVisibility(View.GONE);
                    // si se selecciona la imagen de burro
                    ImageView sonidobu = (ImageView) findViewById(R.id.burros);
                    mpbu= MediaPlayer.create(this,R.raw.burro);
                    // evento cuando se presione la imagen
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpbu.start();

                        }
                    });
                    // si se selecciona la imagen de buho
                    ImageView sonidobuu = (ImageView) findViewById(R.id.buhos);
                    mpbuu= MediaPlayer.create(this,R.raw.buho);
                    // evento cuando se presione la imagen
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // inicia el sonido
                            mpbuu.start();

                        }
                    });

                }
                else{
                    // cuando se presione alguna otra opción se desaparecen las imagenes
                    silbu.setVisibility(View.GONE);
                    silbus.setVisibility(View.GONE);
                }

                break;
        }
    }
}
