package lab.college.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    TextView label = null;

    ImageButton button = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        label= (TextView) findViewById(R.id.textView);
        label.setText(R.string.app_name);
        button =(ImageButton) findViewById(R.id.imageButton);
        button.setOnClickListener(this);
    }


    public void onClick(View v)
    {

        if(v == button)
        {
            Intent intentobj = new Intent(this, Contact.class);
            intentobj.putExtra("input", "lab");
            startActivity(intentobj);

        }

    }
}
