package gz.app.comdavid.apprende2;

import android.content.ClipData;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class juego extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4;
    MediaPlayer mp,mp2,mp3;

    ImageView err;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        mp3= MediaPlayer.create(this,R.raw.audiojuego);
        mp3.start();

        Button inicio= (Button) findViewById(R.id.casa_aa1);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegos.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp.stop();
                mp2.stop();
                mp3.stop();
                finish();
            }
        });


        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        err=(ImageView) findViewById(R.id.errores);



        txt1=(TextView) findViewById(R.id.txta1);
        txt2=(TextView) findViewById(R.id.txtjb1);
        txt3=(TextView) findViewById(R.id.txt1);
        txt4=(TextView) findViewById(R.id.target);
        txt1.setOnLongClickListener(longClickListener);
        txt2.setOnLongClickListener(longClickListener);
        txt3.setOnLongClickListener(longClickListener);
        txt4.setOnDragListener(dragListenre);

    }

    View.OnLongClickListener longClickListener=new View.OnLongClickListener(){

        @Override
        public boolean onLongClick(View v){
            ClipData data=ClipData.newPlainText("","");
            View.DragShadowBuilder myShadwoBuilder=new View.DragShadowBuilder(v);
            v.startDrag(data,myShadwoBuilder,v,0);
            mp3.stop();

            return true;


        }
    };

    View.OnDragListener dragListenre=new View.OnDragListener(){

        @Override
        public boolean onDrag(View v, DragEvent event){
            int dragEvent=event.getAction();

            switch (dragEvent){

                case DragEvent.ACTION_DRAG_ENTERED:
                    final View view=(View) event.getLocalState();

                    if(view.getId()==R.id.txta1){
                        err.setVisibility(View.GONE);
                        txt4.setText("AVIÓN");

                        mp.start();
                        mp3.stop();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                int puntaje=1;
                                String puntajes=String.valueOf(puntaje);
                                Intent intent = new Intent(juego.this, juego2.class);
                                intent.putExtra("jugador",puntajes);
                                startActivity(intent);
                                overridePendingTransition(R.anim.left_in, R.anim.left_out);


                            }
                        },4000);

                    }else {
                        if (view.getId() == R.id.txtjb1) {




                            err.setVisibility(View.VISIBLE);
                            mp2.start();
                            mp3.stop();

                        } else if (view.getId() == R.id.txt1) {

                            err.setVisibility(View.VISIBLE);
                            mp2.start();
                            mp3.stop();
                        }
                    }


                    break;

                case DragEvent.ACTION_DRAG_EXITED:

                    break;

                case DragEvent.ACTION_DROP:

                    break;

            }
            return true;


        }
    };

}
