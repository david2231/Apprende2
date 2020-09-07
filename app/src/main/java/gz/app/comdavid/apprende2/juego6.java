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

public class juego6 extends AppCompatActivity {

    TextView txta11,txta22,txta33,txta44,puntajes,incorrecta;
    MediaPlayer mp;
    MediaPlayer mp2;
    ImageView err;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego6);
        Button inicio= (Button) findViewById(R.id.casa_aa6);
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
        err=(ImageView) findViewById(R.id.errores6);
        txta11=(TextView) findViewById(R.id.txta6);
        txta22=(TextView) findViewById(R.id.txtjb6);
        txta33=(TextView) findViewById(R.id.txtjc6);
        txta44=(TextView) findViewById(R.id.target6);
        puntajes=(TextView) findViewById(R.id.puntaje6);
        incorrecta=(TextView) findViewById(R.id.incorrectas6);
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

                    if(view.getId()==R.id.txta6){
                        Utilidades.correctas++;
                        puntajes.setText(Integer.toString(Utilidades.correctas));
                        err.setVisibility(View.GONE);
                        txta44.setText("UÑA");

                        mp.start();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent intent=new Intent(juego6.this,juego7.class);
                                startActivity(intent);
                                overridePendingTransition(R.anim.left_in, R.anim.left_out);

                                finish();
                            }
                        },1000);


                    }else {
                        if (view.getId() == R.id.txtjb6) {
                            Utilidades.incorrectas++;
                            incorrecta.setText(Integer.toString(Utilidades.incorrectas));
                            err.setVisibility(View.VISIBLE);

                            mp2.start();


                        } else if (view.getId() == R.id.txtjc6) {
                            Utilidades.incorrectas++;
                            incorrecta.setText(Integer.toString(Utilidades.incorrectas));

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

