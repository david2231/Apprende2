package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class silaba_n extends AppCompatActivity  implements View.OnClickListener{

    ImageView silna,silnas,silne,silnes,silno,silnos,silnis,silni,silnu,silnus;
    MediaPlayer mpna;
    MediaPlayer mpnaa;
    MediaPlayer mpne;
    MediaPlayer mpnee;
    MediaPlayer mpni;
    MediaPlayer mpnii;
    MediaPlayer mpno;
    MediaPlayer mpnoo;
    MediaPlayer mpnu;
    MediaPlayer mpnuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_n);

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
        findViewById(R.id.nas).setOnClickListener(this);
        findViewById(R.id.nes).setOnClickListener(this);
        findViewById(R.id.nos).setOnClickListener(this);
        findViewById(R.id.nis).setOnClickListener(this);
        findViewById(R.id.nus).setOnClickListener(this);

        Button sig= (Button) findViewById(R.id.sign);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegosil36.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });

        Button inicio= (Button) findViewById(R.id.sil_casan);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.nas:
                if(silna.getVisibility()==View.GONE){

                    silna.setVisibility(View.VISIBLE);
                    silnas.setVisibility(View.VISIBLE);
                    silne.setVisibility(View.GONE);
                    silnes.setVisibility(View.GONE);
                    silno.setVisibility(View.GONE);
                    silnos.setVisibility(View.GONE);
                    silni.setVisibility(View.GONE);
                    silnis.setVisibility(View.GONE);
                    silnu.setVisibility(View.GONE);
                    silnus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.narices);
                    mpna= MediaPlayer.create(this,R.raw.nariz);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpna.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.navidades);
                    mpnaa= MediaPlayer.create(this,R.raw.navidad);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpnaa.start();

                        }
                    });









                }
                else{
                    silna.setVisibility(View.GONE);
                    silnas.setVisibility(View.GONE);
                }

                break;
            case R.id.nes:
                if(silne.getVisibility()==View.GONE){
                    silne.setVisibility(View.VISIBLE);
                    silnes.setVisibility(View.VISIBLE);
                    silna.setVisibility(View.GONE);
                    silnas.setVisibility(View.GONE);
                    silno.setVisibility(View.GONE);
                    silnos.setVisibility(View.GONE);
                    silni.setVisibility(View.GONE);
                    silnis.setVisibility(View.GONE);
                    silnu.setVisibility(View.GONE);
                    silnus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.negativos);
                    mpne= MediaPlayer.create(this,R.raw.negativo);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpne.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.neveras);
                    mpnee= MediaPlayer.create(this,R.raw.nevera);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpnee.start();

                        }
                    });


                }
                else{
                    silne.setVisibility(View.GONE);
                    silnes.setVisibility(View.GONE);
                }

                break;

            case R.id.nos:
                if(silno.getVisibility()==View.GONE){
                    silno.setVisibility(View.VISIBLE);
                    silnos.setVisibility(View.VISIBLE);
                    silna.setVisibility(View.GONE);
                    silnas.setVisibility(View.GONE);
                    silne.setVisibility(View.GONE);
                    silnes.setVisibility(View.GONE);
                    silni.setVisibility(View.GONE);
                    silnis.setVisibility(View.GONE);
                    silnu.setVisibility(View.GONE);
                    silnus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.noches);
                    mpno= MediaPlayer.create(this,R.raw.noche);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpno.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.noticias);
                    mpnoo= MediaPlayer.create(this,R.raw.noticia);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpnoo.start();

                        }
                    });

                }
                else{
                    silno.setVisibility(View.GONE);
                    silnos.setVisibility(View.GONE);
                }
                break;

            case R.id.nis:
                if(silni.getVisibility()==View.GONE){
                    silni.setVisibility(View.VISIBLE);
                    silnis.setVisibility(View.VISIBLE);
                    silno.setVisibility(View.GONE);
                    silnos.setVisibility(View.GONE);
                    silna.setVisibility(View.GONE);
                    silnas.setVisibility(View.GONE);
                    silne.setVisibility(View.GONE);
                    silnes.setVisibility(View.GONE);
                    silnu.setVisibility(View.GONE);
                    silnus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.nieves);
                    mpni= MediaPlayer.create(this,R.raw.nieve);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpni.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.ninnos);
                    mpnii= MediaPlayer.create(this,R.raw.ninno);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpnii.start();

                        }
                    });


                }
                else{
                    silni.setVisibility(View.GONE);
                    silnis.setVisibility(View.GONE);
                }

                break;

            case R.id.nus:
                if(silnu.getVisibility()==View.GONE){
                    silnu.setVisibility(View.VISIBLE);
                    silnus.setVisibility(View.VISIBLE);
                    silni.setVisibility(View.GONE);
                    silnis.setVisibility(View.GONE);
                    silno.setVisibility(View.GONE);
                    silnos.setVisibility(View.GONE);
                    silna.setVisibility(View.GONE);
                    silnas.setVisibility(View.GONE);
                    silne.setVisibility(View.GONE);
                    silnes.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.nubes);
                    mpnu= MediaPlayer.create(this,R.raw.nube);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpnu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.numeros);
                    mpnuu= MediaPlayer.create(this,R.raw.numero);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpnuu.start();

                        }
                    });

                }
                else{
                    silnu.setVisibility(View.GONE);
                    silnus.setVisibility(View.GONE);
                }

                break;
        }

    }
}