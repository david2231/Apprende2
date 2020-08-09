package gz.app.comdavid.apprende2.ABC_Drawable;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import gz.app.comdavid.apprende2.R;
import gz.app.comdavid.apprende2.escribirr3_1;

public class Drawable_letter_nn_ extends AppCompatActivity implements Main_drawable.DrawFinishListener {
    MediaPlayer mp,mp2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escribirr2);
        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);

        Button inicio= (Button) findViewById(R.id.botoncasaesc);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),escribirinicio.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();

            }
        });
        button = (Button)findViewById(R.id.botonreset);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent=new Intent(Drawable_letter_nn_.this, Drawable_letter_nn_.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_in);



                    }
                },10);

            }
        });

        LinearLayout llMain = (LinearLayout) findViewById(R.id.llMain);


        int drawable = R.drawable.letra1nn;
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), drawable);
        Main_drawable image = new Main_drawable(this, bitmap);
        image.setImageBitmap(bitmap);
        llMain.addView(image);
    }





    @Override
    public void onDrawFinish() {
        Toast.makeText(getApplicationContext(), "Finalizado", Toast.LENGTH_LONG).show();
        mp.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(Drawable_letter_nn_.this, Drawable_letter_oo.class);
                startActivity(intent);

                finish();

            }
        },1000);
    }

    @Override
    public void onDrawStop() {
        Log.i("Action: ", "Draw stop");
    }

    @Override
    public void onDrawStart() {
        Log.i("Action: ", "Draw start");
    }


}

