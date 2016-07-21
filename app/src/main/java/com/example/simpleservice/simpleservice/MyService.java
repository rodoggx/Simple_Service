package com.example.simpleservice.simpleservice;

        import android.app.Service;
        import android.content.Intent;
        import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("We are in the onCreate of the Service");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
