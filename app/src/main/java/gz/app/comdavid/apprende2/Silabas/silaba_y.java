package gz.app.comdavid.apprende2.Silabas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.juegosil66;
import gz.app.comdavid.apprende2.silabas;

public class silaba_y extends AppCompatActivity  implements View.OnClickListener{

    ImageView silya,silyas,silye,silyes,silyo,silyos,silyis,silyi,silyu,silyus;
    MediaPlayer mpya;
    MediaPlayer mpyaa;
    MediaPlayer mpye;
    MediaPlayer mpyee;
    MediaPlayer mpyi;
    MediaPlayer mpyii;
    MediaPlayer mpyo;
    MediaPlayer mpyoo;
    MediaPlayer mpyu;
    MediaPlayer mpyuu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silaba_y);

        silya=(ImageView) findViewById(R.id.yacimientos);
        silyas=(ImageView) findViewById(R.id.yates);
        silye=(ImageView) findViewById(R.id.yeguas);
        silyes=(ImageView) findViewById(R.id.yemas);
        silyos=(ImageView) findViewById(R.id.yogures);
        silyo=(ImageView) findViewById(R.id.yoyos);
        silyus=(ImageView) findViewById(R.id.yucas);
        silyu=(ImageView) findViewById(R.id.yunques);
        silyi=(ImageView) findViewById(R.id.yins);
        findViewById(R.id.yas).setOnClickListener(this);
        findViewById(R.id.yes).setOnClickListener(this);
        findViewById(R.id.yos).setOnClickListener(this);
        findViewById(R.id.yis).setOnClickListener(this);
        findViewById(R.id.yus).setOnClickListener(this);

        Button sig= (Button) findViewById(R.id.sigy);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), juegosil66.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finish();
            }
        });


        Button inicio= (Button) findViewById(R.id.sil_casay);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), silabas.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.yas:
                if(silya.getVisibility()==View.GONE){

                    silya.setVisibility(View.VISIBLE);
                    silyas.setVisibility(View.VISIBLE);
                    silye.setVisibility(View.GONE);
                    silyes.setVisibility(View.GONE);
                    silyo.setVisibility(View.GONE);
                    silyos.setVisibility(View.GONE);
                    silyi.setVisibility(View.GONE);
                    silyu.setVisibility(View.GONE);
                    silyus.setVisibility(View.GONE);

                    ImageView sonidoba = (ImageView) findViewById(R.id.yacimientos);
                    mpya= MediaPlayer.create(this,R.raw.yacimiento);
                    sonidoba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpya.start();

                        }
                    });

                    ImageView sonidobaa = (ImageView) findViewById(R.id.yates);
                    mpyaa= MediaPlayer.create(this,R.raw.yate);
                    sonidobaa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpyaa.start();

                        }
                    });












                }
                else{
                    silya.setVisibility(View.GONE);
                    silyas.setVisibility(View.GONE);
                }

                break;
            case R.id.yes:
                if(silye.getVisibility()==View.GONE){
                    silye.setVisibility(View.VISIBLE);
                    silyes.setVisibility(View.VISIBLE);
                    silya.setVisibility(View.GONE);
                    silyas.setVisibility(View.GONE);
                    silyo.setVisibility(View.GONE);
                    silyos.setVisibility(View.GONE);
                    silyi.setVisibility(View.GONE);
                    silyu.setVisibility(View.GONE);
                    silyus.setVisibility(View.GONE);

                    ImageView sonidobe = (ImageView) findViewById(R.id.yeguas);
                    mpye= MediaPlayer.create(this,R.raw.yegua);
                    sonidobe.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpye.start();

                        }
                    });

                    ImageView sonidobee = (ImageView) findViewById(R.id.yemas);
                    mpyee= MediaPlayer.create(this,R.raw.yema);
                    sonidobee.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpyee.start();

                        }
                    });


                }
                else{
                    silye.setVisibility(View.GONE);
                    silyes.setVisibility(View.GONE);
                }

                break;

            case R.id.yos:
                if(silyo.getVisibility()==View.GONE){
                    silyo.setVisibility(View.VISIBLE);
                    silyos.setVisibility(View.VISIBLE);
                    silya.setVisibility(View.GONE);
                    silyas.setVisibility(View.GONE);
                    silye.setVisibility(View.GONE);
                    silyes.setVisibility(View.GONE);
                    silyi.setVisibility(View.GONE);

                    silyu.setVisibility(View.GONE);
                    silyus.setVisibility(View.GONE);



                    ImageView sonidobo = (ImageView) findViewById(R.id.yoyos);
                    mpyo= MediaPlayer.create(this,R.raw.yoyo);
                    sonidobo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpyo.start();

                        }
                    });

                    ImageView sonidoboo = (ImageView) findViewById(R.id.yogures);
                    mpyoo= MediaPlayer.create(this,R.raw.yogurt);
                    sonidoboo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpyoo.start();

                        }
                    });

                }
                else{
                    silyo.setVisibility(View.GONE);
                    silyos.setVisibility(View.GONE);
                }
                break;

            case R.id.yis:
                if(silyi.getVisibility()==View.GONE){
                    silyi.setVisibility(View.VISIBLE);
                    silyo.setVisibility(View.GONE);
                    silyos.setVisibility(View.GONE);
                    silya.setVisibility(View.GONE);
                    silyas.setVisibility(View.GONE);
                    silye.setVisibility(View.GONE);
                    silyes.setVisibility(View.GONE);
                    silyu.setVisibility(View.GONE);
                    silyus.setVisibility(View.GONE);

                    ImageView sonidobi = (ImageView) findViewById(R.id.yins);
                    mpyi= MediaPlayer.create(this,R.raw.yin);
                    sonidobi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpyi.start();

                        }
                    });





                }
                else{
                    silyi.setVisibility(View.GONE);

                }

                break;

            case R.id.yus:
                if(silyu.getVisibility()==View.GONE){
                    silyu.setVisibility(View.VISIBLE);
                    silyus.setVisibility(View.VISIBLE);
                    silyi.setVisibility(View.GONE);

                    silyo.setVisibility(View.GONE);
                    silyos.setVisibility(View.GONE);
                    silya.setVisibility(View.GONE);
                    silyas.setVisibility(View.GONE);
                    silye.setVisibility(View.GONE);
                    silyes.setVisibility(View.GONE);

                    ImageView sonidobu = (ImageView) findViewById(R.id.yucas);
                    mpyu= MediaPlayer.create(this,R.raw.yuca);
                    sonidobu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpyu.start();

                        }
                    });

                    ImageView sonidobuu = (ImageView) findViewById(R.id.yunques);
                    mpyuu= MediaPlayer.create(this,R.raw.yunque);
                    sonidobuu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            mpyuu.start();

                        }
                    });


                }
                else{
                    silyu.setVisibility(View.GONE);
                    silyus.setVisibility(View.GONE);
                }

                break;
        }

    }
}
