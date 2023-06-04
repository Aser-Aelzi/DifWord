package com.example.dw;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class End extends AppCompatActivity {
    Button den, fraid, mira, gladis, las;
    Integer cnt1;
    TextView cout, txt, end, en;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle arguments = getIntent().getExtras();
        Integer cnt = arguments.getInt("cnt");
        cnt1 = cnt;
        if(cnt1 != 0){
            cnt1++;
        }
        String name = arguments.getString("name");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        cout = (TextView) findViewById(R.id.cout);
        txt = (TextView) findViewById(R.id.txt);
        end =(TextView)findViewById(R.id.end);
        en =(TextView)findViewById(R.id.end3);
        den = (Button) findViewById(R.id.de);
        fraid = (Button) findViewById(R.id.fr);
        mira = (Button) findViewById(R.id.mi);
        gladis = (Button) findViewById(R.id.gl);
        las = (Button) findViewById(R.id.la);

        end.setVisibility(View.INVISIBLE);
        en.setVisibility(View.INVISIBLE);
        den.setVisibility(View.INVISIBLE);
        fraid.setVisibility(View.INVISIBLE);
        mira.setVisibility(View.INVISIBLE);
        gladis.setVisibility(View.INVISIBLE);
        las.setVisibility(View.INVISIBLE);
        if (cnt1 != 0){
            txt.setText("Вы прошли квест и"  + " заработали звезд: "+ cnt.toString() + " из максимальных трёх, и можете потратить их на просмотр истории персонажей");
            den.setVisibility(View.VISIBLE);
            fraid.setVisibility(View.VISIBLE);
            mira.setVisibility(View.VISIBLE);
            gladis.setVisibility(View.VISIBLE);
            las.setVisibility(View.VISIBLE);
            View.OnClickListener listener=new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    switch(v.getId()){
                        case R.id.de: cout.setText("После событий DifWord Дэн вернулся к своей семье.Он понял, что лидер - это не просто звание, это поведие и поступки: не важно как тебя называют, важно то как ты себя ведешь.");
                            cnt1--;
                            Integer a = cnt1 - 1;
                            txt.setText("У Вас" + " осталось: " + a.toString() + " из максимальных трёх, и можете потратить их на просмотр истории персонажей.");
                            if (a == 0){
                                txt.setText("Нажмите на любую кнопку, чтобы завершить игру.");
                            }
                            if (cnt1 == 0){
                                en.setVisibility(View.VISIBLE);
                                cout.setVisibility(View.INVISIBLE);
                                // cout.setText("     Спасибо за игру");
                                den.setVisibility(View.INVISIBLE);
                                fraid.setVisibility(View.INVISIBLE);
                                mira.setVisibility(View.INVISIBLE);
                                gladis.setVisibility(View.INVISIBLE);
                                las.setVisibility(View.INVISIBLE);
                                txt.setVisibility(View.INVISIBLE);
                                end.setVisibility(View.VISIBLE);
                            } break;
                        case R.id.fr:cout.setText("После событий DifWord Фрайд стал лучше понимать простые вещи: любовь. ненависть, месть, дружбу и другие. Поэтому его народ признал демона, как своего короля.");
                            cnt1--;
                            Integer a1 = cnt1 - 1;
                            txt.setText("У Вас" + " осталось: " + a1.toString() + " из максимальных трёх, и можете потратить их на просмотр истории персонажей");
                            if (a1 == 0){
                                txt.setText("Нажмите на любую кнопку, чтобы завершить игру.");
                            }
                            if (cnt1 == 0){
                                en.setVisibility(View.VISIBLE);
                                cout.setVisibility(View.INVISIBLE);
                                // cout.setText("     Спасибо за игру");
                                den.setVisibility(View.INVISIBLE);
                                fraid.setVisibility(View.INVISIBLE);
                                mira.setVisibility(View.INVISIBLE);
                                gladis.setVisibility(View.INVISIBLE);
                                las.setVisibility(View.INVISIBLE);
                                txt.setVisibility(View.INVISIBLE);
                                end.setVisibility(View.VISIBLE);
                            } break;
                        case R.id.mi: cout.setText("После событий DifWord Мира находит общий язык с родителями и договаривается с женихом. Она понимает, что нельзя всегда поступать как хочестся, иногда стоит подумать о других.");
                            cnt1--;
                            Integer a2 = cnt1 - 1;
                            txt.setText("У Вас" + " осталось: " + a2.toString() + " из максимальных трёх, и можете потратить их на просмотр истории персонажей");
                            if (a2 == 0){
                                txt.setText("Нажмите на любую кнопку, чтобы завершить игру.");
                            }
                            if (cnt1 == 0){
                                en.setVisibility(View.VISIBLE);
                                cout.setVisibility(View.INVISIBLE);
                                // cout.setText("     Спасибо за игру");
                                den.setVisibility(View.INVISIBLE);
                                fraid.setVisibility(View.INVISIBLE);
                                mira.setVisibility(View.INVISIBLE);
                                gladis.setVisibility(View.INVISIBLE);
                                las.setVisibility(View.INVISIBLE);
                                txt.setVisibility(View.INVISIBLE);
                                end.setVisibility(View.VISIBLE);
                            } break;
                        case R.id.gl: cout.setText("После событий DifWord Глэди становиться боллее мягкой королевой. Она понимает, что не стоит быть такой холодной и требовательной по отношению к другим.");                            cnt1--;
                            Integer a3 = cnt1 - 1;
                            txt.setText("У Вас" + " осталось: " + a3.toString() + " из максимальных трёх, и можете потратить их на просмотр истории персонажей");
                            if (a3 == 0){
                                txt.setText("Нажмите на любую кнопку, чтобы завершить игру.");
                            }
                            if (cnt1 == 0){
                                en.setVisibility(View.VISIBLE);
                                cout.setVisibility(View.INVISIBLE);
                                // cout.setText("     Спасибо за игру");
                                den.setVisibility(View.INVISIBLE);
                                fraid.setVisibility(View.INVISIBLE);
                                mira.setVisibility(View.INVISIBLE);
                                gladis.setVisibility(View.INVISIBLE);
                                las.setVisibility(View.INVISIBLE);
                                txt.setVisibility(View.INVISIBLE);
                                end.setVisibility(View.VISIBLE);
                            } break;
                        case R.id.la: cout.setText("После событий DifWord Лас смог отпустить прошлое, в котором он потерял все: родителей, младшего брата, друзей и родину. Он учиться жить по-новому.");
                            cnt1--;
                            Integer a4 = cnt1 - 1;
                            txt.setText("У Вас" + " осталось: " + a4.toString() + " из максимальных трёх, и можете потратить их на просмотр истории персонажей");
                            if (a4 == 0){
                                txt.setText("Нажмите на любую кнопку, чтобы завершить игру.");
                            }
                            if (cnt1 == 0){
                                en.setVisibility(View.VISIBLE);
                                cout.setVisibility(View.INVISIBLE);
                               // cout.setText("     Спасибо за игру");
                                den.setVisibility(View.INVISIBLE);
                                fraid.setVisibility(View.INVISIBLE);
                                mira.setVisibility(View.INVISIBLE);
                                gladis.setVisibility(View.INVISIBLE);
                                las.setVisibility(View.INVISIBLE);
                                txt.setVisibility(View.INVISIBLE);
                                end.setVisibility(View.VISIBLE);
                            }
                            break;
                    }
                }
            };
            den.setOnClickListener(listener);
            fraid.setOnClickListener(listener);
            mira.setOnClickListener(listener);
            gladis.setOnClickListener(listener);
            las.setOnClickListener(listener);

        }
        if(cnt == 0) {
            end.setVisibility(View.VISIBLE);
            en.setVisibility(View.VISIBLE);
        }
    }
}