package com.example.myapplication.ui.linkliste;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class LinklisteFragment extends Fragment {

    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    ImageButton b4;
    ImageButton b5;
    ImageButton b6;
    ImageButton b7;
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_linkliste, container, false);

        b1 = v.findViewById(R.id.mdl_btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://moodle.dhbw-mannheim.de/login/index.php");
            }
        });

        b2 = v.findViewById(R.id.mail_btn);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://studgate.dhbw-mannheim.de/zimbra/");
            }
        });

        b3 = v.findViewById(R.id.mensa_btn);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://www.stw-ma.de/speiseplan_mensaria_metropol.html");
            }
        });

        b4 = v.findViewById(R.id.anp_btn);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://www.mannheim.dhbw.de/dhbw-mannheim/ansprechpersonen/alle");
            }
        });

        b5 = v.findViewById(R.id.grade_btn);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://dualis.dhbw.de/");
            }
        });

        b6 = v.findViewById(R.id.dcs_btn);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://www.mannheim.dhbw.de/service/dokumente/");
            }
        });

        b7 = v.findViewById(R.id.cmp_btn);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://www.campuspoint.de/");
            }
        });
        return v;
    }


    public void clicked_btn(String url){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


}
