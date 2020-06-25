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

public class juego2 extends AppCompatActivity {

    TextView txta1,txta2,txta3,txta4;
    MediaPlayer mp;
    MediaPlayer mp2;
    ImageView err;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego2);

        Button inicio= (Button) findViewById(R.id.casa_aa2);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),juegos.class);
                startActivityForResult(intent,0);
                overridePendingTransition(R.anim.right_in, R.anim.right_out);
                mp.stop();
                mp2.stop();
                finish();
            }
        });

        mp= MediaPlayer.create(this,R.raw.bien);
        mp2= MediaPlayer.create(this,R.raw.mal);
        err=(ImageView) findViewById(R.id.errores2);



        txta1=(TextView) findViewById(R.id.txta6);
        txta2=(TextView) findViewById(R.id.txtjb6);
        txta3=(TextView) findViewById(R.id.txtjc2);
        txta4=(TextView) findViewById(R.id.target2);
        txta1.setOnLongClickListener(longClickListener);
        txta2.setOnLongClickListener(longClickListener);
        txta3.setOnLongClickListener(longClickListener);
        txta4.setOnDragListener(dragListenre);

    }

    View.OnLongClickListener longClickListener=new View.OnLongClickListener(){

        @Override
        public boolean onLongClick(View v){
            ClipData data=ClipData.newPlainText("","");
            View.DragShadowBuilder myShadwoBuilder=new View.DragShadowBuilder(v);
            v.startDrag(data,myShadwoBuilder,v,0);
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

                    if(view.getId()==R.id.txta6){

                        err.setVisibility(View.VISIBLE);

                        mp2.start();


                    }else {
                        if (view.getId() == R.id.txtjb6) {
                            err.setVisibility(View.GONE);
                            txta4.setText("ESCUELA");

                            mp.start();
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    Intent intent=new Intent(juego2.this,juego3.class);
                                    startActivity(intent);
                                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                                    finish();



                                }
                            },4000);

                        } else if (view.getId() == R.id.txtjc2) {

                            err.setVisibility(View.VISIBLE);
                            mp2.start();
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
