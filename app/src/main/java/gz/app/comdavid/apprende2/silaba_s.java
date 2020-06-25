package gz.app.comdavid.apprende2;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class silaba_s extends AppCompatActivity  implements View.OnClickListener{

    ImageView silsa,silsas,silse,silses,silso,silsos,silsis,silsi,silsu,silsus;
    MediaPlayer mpsa;
    MediaPlayer mpsaa;
    MediaPlayer mpse;
    MediaPlayer mpsee;
    MediaPlayer mpsi;
    MediaPlayer mpsii;
    MediaPlayer mpso;
    MediaPlayer mpsoo;
    MediaPlayer mpsu;
    MediaPlayer mpsuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_s);

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
        findViewById(R.id.sas).setOnClickListener(this);
        findViewById(R.id.ses).setOnClickListener(this);
        findViewById(R.id.sos).setOnClickListener(this);
        findViewById(R.id.sis).setOnClickListener(this);
        findViewById(R.id.sus).setOnClickListener(this);

        Button sig= (Button) findViewById(R.id.sigs);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegosil51.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });


        Button inicio= (Button) findViewById(R.id.sil_casas);
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
            case R.id.sas:
                if(silsa.getVisibility()==View.GONE){

                    silsa.setVisibility(View.VISIBLE);
                    silsas.setVisibility(View.VISIBLE);
                    silse.setVisibility(View.GONE);
                    silses.setVisibility(View.GONE);
                    silso.setVisibility(View.GONE);
                    silsos.setVisibility(View.GONE);
                    silsi.setVisibility(View.GONE);
                    silsis.setVisibility(View.GONE);
                    silsu.setVisibility(View.GONE);
                    silsus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.sacos);
                    mpsa= MediaPlayer.create(this,R.raw.saco);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpsa.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.sapos);
                    mpsaa= MediaPlayer.create(this,R.raw.sapo);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpsaa.start();

                        }
                    });










                }
                else{
                    silsa.setVisibility(View.GONE);
                    silsas.setVisibility(View.GONE);
                }

                break;
            case R.id.ses:
                if(silse.getVisibility()==View.GONE){
                    silse.setVisibility(View.VISIBLE);
                    silses.setVisibility(View.VISIBLE);
                    silsa.setVisibility(View.GONE);
                    silsas.setVisibility(View.GONE);
                    silso.setVisibility(View.GONE);
                    silsos.setVisibility(View.GONE);
                    silsi.setVisibility(View.GONE);
                    silsis.setVisibility(View.GONE);
                    silsu.setVisibility(View.GONE);
                    silsus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.sedas);
                    mpse= MediaPlayer.create(this,R.raw.secador);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpse.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.semillas);
                    mpsee= MediaPlayer.create(this,R.raw.semilla);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpsee.start();

                        }
                    });


                }
                else{
                    silse.setVisibility(View.GONE);
                    silses.setVisibility(View.GONE);
                }

                break;

            case R.id.sos:
                if(silso.getVisibility()==View.GONE){
                    silso.setVisibility(View.VISIBLE);
                    silsos.setVisibility(View.VISIBLE);
                    silsa.setVisibility(View.GONE);
                    silsas.setVisibility(View.GONE);
                    silse.setVisibility(View.GONE);
                    silses.setVisibility(View.GONE);
                    silsi.setVisibility(View.GONE);
                    silsis.setVisibility(View.GONE);
                    silsu.setVisibility(View.GONE);
                    silsus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.soles);
                    mpso= MediaPlayer.create(this,R.raw.sol);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpso.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.sombreros);
                    mpsoo= MediaPlayer.create(this,R.raw.sombrero);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpsoo.start();

                        }
                    });

                }
                else{
                    silso.setVisibility(View.GONE);
                    silsos.setVisibility(View.GONE);
                }
                break;

            case R.id.sis:
                if(silsi.getVisibility()==View.GONE){
                    silsi.setVisibility(View.VISIBLE);
                    silsis.setVisibility(View.VISIBLE);
                    silso.setVisibility(View.GONE);
                    silsos.setVisibility(View.GONE);
                    silsa.setVisibility(View.GONE);
                    silsas.setVisibility(View.GONE);
                    silse.setVisibility(View.GONE);
                    silses.setVisibility(View.GONE);
                    silsu.setVisibility(View.GONE);
                    silsus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.sillas);
                    mpsi= MediaPlayer.create(this,R.raw.silla);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpsi.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.silabas);
                    mpsii= MediaPlayer.create(this,R.raw.silabar);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpsii.start();

                        }
                    });


                }
                else{
                    silsi.setVisibility(View.GONE);
                    silsis.setVisibility(View.GONE);
                }

                break;

            case R.id.sus:
                if(silsu.getVisibility()==View.GONE){
                    silsu.setVisibility(View.VISIBLE);
                    silsus.setVisibility(View.VISIBLE);
                    silsi.setVisibility(View.GONE);
                    silsis.setVisibility(View.GONE);
                    silso.setVisibility(View.GONE);
                    silsos.setVisibility(View.GONE);
                    silsa.setVisibility(View.GONE);
                    silsas.setVisibility(View.GONE);
                    silse.setVisibility(View.GONE);
                    silses.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.suelos);
                    mpsu= MediaPlayer.create(this,R.raw.suelo);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpsu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.sures);
                    mpsuu= MediaPlayer.create(this,R.raw.suenoo);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpsuu.start();

                        }
                    });

                }
                else{
                    silsu.setVisibility(View.GONE);
                    silsus.setVisibility(View.GONE);
                }

                break;
        }

    }
}