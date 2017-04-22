package com.lxluxo23.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button a1,a2,a3,b1,b2,b3,c1,c2,c3;
    private Button [] ArrButton;
    Object [] [] matriz1;
    boolean turno;

    public void init(){


        matriz1 = new Object[3][3];

        for (int i=0;i<3;i++){


            for (int j=0;j<3;j++){

            matriz1 [i] [j] =R.drawable.o;


            }

        }



        turno = true;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        a1 =(Button) findViewById(R.id.a1);
        a2 =(Button) findViewById(R.id.a2);
        a3 =(Button) findViewById(R.id.a3);
        b1 =(Button) findViewById(R.id.b1);
        b2 =(Button) findViewById(R.id.b2);
        b3 =(Button) findViewById(R.id.b3);
        c1 =(Button) findViewById(R.id.c1);
        c2 =(Button) findViewById(R.id.c2);
        c3 =(Button) findViewById(R.id.c3);
        this.init();
        ArrButton = new Button[]{a1,a2,a3,b1,b2,b3,c1,c2,c3};
        for (Button b: ArrButton){




            b.setOnClickListener(this);
        }




    }

    @Override
    public void onClick (View v){
        Button b = (Button)v;
        this.click(b);

    }
    public void click(Button b){


        int x=0;
        if (turno){

        x=R.drawable.x;
        b.setBackgroundResource(x);

        }

        else{

            x=R.drawable.o;
            b.setBackgroundResource(x);


        }

        switch (b.getId()){

            case R.id.a1:
                matriz1[0] [0] =x;
                break;
            case R.id.a2:
                matriz1[0] [1] =x;
                break;
            case R.id.a3:
                matriz1[0] [2] =x;
                break;
            case R.id.b1:
                matriz1[1] [0] =x;
                break;
            case R.id.b2:
                matriz1[1] [1] =x;
                break;
            case R.id.b3:
                matriz1[1] [2] =x;
                break;
            case R.id.c1:
                matriz1[2] [0] =x;
                break;
            case R.id.c2:
                matriz1[2] [1] =x;
                break;
            case R.id.c3:
                matriz1[2] [2] =x;
                break;

        }
        turno=!turno;
        b.setClickable(true);
    }

}
