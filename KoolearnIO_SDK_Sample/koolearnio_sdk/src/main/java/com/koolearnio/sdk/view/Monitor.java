package com.koolearnio.sdk.view;

import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.koolearnio.sdk.KDUtils;
import com.koolearnio.sdk.KooDataSDK;

import java.util.ArrayList;

/**
 * Created by leixun on 17/5/2.
 */

public class Monitor {
    static final String TAG = Monitor.class.getSimpleName();
    public static void onViewClick(View view){
        Log.d(TAG, System.currentTimeMillis()+"");
         ArrayList<TextView> textViews = KDUtils.filterViewsToSet(new Class[] {TextView.class},
                 KooDataSDK.getInstance().getViewFecther().getAllViews(false));
        int size = textViews.size();
        for (int i = 0 ; i< size;i++){
            Log.d(Monitor.class.getSimpleName(),textViews.get(i).getText()+"");
        }
        Log.d(TAG, System.currentTimeMillis()+"");
        ArrayList<KDView> kdViews = KooDataSDK.getInstance().getViewFecther().getAllViewsWithId(false);
        int length = kdViews.size();
        for (int i = 0 ;i < length ;i++){
            View kdView = kdViews.get(i).getmView();
            if(kdView.getClass().getSimpleName().equals("TextView")){
                TextView tv = (TextView)kdView;
                String name = "";
                try{
                    name =  tv.getResources().getResourceName(tv.getId());
                }catch (Resources.NotFoundException e){

                }

                if(name!=null && name.length()>0){
                    Log.d(Monitor.class.getSimpleName(),kdViews.get(i).getViewPath()+" "+((TextView)kdViews.get(i).getmView()).getText()+" name: "+name);
                }else{
                    Log.d(Monitor.class.getSimpleName(),kdViews.get(i).getViewPath()+" "+((TextView)kdViews.get(i).getmView()).getText());
                }
            }else{
                Log.d(Monitor.class.getSimpleName(),kdViews.get(i).getViewPath()+"");
            }
        }
        Log.d(TAG, System.currentTimeMillis()+"");
    }

}
