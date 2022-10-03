package com.boomino.test;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.boomino.test.databinding.ActivityMainBindingImpl;
import com.boomino.test.databinding.FragmentSplashBindingImpl;
import com.boomino.test.databinding.FragmentVideoBindingImpl;
import com.boomino.test.databinding.FragmentVideoDetailBindingImpl;
import com.boomino.test.databinding.ItemCategoryBindingImpl;
import com.boomino.test.databinding.ItemLoadingBindingImpl;
import com.boomino.test.databinding.ItemVideoBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTSPLASH = 2;

  private static final int LAYOUT_FRAGMENTVIDEO = 3;

  private static final int LAYOUT_FRAGMENTVIDEODETAIL = 4;

  private static final int LAYOUT_ITEMCATEGORY = 5;

  private static final int LAYOUT_ITEMLOADING = 6;

  private static final int LAYOUT_ITEMVIDEO = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.boomino.test.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.boomino.test.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.boomino.test.R.layout.fragment_video, LAYOUT_FRAGMENTVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.boomino.test.R.layout.fragment_video_detail, LAYOUT_FRAGMENTVIDEODETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.boomino.test.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.boomino.test.R.layout.item_loading, LAYOUT_ITEMLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.boomino.test.R.layout.item_video, LAYOUT_ITEMVIDEO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIDEO: {
          if ("layout/fragment_video_0".equals(tag)) {
            return new FragmentVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_video is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIDEODETAIL: {
          if ("layout/fragment_video_detail_0".equals(tag)) {
            return new FragmentVideoDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_video_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORY: {
          if ("layout/item_category_0".equals(tag)) {
            return new ItemCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLOADING: {
          if ("layout/item_loading_0".equals(tag)) {
            return new ItemLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMVIDEO: {
          if ("layout/item_video_0".equals(tag)) {
            return new ItemVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_video is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.boomino.test.R.layout.activity_main);
      sKeys.put("layout/fragment_splash_0", com.boomino.test.R.layout.fragment_splash);
      sKeys.put("layout/fragment_video_0", com.boomino.test.R.layout.fragment_video);
      sKeys.put("layout/fragment_video_detail_0", com.boomino.test.R.layout.fragment_video_detail);
      sKeys.put("layout/item_category_0", com.boomino.test.R.layout.item_category);
      sKeys.put("layout/item_loading_0", com.boomino.test.R.layout.item_loading);
      sKeys.put("layout/item_video_0", com.boomino.test.R.layout.item_video);
    }
  }
}
