package cn.wittyneko.device_info;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDeviceInfo();
    }

    private void getDeviceInfo() {
        log("ID", Build.ID);
        log("DISPLAY", Build.DISPLAY);
        log("PRODUCT", Build.PRODUCT);
        log("DEVICE", Build.DEVICE);
        log("BOARD ", Build.BOARD );
        log("CPU_ABI", Build.CPU_ABI);
        log("CPU_ABI2", Build.CPU_ABI2);
        log("MANUFACTURER ", Build.MANUFACTURER );
        log("BRAND ", Build.BRAND  );
        log("MODEL", Build.MODEL);
        log("BOOTLOADER ", Build.BOOTLOADER );
        log("RADIO ", Build.RADIO );
        log("HARDWARE ", Build.HARDWARE );
        //log("IS_EMULATOR", Build.IS_EMULATOR);
        log("SERIAL ", Build.SERIAL );
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            log("SUPPORTED_ABIS", Build.SUPPORTED_ABIS);
            log("SUPPORTED_32_BIT_ABIS ", Build.SUPPORTED_32_BIT_ABIS );
            log("SUPPORTED_64_BIT_ABIS ", Build.SUPPORTED_64_BIT_ABIS  );
        }
        log("INCREMENTAL", Build.VERSION.INCREMENTAL );
        log("RELEASE", Build.VERSION.RELEASE);
        log("BASE_OS ", Build.VERSION.BASE_OS );
        log("SECURITY_PATCH ", Build.VERSION.SECURITY_PATCH );
        log("SDK ", Build.VERSION.SDK );
        log("SDK_INT ", Build.VERSION.SDK_INT  + "");
        log("PREVIEW_SDK_INT ", Build.VERSION.PREVIEW_SDK_INT  + "");
        log("CODENAME", Build.VERSION.CODENAME);
        //log("CODENAME", Build.VERSION.ALL_CODENAMES);
        //log("ACTIVE_CODENAMES ", Build.VERSION.ACTIVE_CODENAMES );
        //log("RESOURCES_SDK_INT", Build.VERSION.RESOURCES_SDK_INT );
        log("TYPE", Build.TYPE);
        log("TAGS", Build.TAGS);
        log("FINGERPRINT ", Build.FINGERPRINT );
        log("TIME", Build.TIME + "" );
        log("USER ", Build.USER  );
        log("HOST ", Build.HOST );
        //log("IS_DEBUGGABLE ", Build.IS_DEBUGGABLE );
        //log("PERMISSIONS_REVIEW_REQUIRED ", Build.PERMISSIONS_REVIEW_REQUIRED );
    }

    private void log(String name, String info) {
        Log.e("info", name + ", "  + info);
    }

    private void log(String name, String[] info) {
        String pint = "";
        for (String i : info){
            pint = pint +  "" + i;
        }
        Log.e("info", name + ", "  + pint);
    }
}
