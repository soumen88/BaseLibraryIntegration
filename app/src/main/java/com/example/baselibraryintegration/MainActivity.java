package com.example.baselibraryintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import nvest.com.nvestlibrary.NvestHelper;
import nvest.com.nvestlibrary.Property;
import nvest.com.nvestlibrary.nvestDatabaseAccess.NvestAssetDatabaseAccess;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startLibActivity();
    }



    private void startLibActivity(){
        NvestHelper nvestHelper = new NvestHelper(this);
        nvestHelper.set(Property.POLICY_HOLDER_NAME, "Purshottam Thakkar");
        nvestHelper.set(Property.POLICY_HOLDER_DOB, "24 Jul 1980");
        nvestHelper.set(Property.POLICY_HOLDER_GENDER, "Female");
        nvestHelper.set(Property.POLICY_HOLDER_SMOKING_STATUS, "No");
        nvestHelper.set(Property.AGE_PROOF_ANNOTATION, "Leaving Certificate");
        nvestHelper.set(Property.POLICY_HOLDER_EMAIL, "tano88@yahoo.com");
        nvestHelper.set(Property.POLICY_HOLDER_MOBILE, "8169938807");
        nvestHelper.set(Property.PROPOSER_NAME, "PurshottamDad Thakkar");
        nvestHelper.set(Property.PROPOSER_DOB, "20 Jan 1992");
        nvestHelper.set(Property.PROPOSER_EMAIL, "test@gmail.com");
        nvestHelper.set(Property.PROPOSER_MOBILE, "9773097566");
        nvestHelper.set(Property.PROPOSER_RELATION, "Brother");
        nvestHelper.set(Property.START_ALL_PRODUCTS_ANNOTATION, "false");
        nvestHelper.set(Property.ELGIBLE_SA, "500000");
        nvestHelper.set(Property.FILTER_POS_PRODUCTS, "false");
        nvestHelper.set(Property.FILTER_ULIP_PRODUCTS, "false");
        nvestHelper.set(Property.FILTER_COMBO_PRODUCTS, "false");
        nvestHelper.set(Property.REFERENCE_NUMBER, "1235");
        nvestHelper.set(Property.AGENT_TYPE, "CT");
        nvestHelper.start();
    }

    static {
        //System.loadLibrary("hello-jni");
        System.loadLibrary("sqliteX");
        //System.loadLibrary("hello-jni");
    }

}
