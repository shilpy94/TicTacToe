package com.example.shilpysamaddar.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     TextView tbl00,tbl01,tbl02,tbl10,tbl11,tbl12,tbl20,tbl21,tbl22;
    Button replay;
     boolean x=true,o=false;
     int tble[][]=new int[3][3];
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent=new Intent(this, WinnnerLayout.class);
        initializeViews();
    }

    private void initializeViews() {
        tbl00=(TextView) findViewById(R.id.tbl00);
        tbl00.setOnClickListener(this);
        tbl01=(TextView) findViewById(R.id.tbl01);
        tbl01.setOnClickListener(this);
        tbl02=(TextView) findViewById(R.id.tbl02);
        tbl02.setOnClickListener(this);
        tbl10=(TextView) findViewById(R.id.tbl10);
        tbl10.setOnClickListener(this);
        tbl11=(TextView) findViewById(R.id.tbl11);
        tbl11.setOnClickListener(this);
        tbl12=(TextView) findViewById(R.id.tbl12);
        tbl12.setOnClickListener(this);
        tbl20=(TextView) findViewById(R.id.tbl20);
        tbl20.setOnClickListener(this);
        tbl21=(TextView) findViewById(R.id.tbl21);
        tbl21.setOnClickListener(this);
        tbl22=(TextView) findViewById(R.id.tbl22);
        tbl22.setOnClickListener(this);
        replay=(Button) findViewById(R.id.replay);
        replay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tbl00:
                if(x){
                tbl00.setText("X");
                tble[0][0]=1;
                    checkWinner();
                    x=false;
                    o=true;
                    break;
            } if(o){
                tbl00.setText("0");
                tble[0][0]=2;
                checkWinner();
                x=true;
                o=false;
                break;
            }

            case R.id.tbl01:
                if(x){
                    tbl01.setText("X");
                    tble[0][1]=1;
                    checkWinner();
                    x=false;
                    o=true;
                    break;
                } if(o){
                tbl01.setText("0");
                tble[0][1]=2;
                checkWinner();
                x=true;
                o=false;
                break;
            }
            case R.id.tbl02:
                if(x){
                    tbl02.setText("X");
                    tble[0][2]=1;
                    checkWinner();
                    x=false;
                    o=true;
                    break;
                } if(o){
                tbl02.setText("0");
                tble[0][2]=2;
                checkWinner();
                x=true;
                o=false;
                break;
            }
            case R.id.tbl10:
                if(x){
                    tbl10.setText("X");
                    tble[1][0]=1;
                    checkWinner();
                    x=false;
                    o=true;
                    break;
                } if(o){
                tbl10.setText("0");
                tble[1][0]=2;
                checkWinner();
                x=true;
                o=false;
                break;
            }
            case R.id.tbl11:
                if(x){
                    tbl11.setText("X");
                    tble[1][1]=1;
                    checkWinner();
                    x=false;
                    o=true;
                    break;
                } if(o){
                tbl11.setText("0");
                tble[1][1]=2;
                checkWinner();
                x=true;
                o=false;
                break;
            }
            case R.id.tbl12:
                if(x){
                    tbl12.setText("X");
                    tble[1][2]=1;
                    checkWinner();
                    x=false;
                    o=true;
                    break;
                } if(o){
                tbl12.setText("0");
                tble[1][2]=2;
                checkWinner();
                x=true;
                o=false;
                break;
            }
            case R.id.tbl20:
                if(x){
                    tbl20.setText("X");
                    tble[2][0]=1;
                    checkWinner();
                    x=false;
                    o=true;
                    break;
                } if(o){
                tbl20.setText("0");
                tble[2][0]=2;
                checkWinner();
                x=true;
                o=false;
                break;
            }
            case R.id.tbl21:
                if(x){
                    tbl21.setText("X");
                    tble[2][1]=1;
                    checkWinner();
                    x=false;
                    o=true;
                    break;
                } if(o){
                tbl21.setText("0");
                tble[2][1]=2;
                checkWinner();
                x=true;
                o=false;
                break;
            }
            case R.id.tbl22:
                if(x){
                    tbl22.setText("X");
                    tble[2][2]=1;
                    checkWinner();
                    x=false;
                    o=true;
                    break;
                } if(o){
                tbl22.setText("0");
                tble[2][2]=2;
                checkWinner();
                x=true;
                o=false;
                break;
            }
                case R.id.replay: startGame();
                    break;
        }

    }

    private void checkWinner() {

//        check horizontal
        for(int i=0; i<=2; i++){
                if(tble[i][0]==1 && tble[i][1]==1 && tble[i][2]==1){
                    startGame();
                    intent.putExtra("text", "Player X");
                    startActivity(intent);
                }
                if(tble[i][0]==2 && tble[i][1]==2 && tble[i][2]==2){
                    startGame();
                    intent.putExtra("text", "Player 0");
                    startActivity(intent);
                }
        }
//       check vertical
        for(int i=0; i<=2; i++){
            if(tble[0][i]==1 && tble[1][i]==1 && tble[2][i]==1){
                startGame();
                intent.putExtra("text", "Player X");
                startActivity(intent);
            }
            if(tble[0][i]==2 && tble[1][i]==2 && tble[2][i]==2){
                startGame();
                intent.putExtra("text", "Player 0");
                startActivity(intent);
            }
        }

//        check diagonal
        if (tble[0][0] == 1 && tble[1][1] == 1 && tble[2][2] == 1)
        {
            startGame();
            intent.putExtra("text", "Player X");
            startActivity(intent);
        }
        if (tble[0][0] == 2 && tble[1][1] == 2 && tble[2][2] == 2)
        {
            startGame();
            intent.putExtra("text", "Player 0");
            startActivity(intent);
        }
        if (tble[0][2] == 1 && tble[1][1] == 1 && tble[2][0] == 1)
        {
            startGame();
            intent.putExtra("text", "Player X");
            startActivity(intent);
        }
        if (tble[0][2] == 2 && tble[1][1] == 2 && tble[2][0] == 2)
        {
            startGame();
            intent.putExtra("text", "Player 0");
            startActivity(intent);
        }
    }

    private void startGame() {
        tbl00.setText(" ");
        tbl01.setText(" ");
        tbl02.setText(" ");
        tbl10.setText(" ");
        tbl11.setText(" ");
        tbl12.setText(" ");
        tbl20.setText(" ");
        tbl21.setText(" ");
        tbl22.setText(" ");
        for (int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                tble[i][j]=0;
            }
        }

    }
}
