package net.androidbootcamp.finalappdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MakePayment_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_payment);
        s3 = (Spinner) findViewById(R.id.spinner3);
    }

    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.region_list, android.R.layout.simple_spinner_item);
    //this specifies how the list appears, in this case a drop down list{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_payment_);
    }
}
