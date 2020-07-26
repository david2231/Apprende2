package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class silaba_b extends  AppCompatActivity implements View.OnClickListener  {
    ImageView silba,silbas,silbe,silbes,silbo,silbos,silbis,silbi,silbu,silbus;
    MediaPlayer mpba;
    MediaPlayer mpbaa;
    MediaPlayer mpbe;
    MediaPlayer mpbee;
    MediaPlayer mpbi;
    MediaPlayer mpbii;
    MediaPlayer mpbo;
    MediaPlayer mpboo;
    MediaPlayer mpbu;
    MediaPlayer mpbuu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_b);

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
        findViewById(R.id.bas).setOnClickListener(this);
        findViewById(R.id.bes).setOnClickListener(this);
        findViewById(R.id.bos).setOnClickListener(this);
        findViewById(R.id.bi).setOnClickListener(this);
        findViewById(R.id.bus).setOnClickListener(this);

        Button inicio= (Button) findViewById(R.id.sil_casab);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });

        Button sig= (Button) findViewById(R.id.sigb);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegosil6.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bas:
                if(silba.getVisibility()==View.GONE){

                    silba.setVisibility(View.VISIBLE);
                    silbas.setVisibility(View.VISIBLE);
                    silbe.setVisibility(View.GONE);
                    silbes.setVisibility(View.GONE);
                    silbo.setVisibility(View.GONE);
                    silbos.setVisibility(View.GONE);
                    silbi.setVisibility(View.GONE);
                    silbis.setVisibility(View.GONE);
                    silbu.setVisibility(View.GONE);
                    silbus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.balones);
                    mpba= MediaPlayer.create(this,R.raw.balon);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpba.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.barcos);
                    mpbaa= MediaPlayer.create(this,R.raw.barco);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpbaa.start();

                        }
                    });


                }
                else{
                    silba.setVisibility(View.GONE);
                    silbas.setVisibility(View.GONE);
                }

                break;
            case R.id.bes:
                if(silbe.getVisibility()==View.GONE){
                    silbe.setVisibility(View.VISIBLE);
                    silbes.setVisibility(View.VISIBLE);
                    silba.setVisibility(View.GONE);
                    silbas.setVisibility(View.GONE);
                    silbo.setVisibility(View.GONE);
                    silbos.setVisibility(View.GONE);
                    silbi.setVisibility(View.GONE);
                    silbis.setVisibility(View.GONE);
                    silbu.setVisibility(View.GONE);
                    silbus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.bebidas);
                    mpbe= MediaPlayer.create(this,R.raw.bebida);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpbe.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.bebes);
                    mpbee= MediaPlayer.create(this,R.raw.bebe);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpbee.start();

                        }
                    });


                }
                else{
                    silbe.setVisibility(View.GONE);
                    silbes.setVisibility(View.GONE);
                }

                break;

            case R.id.bos:
                if(silbo.getVisibility()==View.GONE){
                    silbo.setVisibility(View.VISIBLE);
                    silbos.setVisibility(View.VISIBLE);
                    silba.setVisibility(View.GONE);
                    silbas.setVisibility(View.GONE);
                    silbe.setVisibility(View.GONE);
                    silbes.setVisibility(View.GONE);
                    silbi.setVisibility(View.GONE);
                    silbis.setVisibility(View.GONE);
                    silbu.setVisibility(View.GONE);
                    silbus.setVisibility(View.GONE);

                    ImageView sonidobo = (ImageView) findViewById(R.id.bocas);
                    mpbo= MediaPlayer.create(this,R.raw.boca);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpbo.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.bolsas);
                    mpboo= MediaPlayer.create(this,R.raw.bolsa);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpboo.start();

                        }
                    });

                }
                else{
                    silbo.setVisibility(View.GONE);
                    silbos.setVisibility(View.GONE);
                }
                break;

            case R.id.bi:
                if(silbi.getVisibility()==View.GONE){
                    silbi.setVisibility(View.VISIBLE);
                    silbis.setVisibility(View.VISIBLE);
                    silbo.setVisibility(View.GONE);
                    silbos.setVisibility(View.GONE);
                    silba.setVisibility(View.GONE);
                    silbas.setVisibility(View.GONE);
                    silbe.setVisibility(View.GONE);
                    silbes.setVisibility(View.GONE);
                    silbu.setVisibility(View.GONE);
                    silbus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.billetes);
                    mpbi= MediaPlayer.create(this,R.raw.billete);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpbi.start();

                        }
                    });

                    ImageView sonidobii = (ImageView) findViewById(R.id.bicis);
                    mpbii= MediaPlayer.create(this,R.raw.bicicleta);
                    sonidobii.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpbii.start();

                        }
                    });

                }
                else{
                    silbi.setVisibility(View.GONE);
                    silbis.setVisibility(View.GONE);
                }

                break;

            case R.id.bus:
                if(silbu.getVisibility()==View.GONE){
                    silbu.setVisibility(View.VISIBLE);
                    silbus.setVisibility(View.VISIBLE);
                    silbi.setVisibility(View.GONE);
                    silbis.setVisibility(View.GONE);
                    silbo.setVisibility(View.GONE);
                    silbos.setVisibility(View.GONE);
                    silba.setVisibility(View.GONE);
                    silbas.setVisibility(View.GONE);
                    silbe.setVisibility(View.GONE);
                    silbes.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.burros);
                    mpbu= MediaPlayer.create(this,R.raw.burro);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpbu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.buhos);
                    mpbuu= MediaPlayer.create(this,R.raw.buho);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpbuu.start();

                        }
                    });

                }
                else{
                    silbu.setVisibility(View.GONE);
                    silbus.setVisibility(View.GONE);
                }

                break;
        }
    }
}
