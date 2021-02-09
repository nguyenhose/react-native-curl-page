
package com.reactlibrarypagecurl;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import android.app.Activity;
import karacken.curl.PageCurlAdapter;
import karacken.curl.PageSurfaceView;

public class RNReactNativePageCurlModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private PageSurfaceView pageSurfaceView;

  public RNReactNativePageCurlModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  public void addPage() {
    final Activity activity = getCurrentActivity();
    pageSurfaceView = new PageSurfaceView(reactContext);
    String[] asset_res_array=null;
    asset_res_array=  new String[]{"page1.png", "page2.png", "page3.png"};
    PageCurlAdapter pageCurlAdapter=new PageCurlAdapter(asset_res_array);
    pageSurfaceView.setPageCurlAdapter(pageCurlAdapter);
    activity.setContentView(pageSurfaceView);
  }

  public void nextPage() {

  }

  @Override
  public String getName() {
    return "RNReactNativePageCurl";
  }
}