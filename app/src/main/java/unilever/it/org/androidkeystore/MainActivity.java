package unilever.it.org.androidkeystore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import timber.log.Timber;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.plant(new Timber.DebugTree());

        String value = "database password";

        String encryptedValue = EncryptionUtils.encrypt(this, value);

        Log.d(TAG, "onCreate enc: "+encryptedValue);
        String decryptedValue = EncryptionUtils.decrypt(this, encryptedValue);

        Log.d(TAG, "onCreate dec: "+decryptedValue);
    }
}
