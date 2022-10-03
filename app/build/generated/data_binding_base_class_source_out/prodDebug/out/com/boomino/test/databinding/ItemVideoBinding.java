// Generated by data binding compiler. Do not edit!
package com.boomino.test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.boomino.test.R;
import com.boomino.test.presentation.BaseImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemVideoBinding extends ViewDataBinding {
  @NonNull
  public final BaseImageView ivPic;

  @NonNull
  public final LinearLayout parentVideo;

  @NonNull
  public final AppCompatTextView tvTitle;

  protected ItemVideoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      BaseImageView ivPic, LinearLayout parentVideo, AppCompatTextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivPic = ivPic;
    this.parentVideo = parentVideo;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static ItemVideoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_video, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemVideoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemVideoBinding>inflateInternal(inflater, R.layout.item_video, root, attachToRoot, component);
  }

  @NonNull
  public static ItemVideoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_video, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemVideoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemVideoBinding>inflateInternal(inflater, R.layout.item_video, null, false, component);
  }

  public static ItemVideoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemVideoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemVideoBinding)bind(component, view, R.layout.item_video);
  }
}
