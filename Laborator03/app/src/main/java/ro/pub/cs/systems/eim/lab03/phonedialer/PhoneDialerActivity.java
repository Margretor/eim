package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;

public class PhoneDialerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);

        ArrayList<Button> numButs = new ArrayList<>();

        for (int i =0; i < 13; i++) {
            final Button tempBut = findViewById(R.id.dial_num_but);
            if (i < 10) {
                tempBut.setText(Integer.toString(i));
            } else if ( i == 11) {
                tempBut.setText("*");
            } else if ( i == 12) {
                tempBut.setText("#");
            }
            View.OnClickListener buttonListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText editText = findViewById(R.id.phone_view);
                    editText.append(tempBut.getText());
                }
            };

            tempBut.setOnClickListener(buttonListener);
            numButs.add(tempBut);
        }

        ImageButton call = findViewById();


        ImageButton endCall;
        ImageButton backspace;



    }
}
