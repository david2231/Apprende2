package gz.app.comdavid.apprende2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class abc_j extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc_j);

        Button inicio= (Button) findViewById(R.id.casa_j);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                mp.stop();
                finish();
            }
        });
        Button next= (Button) findViewById(R.id.siguiente_j);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),abc_k.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                mp.stop();
                finish();
            }
        });


        Button back= (Button) findViewById(R.id.anterioir_j);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),abc_i.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp.stop();
                finish();
            }
        });

        Button sonidoa = (Button)findViewById(R.id.sonido_j);
        mp= MediaPlayer.create(this,R.raw.sonidoj);
        sonidoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });


        ImageView sonidoaa = (ImageView) findViewById(R.id.imageView2);
        mp= MediaPlayer.create(this,R.raw.sonidoj);
        sonidoaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}
