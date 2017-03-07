package lab.college.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by dell on 2/18/2017.
 */
public class Contact extends Activity
{

    GridView calcObj = null;

    int [] input = new int[]{1,2,3,4,5,6,7,8,9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        calcObj = (GridView) findViewById(R.id.calc);

        ArrayAdapter adap = new ArrayAdapter()
        calcObj.se
        Intent intobj = getIntent();

        String input = intobj.getStringExtra("input");

        Toast.makeText(this,input,Toast.LENGTH_LONG).show();

    }
}
