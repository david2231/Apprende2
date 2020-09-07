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

import gz.app.comdavid.apprende2.clases.vo.Utilidades;

public class juego99 extends AppCompatActivity {


    TextView txta11,txta22,txta33,txta44,puntajes,incorrecta;
    MediaPlayer mp;
    MediaPlayer mp2;
    ImageView err;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego99);

        Button inicio= (Button) findViewById(R.id.casa_aa99);
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
        err=(ImageView) findViewById(R.id.errores99);
        txta11=(TextView) findViewById(R.id.txta99);
        txta22=(TextView) findViewById(R.id.txtjb99);
        txta33=(TextView) findViewById(R.id.txtjc99);
        txta44=(TextView) findViewById(R.id.target99);
        puntajes=(TextView) findViewById(R.id.puntaje10);
        incorrecta=(TextView) findViewById(R.id.incorrectas10);
        txta11.setOnLongClickListener(longClickListener);
        txta22.setOnLongClickListener(longClickListener);
        txta33.setOnLongClickListener(longClickListener);
        txta44.setOnDragListener(dragListenre);
        puntajes.setText(Integer.toString(Utilidades.correctas));
        incorrecta.setText(Integer.toString(Utilidades.incorrectas));

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

                    if(view.getId()==R.id.txta99){
                        Utilidades.incorrectas++;
                        incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                        err.setVisibility(View.VISIBLE);
                        mp2.start();

                    }else {
                        if (view.getId() == R.id.txtjb99) {
                            Utilidades.incorrectas++;
                            incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                            err.setVisibility(View.VISIBLE);

                            mp2.start();


                        } else if (view.getId() == R.id.txtjc99) {
                            Utilidades.correctas++;
                            puntajes.setText(Integer.toString(Utilidades.correctas));
                            err.setVisibility(View.GONE);
                            txta44.setText("IMÁN");

                            mp.start();
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    Intent intent=new Intent(juego99.this,juegos.class);
                                    startActivity(intent);
                                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                                    finish();

                                }
                            },1000);

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


