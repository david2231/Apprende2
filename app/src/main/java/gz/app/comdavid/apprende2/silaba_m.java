package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class silaba_m extends AppCompatActivity  implements View.OnClickListener{

    ImageView silma,silmas,silme,silmes,silmo,silmos,silmis,silmi,silmu,silmus;
    MediaPlayer mpma;
    MediaPlayer mpmaa;
    MediaPlayer mpme;
    MediaPlayer mpmee;
    MediaPlayer mpmi;
    MediaPlayer mpmii;
    MediaPlayer mpmo;
    MediaPlayer mpmoo;
    MediaPlayer mpmu;
    MediaPlayer mpmuu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_m);

        silma=(ImageView) findViewById(R.id.mamas);
        silmas=(ImageView) findViewById(R.id.mangos);
        silme=(ImageView) findViewById(R.id.medallas);
        silmes=(ImageView) findViewById(R.id.mesas);
        silmos=(ImageView) findViewById(R.id.montannas);
        silmo=(ImageView) findViewById(R.id.monedas);
        silmus=(ImageView) findViewById(R.id.munnecas);
        silmu=(ImageView) findViewById(R.id.murcielagos);
        silmis=(ImageView) findViewById(R.id.micos);
        silmi=(ImageView) findViewById(R.id.mieles);
        findViewById(R.id.mas).setOnClickListener(this);
        findViewById(R.id.mes).setOnClickListener(this);
        findViewById(R.id.mos).setOnClickListener(this);
        findViewById(R.id.mis).setOnClickListener(this);
        findViewById(R.id.mus).setOnClickListener(this);

        Button inicio= (Button) findViewById(R.id.sil_casam);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });

        Button sig= (Button) findViewById(R.id.sigm);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegosil31.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.mas:
                if(silma.getVisibility()==View.GONE){

                    silma.setVisibility(View.VISIBLE);
                    silmas.setVisibility(View.VISIBLE);
                    silme.setVisibility(View.GONE);
                    silmes.setVisibility(View.GONE);
                    silmo.setVisibility(View.GONE);
                    silmos.setVisibility(View.GONE);
                    silmi.setVisibility(View.GONE);
                    silmis.setVisibility(View.GONE);
                    silmu.setVisibility(View.GONE);
                    silmus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.mamas);
                    mpma= MediaPlayer.create(this,R.raw.mama);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpma.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.mangos);
                    mpmaa= MediaPlayer.create(this,R.raw.mango);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpmaa.start();

                        }
                    });











                }
                else{
                    silma.setVisibility(View.GONE);
                    silmas.setVisibility(View.GONE);
                }

                break;
            case R.id.mes:
                if(silme.getVisibility()==View.GONE){
                    silme.setVisibility(View.VISIBLE);
                    silmes.setVisibility(View.VISIBLE);
                    silma.setVisibility(View.GONE);
                    silmas.setVisibility(View.GONE);
                    silmo.setVisibility(View.GONE);
                    silmos.setVisibility(View.GONE);
                    silmi.setVisibility(View.GONE);
                    silmis.setVisibility(View.GONE);
                    silmu.setVisibility(View.GONE);
                    silmus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.medallas);
                    mpme= MediaPlayer.create(this,R.raw.medalla);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpme.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.mesas);
                    mpmee= MediaPlayer.create(this,R.raw.mesa);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpmee.start();

                        }
                    });


                }
                else{
                    silme.setVisibility(View.GONE);
                    silmes.setVisibility(View.GONE);
                }

                break;

            case R.id.mos:
                if(silmo.getVisibility()==View.GONE){
                    silmo.setVisibility(View.VISIBLE);
                    silmos.setVisibility(View.VISIBLE);
                    silma.setVisibility(View.GONE);
                    silmas.setVisibility(View.GONE);
                    silme.setVisibility(View.GONE);
                    silmes.setVisibility(View.GONE);
                    silmi.setVisibility(View.GONE);
                    silmis.setVisibility(View.GONE);
                    silmu.setVisibility(View.GONE);
                    silmus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.monedas);
                    mpmo= MediaPlayer.create(this,R.raw.moneda);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpmo.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.montannas);
                    mpmoo= MediaPlayer.create(this,R.raw.montanna);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpmoo.start();

                        }
                    });

                }
                else{
                    silmo.setVisibility(View.GONE);
                    silmos.setVisibility(View.GONE);
                }
                break;

            case R.id.mis:
                if(silmi.getVisibility()==View.GONE){
                    silmi.setVisibility(View.VISIBLE);
                    silmis.setVisibility(View.VISIBLE);
                    silmo.setVisibility(View.GONE);
                    silmos.setVisibility(View.GONE);
                    silma.setVisibility(View.GONE);
                    silmas.setVisibility(View.GONE);
                    silme.setVisibility(View.GONE);
                    silmes.setVisibility(View.GONE);
                    silmu.setVisibility(View.GONE);
                    silmus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.micos);
                    mpmi= MediaPlayer.create(this,R.raw.mico);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpmi.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.mieles);
                    mpmii= MediaPlayer.create(this,R.raw.miel);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpmii.start();

                        }
                    });

                }
                else{
                    silmi.setVisibility(View.GONE);
                    silmis.setVisibility(View.GONE);
                }

                break;

            case R.id.mus:
                if(silmu.getVisibility()==View.GONE){
                    silmu.setVisibility(View.VISIBLE);
                    silmus.setVisibility(View.VISIBLE);
                    silmi.setVisibility(View.GONE);
                    silmis.setVisibility(View.GONE);
                    silmo.setVisibility(View.GONE);
                    silmos.setVisibility(View.GONE);
                    silma.setVisibility(View.GONE);
                    silmas.setVisibility(View.GONE);
                    silme.setVisibility(View.GONE);
                    silmes.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.munnecas);
                    mpmu= MediaPlayer.create(this,R.raw.munneca);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpmu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.murcielagos);
                    mpmuu= MediaPlayer.create(this,R.raw.murcielago);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpmuu.start();

                        }
                    });

                }
                else{
                    silmu.setVisibility(View.GONE);
                    silmus.setVisibility(View.GONE);
                }

                break;
        }

    }
}