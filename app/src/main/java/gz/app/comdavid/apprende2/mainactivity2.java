package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;

import java.io.IOException;

public class mainactivity2 extends AppCompatActivity {
    Switch switchingles;
    ImageButton silencio;
    Button silbos;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity2);
        silbos=(Button) findViewById(R.id.sonidoing);
        silencio=(ImageButton) findViewById(R.id.sonidooing);

        mp= MediaPlayer.create(this,R.raw.sonidoingles);

        Button sonidoa = (Button)findViewById(R.id.sonidoing);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    mp.stop();
                    mp.prepare();
                    mp.seekTo(0);
                    silbos.setVisibility(View.INVISIBLE);
                    silencio.setVisibility(View.VISIBLE);
                }
                catch(IOException e){

                    e.printStackTrace();
                }


            }
        });
        ImageButton sonidob = (ImageButton)findViewById(R.id.sonidooing);
        sonidob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                silbos.setVisibility(View.VISIBLE);
                silencio.setVisibility(View.INVISIBLE);


            }
        });
        Button regresar= (Button) findViewById(R.id.backing);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(mainactivity2.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp.stop();
            }
        });

        Button pal= (Button) findViewById(R.id.palabraing);
        pal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),read1.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.left_out);
                mp.stop();
                finish();
            }
        });

        switchingles =(Switch) findViewById(R.id.switch1ing);
        switchingles.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){


                if(switchingles.isEnabled()){



                    Intent intent=new Intent(v.getContext(),MainActivity.class);
                    startActivityForResult(intent,0);

                    mp.stop();
                    finish();

                }


            }
        });

    }
}
